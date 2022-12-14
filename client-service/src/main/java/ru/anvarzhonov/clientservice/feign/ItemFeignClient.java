package ru.anvarzhonov.clientservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import ru.anvarzhonov.exception.BusinessException;
import ru.anvarzhonov.request.FindClientItemsRequest;
import ru.anvarzhonov.response.FindClientItemsResponse;

/**
 *
 * @author - Anvarzhonov Z.T. IKBO-20-19 on 12.12.2022 - 21:49
 */
@FeignClient(value = "ITEM-SERVICE", url = "http://localhost:9091")
public interface ItemFeignClient {

    @GetMapping(value = "/api/items/findClientItems")
    FindClientItemsResponse findClientItems(FindClientItemsRequest request) throws BusinessException;
}
