package jets;

public abstract class JetsAbstractClass {
	private String model;
	private float speed;
	private double range;
	private double price;

	public JetsAbstractClass(String model, float speed, double range, double price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	@Override
	public String toString() {
		return "model: " + model + ", speed: " + speed + ", range: " + range + ", price: " + price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = range;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
