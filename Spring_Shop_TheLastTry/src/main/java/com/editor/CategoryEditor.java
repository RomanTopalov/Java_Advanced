package com.editor;

import java.beans.PropertyEditorSupport;

import com.service.CategoryService;

public class CategoryEditor extends PropertyEditorSupport{

	private final CategoryService categoryService;

	public CategoryEditor(CategoryService categoryService) {
		super();
		this.categoryService = categoryService;
	}
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		setValue(categoryService.findOne(Integer.parseInt(text)));
	}
	
}
