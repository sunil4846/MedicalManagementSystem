package com.bridgelabz.medicalManagementStore;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

	Scanner scanner = new Scanner(System.in);
	
	public void print(ArrayList<Medicine> medicalList) {
		for(Object medicine : medicalList) {
			System.out.println(medicine);
		}
	}
	
	public int showMainMenu() {
		System.out.println("Select: \n1:Add Medicine\n2:Remove Medicine\n3:Print Medicine\n4:Update Medicine\n5:Exit");
		int choice = scanner.nextInt();
		return choice;
	}
	
	public String selectMedicine() {
		System.out.println("Enter the medicine name which you want to delete..");
		String userSelection = scanner.next();
		return userSelection;
		
	}
}
