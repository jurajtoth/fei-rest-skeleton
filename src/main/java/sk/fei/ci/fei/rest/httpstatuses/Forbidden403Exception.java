package sk.fei.ci.fei.rest.httpstatuses;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception representing HTTP status 403.
 * When thrown in request, application will return 403 HTTP status.
 */
@ResponseStatus(HttpStatus.FORBIDDEN)
public class Forbidden403Exception extends RuntimeException {
    
    public Forbidden403Exception() { }
    
    public Forbidden403Exception(String errorMessage) {
        super(errorMessage);
    }
    
}
