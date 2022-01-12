package com.javashitang.conf;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

/**
 * @author lilimin
 * @since 2020-07-18
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandlerV2 {

    @SneakyThrows
    @ExceptionHandler(value = Exception.class)
    public String exceptionHandler() {
        return "error";
    }
}
