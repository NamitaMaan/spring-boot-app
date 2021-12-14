package com.ibm.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ibm.exception.ErrorResponse;
import com.ibm.exception.IdnotMatchException;
import com.ibm.exception.ProductsNotFoundException;

@RestControllerAdvice
public class ProductsControllerAdvice {

	@ExceptionHandler(ProductsNotFoundException.class)
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public ResponseEntity<ErrorResponse> handleProductsNotFound(ProductsNotFoundException e){
		ErrorResponse response = new ErrorResponse("Products-404", new Date(), "Products not found!");
		return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
	}
	
	@ExceptionHandler(IdnotMatchException.class)
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public ResponseEntity<ErrorResponse> handleProductsNotFound(IdnotMatchException e){
		ErrorResponse response = new ErrorResponse("Products-405", new Date(), "Id does not match!");
		return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
	}
}
