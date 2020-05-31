package com.alessandra.web.model;

public class Animal {
	private
		String name, breed;
		int weight;
	public Animal() {}
	public Animal(String name, String breed, int weight) {
		this.name = name; this.breed = breed; this.weight = weight;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getBreed() {
		return this.breed;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return this.weight;
	}
}