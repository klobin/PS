package com.parkingsys.domain;

public class ParkingData {
	private String vehicle_type;
	private int floor_no;
	private String parking_bay;
	private String vehice_reg_no;
	public String getVehicle_type() {
		return vehicle_type;
	}
	public void setVehicle_type(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}
	public int getFloor_no() {
		return floor_no;
	}
	public void setFloor_no(int floor_no) {
		this.floor_no = floor_no;
	}
	public String getParking_bay() {
		return parking_bay;
	}
	public void setParking_bay(String parking_bay) {
		this.parking_bay = parking_bay;
	}
	public String getVehice_reg_no() {
		return vehice_reg_no;
	}
	public void setVehice_reg_no(String vehice_reg_no) {
		this.vehice_reg_no = vehice_reg_no;
	}
	public ParkingData(String vehicle_type, int floor_no, String parking_bay,
			String vehice_reg_no) {
		super();
		this.vehicle_type = vehicle_type;
		this.floor_no = floor_no;
		this.parking_bay = parking_bay;
		this.vehice_reg_no = vehice_reg_no;
	}
}
