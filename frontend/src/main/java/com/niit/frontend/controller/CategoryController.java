package com.niit.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.backend.model.Category;
import com.niit.backend.service.CategoryService;

@Controller
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@RequestMapping("categoryPage")
	public ModelAndView addproduct( @ModelAttribute("command") Category category ) {
		 	 
		return new ModelAndView("addCategory");
	}
	
	@RequestMapping("saveCategory")
	public ModelAndView saveCategory(@ModelAttribute("command") Category category ) {
		categoryService.addCategory(category);
		return new ModelAndView("index");
	}

}
