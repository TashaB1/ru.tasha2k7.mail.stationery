package ru.tasha2k7.mail.stationery;

public class Stationery {

	private String name;
	private int count;
	private Double price;
	private String producer; // производитель
	
	public Stationery(String name, int count, Double price, String producer) {
		super();
		this.name = name;
		this.count = count;
		this.price = price;
		this.producer = producer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}
	
	

}
