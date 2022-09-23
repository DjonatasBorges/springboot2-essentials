package academy.devdojo.springboot2.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.concurrent.TimeoutException;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends TimeoutException {
    public BadRequestException(String message) {
        super(message);
    }
}
