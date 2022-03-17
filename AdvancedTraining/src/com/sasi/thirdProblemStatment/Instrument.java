package com.sasi.thirdProblemStatment;



public abstract class Instrument {
	String[]arr= {"drum","voilin","xylophone","trumput","a"};
	abstract void play();
	public static void main(String[] args) {
		piano Piono=new piano();
		Piono.play();
		
		guitar Guitar=new guitar();
		Guitar.play();
		
		fluete Fluete=new fluete();
		Fluete.play();
		
		
		
	}
	
	

	

	

}
class piano extends Instrument{

	@Override
	void play() {
		System.out.println("piano is playing tan tan tan");
		
		
	}
	
}
class fluete extends Instrument{

	@Override
	void play() {
		System.out.println("flute is playing toot toot");
		
		
	}
	
}
class guitar extends Instrument{

	@Override
	void play() {
		System.out.println(" guitar playing tin tin ");
		
		
	}
	
}
