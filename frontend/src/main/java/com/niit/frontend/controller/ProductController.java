package com.niit.frontend.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.niit.backend.dao.CategoryDao;
import com.niit.backend.dao.ProductDao;
import com.niit.backend.dao.SupplierDao;
import com.niit.backend.model.Product;
import com.niit.backend.model.Supplier;
import com.niit.backend.service.CategoryService;
import com.niit.backend.service.ProductService;
import com.niit.backend.service.SupplierService;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;

	@Autowired
	SupplierService supplierService;

	@Autowired
	CategoryService categoryService;

	@RequestMapping(value={ "/", "home" })
	public ModelAndView home() {
		return new ModelAndView("index");
	}

	@RequestMapping("addproductpage")
	public ModelAndView addproduct(@ModelAttribute("product") Product product,BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("SupplierList", supplierService.getAllSuppliers());
		model.put("CatagorList", categoryService.getAllCategory());
	    model.put("ProductList", productService.getAllProducts());

		return new ModelAndView("addproduct", model);
	}

	@RequestMapping(value={"saveProduct", "editProduct/saveProduct"})
	public String saveProduct(@ModelAttribute("product") Product product,
			@RequestParam("pimage") MultipartFile filedet, BindingResult result) {
		productService.addproduct(product);

		System.out.println("imagestarted storing");
		String path = "V:\\Project Workspace\\frontend\\src\\main\\webapp\\resources\\images";
		System.out.println("images stored");
		String fileinfo = path + product.productId + ".jpg";
		File f = new File(fileinfo);
		if (!filedet.isEmpty()) {
			try {
				byte buff[] = filedet.getBytes();
				FileOutputStream fos = new FileOutputStream(f);
				BufferedOutputStream bs = new BufferedOutputStream(fos);
				bs.write(buff);

			} catch (Exception e) {

				System.out.println("Exception arised");

			}
		} else {
			System.out.println("file uploading problem");
		}

		return "index";
	}
	
	@RequestMapping("editProduct")
	public ModelAndView editProduct(@ModelAttribute("product") Product product, @RequestParam("productId") int productId, BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
	    model.put("product", productService.getProductById(productId));
	    model.put("SupplierList", supplierService.getAllSuppliers());
		model.put("CatagorList", categoryService.getAllCategory());
	    model.put("ProductList", productService.getAllProducts());
		return new ModelAndView("editProduct", model);
}
//	@RequestMapping("saveProduct")
//	public ModelAndView saveProduct(@ModelAttribute("product") Product product,BindingResult result) {
//		productService.addproduct(product);
//		return new ModelAndView("index");
	//}
	@RequestMapping("deleteProduct")
	public ModelAndView deleteProduct(@ModelAttribute("product") Product product, @RequestParam("productId") int productId) {
		System.out.println("Product id selected for delete operation is " + productId);
		productService.deleteProduct(product);
		return new ModelAndView("index");

		
	}
}
