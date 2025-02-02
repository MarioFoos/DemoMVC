package com.diardon;

public class DemoMVCApp
{
	public static void main(String[] args)
	{
		// Crear modelo y vista
        SimpleProduct product = new SimpleProduct("Laptop", 1500.00);
        ProductView view = new ProductView();
        // Crear controlador que hace de intermediario
        ProductController controlador = new ProductController(product, view);
        // Actualizar vista
        controlador.updateView();
	}
}
