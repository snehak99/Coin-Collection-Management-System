package com.sneha.demos;

import java.io.Serializable;

public class Coin implements Serializable{

	String country;
	String denomination;
	int yearOfMinting;
	int currentValue;
	String acquiredDate;
	
	public Coin() {
		// TODO Auto-generated constructor stub
	}
	
	public Coin(String v1, String v2, int v3, int v4, String v5)
	{
		country = v1;
		denomination = v2;
		yearOfMinting = v3;
		currentValue = v4;
		acquiredDate = v5;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDenomination() {
		return denomination;
	}

	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}

	public int getYearOfMinting() {
		return yearOfMinting;
	}

	public void setYearOfMinting(int yearOfMinting) {
		this.yearOfMinting = yearOfMinting;
	}

	public int getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(int currentValue) {
		this.currentValue = currentValue;
	}

	public String getAcquiredDate() {
		return acquiredDate;
	}

	public void setAcquiredDate(String acquiredDate) {
		this.acquiredDate = acquiredDate;
	}

	public void Display() 
	{
		System.out.println("------------------------------------------------");
		System.out.println("\nCountry Name \t\t: " + country);
		System.out.println("Denomination \t\t: " + denomination);
		System.out.println("Year Of Minting \t: " + yearOfMinting);
		System.out.println("Current Value of Coin \t: " + currentValue + " INR");
		System.out.println("Aquired Date Of Coin \t: " + acquiredDate + "\n");
		System.out.println("------------------------------------------------\n");
	}
}
