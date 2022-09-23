package academy.devdojo.springboot2.exceptions;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Data
@Getter
@SuperBuilder
public class ExceptionDetails {
    protected LocalDateTime timestamp;
    protected Integer status;
    protected String title;
    protected String details;
    protected String developerMessage;
}
