package ru.tasha2k7.mail.stationery;

public class Paper extends PaperProducts {

	private Double density; // плотность
	private Double thickness;// толщина
	private Double transparency; // непрозрачность в процентах ?Double или int?

	public Paper(String name, int count, Double price, String producer, String sizePages, int countPages,
			String colorPaper, Double density, Double thickness, Double transparency) {
		super(name, count, price, producer, sizePages, countPages, colorPaper);
		this.density = density;
		this.thickness = thickness;
		this.transparency = transparency;
	}

	public Double getDensity() {
		return density;
	}

	public void setDensity(Double density) {
		this.density = density;
	}

	public Double getThickness() {
		return thickness;
	}

	public void setThickness(Double thickness) {
		this.thickness = thickness;
	}

	public Double getTransparency() {
		return transparency;
	}

	public void setTransparency(Double transparency) {
		this.transparency = transparency;
	}

}
