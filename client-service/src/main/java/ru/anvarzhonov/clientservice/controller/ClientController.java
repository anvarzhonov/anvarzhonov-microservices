package ru.anvarzhonov.clientservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.anvarzhonov.clientservice.dto.ProkatRequest;
import ru.anvarzhonov.clientservice.dto.ProkatResponse;
import ru.anvarzhonov.clientservice.entity.ClientEntity;
import ru.anvarzhonov.clientservice.services.ClientService;
import ru.anvarzhonov.dto.ItemDto;
import ru.anvarzhonov.exception.BusinessException;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;

    @GetMapping("/getRentedItems")
    public List<ItemDto> getRentedItems(Integer clientId) throws BusinessException {
        return clientService.getClientItems(clientId);
    }
}
