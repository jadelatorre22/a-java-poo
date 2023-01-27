package com.pluralcamp.builder;

public class LunchOrderBean {

	//POJO
	private String bread;
	private String condiments;
	private String dressing;
	private String meat;
	
	
	public LunchOrderBean() {
		super();
	}


	
	
	public String getBread() {
		return bread;
	}


	public void setBread(String bread) {
		this.bread = bread;
	}


	public String getCondiments() {
		return condiments;
	}


	public void setCondiments(String condiments) {
		this.condiments = condiments;
	}


	public String getDressing() {
		return dressing;
	}


	public void setDressing(String dressing) {
		this.dressing = dressing;
	}


	public String getMeat() {
		return meat;
	}


	public void setMeat(String meat) {
		this.meat = meat;
	}
	
	
	@Override
	public String toString() {
		String clase = "LunchOrderBean";
		return clase + ": " + this.getBread() + ", " + this.getCondiments() + ", "
				+ this.getDressing() + ", " + this.getMeat();
	}
	
}

