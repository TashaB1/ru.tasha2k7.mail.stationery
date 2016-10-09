package ru.tasha2k7.mail.stationery;

public class StationeryAccessories extends Stationery {

	private String material;
	private String color;
	private String quantity; // отличительная характеристика: ширина или длина
								// (мм), объем(мл) или мощность(кол-во листов
								// для степлера и дырокола)

	public StationeryAccessories(String name, int count, Double price, String producer, String material, String color,
			String quantity) {
		super(name, count, price, producer);
		this.material = material;
		this.color = color;
		this.quantity = quantity;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

}
