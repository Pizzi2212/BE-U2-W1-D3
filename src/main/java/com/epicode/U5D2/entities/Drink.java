package com.epicode.U5D2.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Drink extends Item {
	private String name;

	public Drink(String name, int calories, double price) {
		super(calories, price);
		this.name = name;
	}



	@Override
	public String toString() {
		return "Drink{" +
				"name='" + name + '\'' +
				", calories=" + calories +
				", price=" + price +
				'}';
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
