package com.parkingsystem.domain;

public class AddFloor {
	
	AddFloor(){
		
	}
	private int no_Bikes;
	private int no_Cars;
	private int no_Hvs;

	public int getNo_Bikes() {
		return no_Bikes;
	}
	public void setNo_Bikes(int no_Bikes) {
		this.no_Bikes = no_Bikes;
	}
	public int getNo_Cars() {
		return no_Cars;
	}
	public void setNo_Cars(int no_Cars) {
		this.no_Cars = no_Cars;
	}
	public int getNo_Hvs() {
		return no_Hvs;
	}
	public void setNo_Hvs(int no_Hvs) {
		this.no_Hvs = no_Hvs;
	}
	
	public AddFloor(int no_Bikes, int no_Cars, int no_Hvs) {
		super();
		this.no_Bikes = no_Bikes;
		this.no_Cars = no_Cars;
		this.no_Hvs = no_Hvs;
	}
}
