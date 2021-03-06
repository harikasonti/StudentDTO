package com.student.app.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonExceptionHandlerClass {
	@ExceptionHandler
	public ResponseEntity<ErrorTemplate> handlerForAgeLimitException(AgeLimitException exp)
	{
		ErrorTemplate template = new ErrorTemplate();
		
		template.setErrorMsg(exp.toString());
		template.setActionType("Student Age Creation/ Updation");
		
		return new ResponseEntity<ErrorTemplate>(template,HttpStatus.BAD_REQUEST);
	}

}
