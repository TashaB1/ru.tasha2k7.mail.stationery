package ru.tasha2k7.mail.stationery;

public class WorkplaceOrganization extends Stationery {

	private String material;
	private String Size;
	private String color;

	public WorkplaceOrganization(String name, int count, Double price, String producer, String material, String size,
			String color) {
		super(name, count, price, producer);
		this.material = material;
		Size = size;
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getSize() {
		return Size;
	}

	public void setSize(String size) {
		Size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
