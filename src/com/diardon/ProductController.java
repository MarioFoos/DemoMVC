package com.diardon;

// Controlador
public class ProductController
{
	private SimpleProduct model;
	private ProductView view;

	public ProductController(SimpleProduct model, ProductView view)
	{
		this.model = model;
		this.view = view;
	}
	public void updateView()
	{
		view.displayProduct(model.getName(), model.getPrice());
	}
}
