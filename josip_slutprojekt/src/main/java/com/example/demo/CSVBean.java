package com.example.demo;

public class CSVBean {

	private String orderdate;
	private String region;
	private String lastName;
	private String firstName;
	private String item;
	private String units;
	private String unitCost;
	private String totalCost;
	
	public CSVBean() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}
	public String getOrderdate() {
		return orderdate;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getRegion() {
		return region;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getItem() {
		return item;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	public String getUnits() {
		return units;
	}
	public void setUnitCost(String unitCost) {
		this.unitCost = unitCost;
	}
	public String getUnitCost() {
		return unitCost;
	}
	public void setTotalCost(String totalCost) {
		this.totalCost = totalCost;
	}
	public String getTotalCost() {
		return totalCost;
	}
	
	public String toJason() {
		String pattern = "{\"Orderdate\": \"%s\", \"region\": \"%s\", \"lastname\": \"%s\", \"firstname\": \"%s\", \"item\": \"%s\", \"units\": \"%s\", \"unitcost\": \"%s\", \"totalcost\": \"%s\"}";
		return String.format(pattern, this.orderdate, this.region, this.lastName, this.firstName, this.item, this.units, this.unitCost, this.totalCost);
	}

}
