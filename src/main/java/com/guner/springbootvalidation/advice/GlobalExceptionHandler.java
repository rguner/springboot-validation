package com.guner.springbootvalidation.advice;

import com.guner.springbootvalidation.response.ErrorBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorBody> handleValidationExceptions(MethodArgumentNotValidException ex) {
		return ResponseEntity.badRequest().body(new ErrorBody(HttpStatus.BAD_REQUEST.value(), ex.getFieldError().getDefaultMessage()));
	}
}