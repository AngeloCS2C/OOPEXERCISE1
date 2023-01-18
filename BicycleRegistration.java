class BicycleRegistration
{

	public static void main(String[] args){

		Bicycle bike_1, bike_2,bike_3,bike1,bike2;
		String  owner1, owner2,owner3;

	    bike1 = new Bicycle(); //Create and assign Value to Bike1 
		bike1.setOwnerName("Edwin Remegio");

		bike2 = new Bicycle(); //Create and assign Value to Bike2
		bike2.setOwnerName("Elgilyn Remegio");
		
		bike_1 = new Bicycle(); 
		bike_1 .setTagNo("2004-134R");
		bike_2 = new Bicycle(); 
		bike_2 .setTagNo("2004-134R");

		//out the information

		owner1 = bike1.getOwnerName();
		owner2 = bike2.getOwnerName();
		
		String tagno_1=bike_1.getTagNo( );
		String tagno_2=bike_2.getTagNo( );
		
		
		System.out.println(owner1 + " owns the Bicycle");
		System.out.println(tagno_1 + " is the tag number");
		System.out.println("\n" + owner2+" also owns  the Bicycle");
		System.out.println(tagno_2 + " also owns a Bicycle");
        
	}
	}
