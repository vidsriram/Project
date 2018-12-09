package com.niit.frontend.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.backend.model.Supplier;
import com.niit.backend.service.SupplierService;
import com.sun.javafx.collections.MappingChange.Map;

@Controller
public class SupplierController {

	@Autowired
	SupplierService supplierService;
	
	 
	
	@RequestMapping("addSupplierpage")
	public ModelAndView addSupplier( @ModelAttribute("command") Supplier supplier ) {
		 	 
		return new ModelAndView("addSupplier");
	}
	
	@RequestMapping("saveSupplier")
	public ModelAndView saveSuplier(@ModelAttribute("command") Supplier supplier ) {
		supplierService.addSupplier(supplier);
		return new ModelAndView("index");
	}
}
