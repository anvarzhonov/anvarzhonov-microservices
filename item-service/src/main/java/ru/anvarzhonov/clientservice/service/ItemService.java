package ru.anvarzhonov.clientservice.service;

import ru.anvarzhonov.clientservice.entity.ItemEntity;
import ru.anvarzhonov.dto.ItemDto;
import ru.anvarzhonov.exception.BusinessException;

import java.util.List;

public interface ItemService {
    List<ItemDto> getClientItems(Integer clientId) throws BusinessException;
}
