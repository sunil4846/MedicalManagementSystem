package com.bridgelabz.medicalManagementStore;

public class Medicine {
	
	enum medicineType{
		AYURVEDIC, ALLOPATHI, HOMOPETHIC;
	}
	
	String name;
	String brandName;
	medicineType type;
	double price;
	
	@Override
	public String toString() {
		return "Medicine [brandName=" + brandName + ", type=" + type + ", price=" + price + "]";
	}
}
