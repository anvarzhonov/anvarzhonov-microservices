package ru.anvarzhonov.response;

import lombok.Data;
import ru.anvarzhonov.dto.ItemDto;
import ru.anvarzhonov.exception.Status;

import java.io.Serializable;
import java.util.List;

@Data
public class FindClientItemsResponse implements Serializable {
    private List<ItemDto> items;
    private Status status = Status.success();
}
