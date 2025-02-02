package com.diardon;

// Modelo
public class SimpleProduct
{
	private String name;
	private double price;

	public SimpleProduct(String name, double price)
	{
		this.name = name;
		this.price = price;
	}
	public String getName()
	{
		return name;
	}
	public double getPrice()
	{
		return price;
	}
}
