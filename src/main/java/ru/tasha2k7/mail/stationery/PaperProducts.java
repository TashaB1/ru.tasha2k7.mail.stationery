package ru.tasha2k7.mail.stationery;

public class PaperProducts extends Stationery {

	private String sizePages;
	private int countPages;
	private String colorPaper;

	public PaperProducts(String name, int count, Double price, String producer, String sizePages, int countPages,
			String colorPaper) {
		super(name, count, price, producer);
		this.sizePages = sizePages;
		this.countPages = countPages;
		this.colorPaper = colorPaper;
	}

	public String getColorPaper() {
		return colorPaper;
	}

	public void setColorPaper(String colorPaper) {
		this.colorPaper = colorPaper;
	}

	public String getSizePages() {
		return sizePages;
	}

	public void setSizePages(String sizePages) {
		this.sizePages = sizePages;
	}

	public int getCountPages() {
		return countPages;
	}

	public void setCountPages(int countPages) {
		this.countPages = countPages;
	}

}
