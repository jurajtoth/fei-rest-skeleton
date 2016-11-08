package sk.fei.ci.fei.rest.httpstatuses;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception representing HTTP status 404.
 * When thrown in request, application will return 404 HTTP status.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFound404Exception extends RuntimeException {
    
    public NotFound404Exception() { }
    
    public NotFound404Exception(String errorMessage) {
        super(errorMessage);
    }
    
}
