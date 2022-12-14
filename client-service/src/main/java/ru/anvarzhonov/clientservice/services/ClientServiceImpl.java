package ru.anvarzhonov.clientservice.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.anvarzhonov.clientservice.entity.ClientEntity;
import ru.anvarzhonov.clientservice.feign.ItemFeignClient;
import ru.anvarzhonov.dto.ItemDto;
import ru.anvarzhonov.exception.BusinessException;
import ru.anvarzhonov.request.FindClientItemsRequest;
import ru.anvarzhonov.response.FindClientItemsResponse;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
    private final ItemFeignClient client;

    @Override
    public ClientEntity searchClient(Integer clientId) {
        return null;
    }

    @Override
    public List<ItemDto> getClientItems(Integer clientId) throws BusinessException {
        var request = new FindClientItemsRequest(clientId);
        FindClientItemsResponse response = client.findClientItems(request);
        return response.getItems();
    }
}
