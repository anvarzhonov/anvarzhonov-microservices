package ru.anvarzhonov.clientservice.mapper;

import org.mapstruct.Mapper;
import ru.anvarzhonov.clientservice.entity.ItemEntity;
import ru.anvarzhonov.dto.ItemDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ItemMapper {
    ItemDto itemEntityToItemDTO(ItemEntity itemEntity);
    List<ItemDto> itemEntitiesToItemDTOs(List<ItemEntity> itemEntities);
}
