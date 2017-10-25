package com.expedia.web.api;

import com.expedia.exceptions.DefaultExceptionAttributes;
import com.expedia.exceptions.ExceptionAttributes;

import com.expedia.exceptions.IllegalArgumentException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * The BaseController class implements common functionality for all Controller
 * classes. The <code>@ExceptionHandler</code> methods provide a consistent
 * response when Exceptions are thrown from <code>@RequestMapping</code>
 * annotated Controller methods.
 * 
 */
public class BaseController {

    /**
     * The Logger for this class.
     */
    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * Handles all Exceptions not addressed by more specific
     * <code>@ExceptionHandler</code> methods. Creates a response with the
     * Exception Attributes in the response body as JSON and a HTTP status code
     * of 500, internal server error.
     * 
     * @param exception An Exception instance.
     * @param request The HttpServletRequest in which the Exception was raised.
     * @return A ResponseEntity containing the Exception Attributes in the body
     *         and a HTTP status code 500.
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, Object>> handleException(
            Exception exception, HttpServletRequest request) {

        return handleException(exception, request , HttpStatus.INTERNAL_SERVER_ERROR);
    }


    @ExceptionHandler(IllegalArgumentException.class )
    public ResponseEntity<Map<String, Object>> exceptionHandlerIllegalArgumentException(Exception exception , HttpServletRequest request) {

        return handleException(exception, request , HttpStatus.CONFLICT);

    }

    private ResponseEntity<Map<String, Object>> handleException(Exception exception , HttpServletRequest request , HttpStatus httpStatus){

        logger.error("> handleException");
        logger.error("- Exception: ", exception.getMessage());

        ExceptionAttributes exceptionAttributes = new DefaultExceptionAttributes();

        Map<String, Object> responseBody = exceptionAttributes
                .getExceptionAttributes(exception, request, httpStatus);

        logger.error("< handleException");

        return new ResponseEntity<Map<String, Object>>(responseBody, httpStatus);
    }
}
