package com.alessandra.web.model;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.time.LocalDateTime;
public class User {
	private int clicks;
	private LocalDateTime lastDate = null;
	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	private static char[] Symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
	private String Word;
	public User() {
		this.clicks = 0;
	}
	public User(int clicks) {
		this.clicks = clicks;
	}
	public int getClicks() {
		return this.clicks;
	}
	public void addClick() {
		this.clicks++;
	}
	public void setLastDate() {
		this.lastDate = LocalDateTime.now();
	}
	public String getLastDate() {
		return ( lastDate == null ? "never" : dtf.format(lastDate));	
	}
	public void generateWord() {
		Word = "";
		Random random = new Random(System.currentTimeMillis());
		for ( int i = 0; i < 10; i++) {
			Word += Symbols[random.nextInt(36)];
		}
	}
	public String getWord() {
		return this.Word;
	}
}
