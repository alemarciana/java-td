class Vehicle {
	private int numberOfWheels;
	private String color;
	private String type;
	public Vehicle() {
	}
	public Vehicle(Integer n, String c, String t) {
		numberOfWheels = n;
		color = c;
		type = t;
	}
	// getter
	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	// setter
	public void setNumberOfWheels(int number) {
		numberOfWheels = number;
	}
	
	// getter
	public String getColor() {
		return color;
	}

	// setter
	public void setColor(String col) {
		color = col;
	}

	// getter
	public String getType() {
		return type;
	}

	// setter
	public void setType(String type) {
		this.type = type;
	}
}
