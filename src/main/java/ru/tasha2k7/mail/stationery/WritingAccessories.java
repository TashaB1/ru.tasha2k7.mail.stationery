package ru.tasha2k7.mail.stationery;

public class WritingAccessories extends Stationery {

	private Double tipThickness; // толщина наконечника
	private String colorInk; // цвет чернил

	public WritingAccessories(String name, int count, Double price, String producer, Double tipThickness,
			String colorInk) {
		super(name, count, price, producer);
		this.tipThickness = tipThickness;
		this.colorInk = colorInk;
	}

	public Double getTipThickness() {
		return tipThickness;
	}

	public void setTipThickness(Double tipThickness) {
		this.tipThickness = tipThickness;
	}

	public String getColorInk() {
		return colorInk;
	}

	public void setColorInk(String colorInk) {
		this.colorInk = colorInk;
	}

}
