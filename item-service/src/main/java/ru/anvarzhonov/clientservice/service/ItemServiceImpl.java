package ru.anvarzhonov.clientservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.anvarzhonov.clientservice.entity.ItemEntity;
import ru.anvarzhonov.clientservice.mapper.ItemMapper;
import ru.anvarzhonov.clientservice.repository.ItemRepository;
import ru.anvarzhonov.dto.ItemDto;
import ru.anvarzhonov.exception.BusinessException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {
    private final ItemRepository repository;
    private final ItemMapper mapper;
    @Override
    public List<ItemDto> getClientItems(Integer clientId) throws BusinessException {
        List<ItemEntity> itemEntities = repository.findByClientId(clientId);
        if (itemEntities.isEmpty()) {
            throw new BusinessException(String.format("У клиента с id : %s не найдено ни одной арендовой вещи", clientId));
        }

        return mapper.itemEntitiesToItemDTOs(itemEntities);
    }

}
