package com.vpfeifer.urlShort.controllers.advices;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.vpfeifer.urlShort.exceptions.ShortUrlNotFoundException;

@ControllerAdvice
class EmployeeNotFoundAdvice {

	@ResponseBody
	@ExceptionHandler(ShortUrlNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String shortUrlNotFoundHandler(ShortUrlNotFoundException ex) {
		return ex.getMessage();
	}
}