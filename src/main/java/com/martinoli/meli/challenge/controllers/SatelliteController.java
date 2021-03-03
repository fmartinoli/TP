package com.martinoli.meli.challenge.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SatelliteController {
	
	@GetMapping("/satellite")
	public String getSatellite(){
		return "nombre1";
	}	
	
	
	
}
