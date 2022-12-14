package ru.anvarzhonov.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Status {
    private int statusCode;
    private String messageStatus;

    public static Status success() {
        return new Status(0, "Успешно.");
    }

    public static Status error(int code, String message) {
        return new Status(code, message);
    }

}
