package sk.fei.ci.fei.rest.httpstatuses;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFound404Exception extends RuntimeException {
    
    public NotFound404Exception() { }
    
    public NotFound404Exception(String errorMessage) {
        super(errorMessage);
    }
    
}
