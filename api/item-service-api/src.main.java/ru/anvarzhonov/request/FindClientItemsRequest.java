package ru.anvarzhonov.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class FindClientItemsRequest implements Serializable {
    private final Integer clientId;
}
