package com.bridgelabz.medicalManagementStore;

public class Main {
		
	public void handleUserSelection(int choice) {
		
		MedicalStore medicalStore = new MedicalStore();
		UserInterface userInterface = new UserInterface();
		
		switch(choice) {
			case 1:
				addMedicine();
				break;
			case 2:
				String userSelection = userInterface.selectMedicine();
				Medicine medicine = medicalStore.getMedicine(userSelection);
				medicalStore.remove(medicine);
				break;
			case 3:
				userInterface.print(medicalStore.getMedicalList());
				break;
			case 4:
				break;
			case 5:
				System.exit(0);
				break;
			default:
		}
	}
	
	private void addMedicine() {
		MedicalStore medicalStore = new MedicalStore();
		
		Vicks vicks = new Vicks();
		vicks.price = 15.6;
		ChawayanPrash chawayanPrash = new ChawayanPrash();
		chawayanPrash.price = 120.2;
		BTrim bTrim = new BTrim();
		bTrim.price = 200.3;
		Azythromycin azythromycin = new Azythromycin();
		azythromycin.price = 100;
		Crocin crocin = new Crocin();
		crocin.price = 300;
		
		medicalStore.add(azythromycin);
		medicalStore.add(bTrim);
		medicalStore.add(chawayanPrash);
		medicalStore.add(crocin);
		medicalStore.add(vicks);
	}
	
	public static void main(String[] args) {
		
		UserInterface userInterface = new UserInterface();
		Main main = new Main();
		int choice = userInterface.showMainMenu();
		main.handleUserSelection(choice);
		
		/*		MedicalStore medicalStore = new MedicalStore();
		Vicks vicks = new Vicks();
		vicks.price = 15.6;
		ChawayanPrash chawayanPrash = new ChawayanPrash();
		chawayanPrash.price = 120.2;
		BTrim bTrim = new BTrim();
		bTrim.price = 200.3;
		Azythromycin azythromycin = new Azythromycin();
		azythromycin.price = 100;
		Crocin crocin = new Crocin();
		crocin.price = 300;
		medicalStore.add(azythromycin);
		medicalStore.add(bTrim);
		medicalStore.add(chawayanPrash);
		medicalStore.add(crocin);
		medicalStore.add(vicks);
		
		UserInterface userInterface = new UserInterface();
		userInterface.print(medicalStore.getMedicalList());
		System.out.println("Before Removing");
		System.out.println(medicalStore.getMedicalList());
		medicalStore.remove(azythromycin);
		medicalStore.remove(chawayanPrash);
		
		System.out.println("After Removing");
		System.out.println(medicalStore.getMedicalList()); */

	}

}
