package com.softserve.homeproject.util.exception;
import org.springframework.http.HttpStatus;

public class NotFoundException extends ApplicationException {
    public static final String NOT_FOUND_EXCEPTION = "exception.common.notFound";

    //  http://stackoverflow.com/a/22358422/548473
    public NotFoundException(String arg) {
        super(ErrorType.DATA_NOT_FOUND, NOT_FOUND_EXCEPTION, HttpStatus.UNPROCESSABLE_ENTITY, arg);
    }
}