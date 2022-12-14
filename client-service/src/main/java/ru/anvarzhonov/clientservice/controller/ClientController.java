package ru.anvarzhonov.clientservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.anvarzhonov.clientservice.dto.ProkatRequest;
import ru.anvarzhonov.clientservice.dto.ProkatResponse;
import ru.anvarzhonov.clientservice.entity.ClientEntity;
import ru.anvarzhonov.clientservice.services.ClientService;

@RestController
@RequestMapping("/api/clients")
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;
    private final ProductFeignClient productClient;
    @PostMapping("/toProkat")
    public ProkatResponse getProkat(ProkatRequest request) {
        var response = new ProkatResponse();
        ClientEntity clientEntity = clientService.searchClient(request.getClientId());

    }
}
