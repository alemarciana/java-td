package com.alessandra.web.models;
import java.util.Random;

public class User {
	private Integer number, guess;
	private int minNumber = 1;
	private int maxNumber = 100;
	private int success = -2; // 0 if guess is correct, -1 if it's too low, 1 if it's too high, 2 if user ran out of tries
	private int tries;
	private int score;
	public User() {
		generateNumber();
		tries = 0;
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
	public void generateNumber() {
		Random random = new Random(System.currentTimeMillis());
		number = random.nextInt((maxNumber - minNumber) +1) + minNumber;
	}
	public void setSuccess(int success) {
		this.success = success;
	}
	public int getSuccess() {
		return success;
	}
	public void resetTries() {
		tries = 0;
	}
	public void incTries() {
		tries++;
	}
	public int getTries() {
		return tries;
	}
	public void nullifyGuess() {
		guess = null;
	}
	public void incScore() {
		score++;
	}
	public int getScore() {
		return score;
	}
}
