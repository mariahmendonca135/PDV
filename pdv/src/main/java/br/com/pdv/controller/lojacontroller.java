package br.com.pdv.controller;

import javax.swing.Spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class lojacontroller {
	@GetMapping({"/lojas"})
	public String home(String usename){
	
		return "lojas";
	}
}
