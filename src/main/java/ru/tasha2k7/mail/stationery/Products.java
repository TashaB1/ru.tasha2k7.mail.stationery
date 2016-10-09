package ru.tasha2k7.mail.stationery;

public class Products extends PaperProducts {

	private String sheetType; // ��� �����: � ������, � ��� ... , ������������, ��������������, ����������
	private String bindingType; // ��� ���������
	private String coverColor; // ���� �������

	private boolean adhesiveEdge; // ������� ����
	
	public Products(String name, int count, Double price, String producer, String sizePages, int countPages,
			String colorPaper, String sheetType, String bindingType, String coverColor, boolean adhesiveEdge) {
		super(name, count, price, producer, sizePages, countPages, colorPaper);
		this.sheetType = sheetType;
		this.bindingType = bindingType;
		this.coverColor = coverColor;
		this.adhesiveEdge = adhesiveEdge;
	}

	public String getSheetType() {
		return sheetType;
	}

	public void setSheetType(String sheetType) {
		this.sheetType = sheetType;
	}

	public String getBindingType() {
		return bindingType;
	}

	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}

	public String getCoverColor() {
		return coverColor;
	}

	public void setCoverColor(String coverColor) {
		this.coverColor = coverColor;
	}

	public boolean isAdhesiveEdge() {
		return adhesiveEdge;
	}

	public void setAdhesiveEdge(boolean adhesiveEdge) {
		this.adhesiveEdge = adhesiveEdge;
	}

}
