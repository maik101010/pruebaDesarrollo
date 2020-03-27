package com.security.security.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.security.security.dto.UserDto;
import com.security.security.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping
	public String create(@ModelAttribute("userDto") UserDto userDto, Model model) {
		userService.save(userDto);
		model.addAttribute("users", get());
		return "users";
	}
	@PostMapping("/update")
	public String update(@RequestParam(value = "select") HashMap<String, String> select, final Model model) {
		for (String s : select.keySet()) {
			System.out.println(s);
		}
		return "";
	}

	@GetMapping
	public List<UserDto> get() {
		return userService.get();
	}

}
