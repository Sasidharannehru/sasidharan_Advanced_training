package com.sasi.thirdProblemStatment;

public interface MedicalInfo {
	abstract void DisplayLabel();
	
  
    

}
class Tablet implements MedicalInfo{

	@Override
	public void DisplayLabel() {
		// TODO Auto-generated method stub
		System.out.println("stored in a cool dry place");
		
	}
	
}
class Syrup implements  MedicalInfo{

	@Override
	public void DisplayLabel() {
		// TODO Auto-generated method stub
		System.out.println("use only for caugh");
		
	}
	
}
class Ointment implements MedicalInfo{

	@Override
	public void DisplayLabel() {
		// TODO Auto-generated method stub
		System.out.println("External use only");
		
	}
	
}
