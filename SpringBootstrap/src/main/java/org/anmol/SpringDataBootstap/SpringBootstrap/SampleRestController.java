package org.anmol.SpringDataBootstap.SpringBootstrap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {

	@GetMapping("/")
	public String hello(){
		return "Hello World";
	}
}
