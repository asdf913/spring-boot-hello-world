package io.github.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorlController {

	@GetMapping(path = "/")
	public String index() {
		return "index";
	}

}