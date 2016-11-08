package sk.fei.ci.fei.rest.httpstatuses;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class Forbidden403Exception extends RuntimeException {
    
    public Forbidden403Exception() { }
    
    public Forbidden403Exception(String errorMessage) {
        super(errorMessage);
    }
    
}
