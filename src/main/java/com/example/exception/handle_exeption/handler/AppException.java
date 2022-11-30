package com.example.exception.handle_exeption.handler;

import com.example.exception.handle_exeption.message.Message;

import javax.print.attribute.standard.Severity;

public class AppException extends BaseException {

    public AppException(Message message, Throwable rootCause) {
        super(message, Severity.WARNING, rootCause);
    }

}
