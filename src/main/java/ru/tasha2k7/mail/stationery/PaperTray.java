package ru.tasha2k7.mail.stationery;

public class PaperTray extends WorkplaceOrganization {
	private String typeTray; // горизонтальный, вертикальный, веер
	private int numberSections;

	public PaperTray(String name, int count, Double price, String producer, String material, String size, String color,
			String typeTray, int numberSections) {
		super(name, count, price, producer, material, size, color);
		this.typeTray = typeTray;
		this.numberSections = numberSections;
	}

	public String getTypeTray() {
		return typeTray;
	}

	public void setTypeTray(String typeTray) {
		this.typeTray = typeTray;
	}

	public int getNumberSections() {
		return numberSections;
	}

	public void setNumberSections(int numberSections) {
		this.numberSections = numberSections;
	}

}
