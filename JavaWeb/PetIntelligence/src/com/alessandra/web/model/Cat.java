package com.alessandra.web.model;

public class Cat extends Animal implements Pet {
	public Cat() {
		super();
	}
	public Cat(String name, String breed, int weight) {
		super(name, breed, weight);
	}
	public String showAffection() {
		return "Tu gato " + this.getBreed() + " " + this.getName() + " te observa con cariño (al parecer)";
	}
}
