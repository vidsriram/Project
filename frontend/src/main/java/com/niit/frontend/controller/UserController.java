package com.niit.frontend.controller;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.backend.dao.ProductDao;
import com.niit.backend.dao.UserDao;
import com.niit.backend.model.UserRegister;
import com.niit.backend.model.Product;
import com.niit.backend.model.Supplier;
import com.niit.backend.service.UserService;
import com.niit.backend.service.ProductService;
@Controller
public class UserController {
@Autowired
ProductDao productDao;

@Autowired
private UserDao userDao;
@Autowired
UserService userService;
@RequestMapping("Register")
public ModelAndView addUserRegister(@ModelAttribute("userRegister") UserRegister userRegister,Model m)
{
	ModelAndView mv=new ModelAndView("userRegister");
	return mv;
}

@RequestMapping("saveRegister")
public ModelAndView saveRegister(@ModelAttribute("userRegister") UserRegister userRegister,Model m)
{
	userService.save(userRegister);
	return new ModelAndView("index");
}
}
