package ru.anvarzhonov.clientservice.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.anvarzhonov.clientservice.ItemServiceApplication;
import ru.anvarzhonov.clientservice.service.ItemService;
import ru.anvarzhonov.dto.ItemDto;
import ru.anvarzhonov.exception.BusinessException;
import ru.anvarzhonov.exception.Status;
import ru.anvarzhonov.request.FindClientItemsRequest;
import ru.anvarzhonov.response.FindClientItemsResponse;

import java.util.List;

@RestController
@RequestMapping("/api/items")
@RequiredArgsConstructor
@Slf4j
public class ItemController {
    private final ItemService service;

    @GetMapping("/findClientItems")
    public FindClientItemsResponse findClientItems(FindClientItemsRequest request) {
        var response = new FindClientItemsResponse();
        try {
            var items = service.getClientItems(request.getClientId());
            response.setItems(items);
        } catch (BusinessException e) {
            log.error(e.getMessage(), e);
            response.setStatus(Status.error(-1, e.getMessage()));
        }
        return response;
    }
}