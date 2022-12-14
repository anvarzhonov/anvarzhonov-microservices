package ru.anvarzhonov.clientservice.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import ru.anvarzhonov.exception.BusinessException;

@ControllerAdvice
public class ItemsNotFoundHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    protected ResponseEntity<String> handleBusinessException(BusinessException ex) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(ex.getMessage());
    }
}
