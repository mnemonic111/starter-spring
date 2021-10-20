package com.example.demoadd.controller;

import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import starter.Saludo;

@Controller
public class ControllerIndex {
	
	@Autowired Saludo s;
	
	@GetMapping("/saludo")
	public ResponseEntity<String> getSaludo() {
		System.out.println("mensaje:"+s.mensajeSaludo());
		return new ResponseEntity<String>(HttpStatus.OK).ok(s.mensajeSaludo());
	}

}
