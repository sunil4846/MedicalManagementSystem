package com.bridgelabz.medicalManagementStore;

import java.util.ArrayList;

public class MedicalStore {
	
	private ArrayList<Medicine> medicalList = new ArrayList<Medicine>();
		
	public ArrayList<Medicine> getMedicalList() {
		return medicalList;
	}

	public void add(Medicine medicine) {
		medicalList.add(medicine);
	}
	
	public void remove(Medicine medicine) {
		medicalList.remove(medicine);
	}
	
	public ArrayList<Medicine> getMedicalStore(){
		return medicalList;
	}
	
	public Medicine getMedicine(String name) {
		for(Medicine medicine : medicalList) {
			if(name.equals(medicine.name)) {
				return medicine;
			}
		}	
		return null;		
	}
/*	public void add(Azythromycin azythromycin) {
		medicalList.add(azythromycin);
	}
	
	public void add(BTrim bTrim) {
		medicalList.add(bTrim);
	}
	
	public void add(ChawayanPrash chawayanPrash) {
		medicalList.add(chawayanPrash);
	}
	
	public void add(Crocin crocin) {
		medicalList.add(crocin);
	}
		
	public void remove(Azythromycin azythromycin) {
		medicalList.remove(azythromycin);
	}
	
	public void remove(Crocin crocin) {
		medicalList.remove(crocin);
	}
	
	public void remove(ChawayanPrash chawayanPrash) {
		medicalList.remove(chawayanPrash);
	}
	
	public void remove(BTrim bTrim) {
		medicalList.remove(bTrim);
	}*/
}
