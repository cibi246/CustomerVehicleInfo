package com.manicibi.vehicle.model;

public class CustomerInfo {

	private int id;
	private String name;
	private String address;
	private String vin;
	private String regNo;
	private String status;
	
	public CustomerInfo() {
		super();
	}

	public CustomerInfo(int id, String name, String address, String vin, String regNo, String status) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.vin = vin;
		this.regNo = regNo;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "CustomerInfo [id=" + id + ", name=" + name + ", address=" + address + ", vin=" + vin + ", regNo="
				+ regNo + ", status=" + status + "]";
	}
	
	
	
}
