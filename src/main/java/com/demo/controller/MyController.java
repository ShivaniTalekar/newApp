package com.demo.controller;

import java.util.Random;

import javax.sql.DataSource;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.main.myApp;
import com.demo.model.Users;
import com.demo.model.UsersDAO;

@Controller
public class MyController {

//	@Autowired
//	UsersDAO dao;
//	@Autowired
//	private DataSource dataSource;

	@RequestMapping("/userform")
	public String showform(@Valid @ModelAttribute("aNewUSer") Users users, BindingResult result) { // any errors in
																									// validation, we'll
																									// access in
																									// BindingResult
																									// object

		if (result.hasErrors()) {
			System.out.println("Form has Errors");
			return "createAccount";
		}
		System.out.println("Form Validated");

		System.out.println(users.getUser_id() + " " + users.getUsername() + " " + users.getPassword());
		
		return "accountCreated";
	}

	@RequestMapping(value = "/save")
	public String getRandomQuote(@ModelAttribute ("users") Users users,Model model) {
		System.out.println("inside validation");
		System.out.println(users.getUsername());
		System.out.println(users.getPassword());
		String username=users.getUsername();
		String password=users.getPassword();
		System.out.println(username);
		System.out.println(password);
		model.addAttribute("username", username);
		String finalpage="";
		
		System.out.println("Calling main fromController");
		myApp m=new myApp();
		String res=myApp.main(new String[] {username,password});
		System.out.println("received result from main");
		
		if (res.equals("validuser")) {
			finalpage="/validuser";
		}
		else {
			finalpage="/invaliduser";
		}
//		if (res.equals("invaliduser")) {
//			finalpage= "/invaliduser";
//			
//		}
		
		if (res.equals("invalidpassword")) {
			finalpage= "/invalidpassword";
		}
		return finalpage;
		
	}

}