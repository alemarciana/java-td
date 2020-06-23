package com.alessandra.web.models;
import java.util.Random;

public class User {
	private Integer number, guess;
	private int minNumber = 1;
	private int maxNumber = 100;
	private int success = -2; // 0 if guess is correct, -1 if it's too low, 1 if it's too high
	public User() {
		number = generateNumber();
	}
	public int getMinNumber() {
		return minNumber;
	}
	public void setMinNumber(int minNumber) {
		this.minNumber = minNumber;
	}
	public int getMaxNumber() {
		return maxNumber;
	}
	public void setMaxNumber(int maxNumber) {
		this.maxNumber = maxNumber;
	}
	public Integer getGuess() {
		return this.guess;
	}
	public void setGuess(int guess) {
		this.guess = guess;
	}
	public void setNumber(int num) {
		this.number = num;
	}
	public Integer getNumber() {
		return this.number;
	}
	public int generateNumber() {
		Random random = new Random(System.currentTimeMillis());
		return random.nextInt((maxNumber - minNumber) +1) + minNumber;
	}
	public void setSuccess(int success) {
		this.success = success;
	}
	public int getSuccess() {
		return success;
	}
}
