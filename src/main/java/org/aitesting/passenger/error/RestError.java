package org.aitesting.passenger.error;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.internal.engine.path.PathImpl;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

import javax.validation.ConstraintViolation;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

@Data
class RestError {

    private HttpStatus status;
    private LocalDateTime timeStamp;
    private String message;
    private String debugMsg;
    private List<String> errors;

    private RestError(){
        timeStamp = LocalDateTime.now();
    }

    RestError(HttpStatus status){
        this();
        this.status = status;
    }

    RestError(HttpStatus status, Throwable ex){
        this.status = status;
        this.debugMsg = ex.getLocalizedMessage();
    }

    RestError(HttpStatus status, String message, Throwable ex){
        this.status = status;
        this.message = message;
        this.debugMsg = ex.getLocalizedMessage();
    }

    RestError(HttpStatus status, String message, List<String> errors) {
        this();
        this.status = status;
        this.message = message;
        this.errors = errors;
    }

    RestError(HttpStatus status, String message, String errors) {
        this();
        this.status = status;
        this.message = message;
        this.errors = Arrays.asList(errors);
    }

}
