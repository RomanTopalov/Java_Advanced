package com.editor;

import java.beans.PropertyEditorSupport;

import com.service.ProductService;



public class ProductEditor  extends PropertyEditorSupport{
	private final ProductService productService;


	public ProductEditor(ProductService productService) {
		super();
		this.productService = productService;
	}


	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		setValue(productService.findOne(Integer.parseInt(text)));
	}
	 
}
