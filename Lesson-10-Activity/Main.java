
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
		System.out.println("Enter GPA");
		double value = Input.readDouble();
		System.out.println("Your GPA is " + gpa(value) );

		System.out.println("\nEnter Grade Level (9-12)");
		int grade = Input.readInt();
		System.out.println("Enter Amount of Credits");
		double credits = Input.readDouble();
		if( isGraduating(grade, credits) == true){
			System.out.println("Student is Graduating");
		}else{
			System.out.println("Student is NOT Graduating");
		}

		System.out.println("\nEnter Weight (lbs)");
		double weight = Input.readDouble();
		System.out.println("Enter Height (in)");
		double height = Input.readDouble();
		System.out.println("You are " + BMI(weight, height));

		System.out.println("\nEnter Shipping Weight (lbs)");
		double weightLbs = Input.readDouble();
		System.out.println("The shipping cost is $" + shippingCost(weightLbs) );

		System.out.println("\nEnter Frequency (THz)");
		double THz = Input.readDouble();
		if(blueOrViolet(THz) == true){
			System.out.println("Your color is blue/violet");
		}else{
			System.out.println("Your color is NOT blue/violet");
		}
  	}

	double gpa(double value){
  		if(value > 90){
    		return value * 1.1;
  		}else{
    	return value;
  		}
	}

	boolean isGraduating(int grade, double credits){
  		if(grade == 12 && credits >= 44){
    			return true;
  		}else{
    			return false;
  		}
	}

	String BMI(double weight, double height){
  		double uBMI = ( weight / Math.pow(height, 2) ) * 703;
  		if(uBMI <= 18.4){
    		return "Underweight";
  		}else if(uBMI >= 18.5 && uBMI <= 24.9){
    		return "Normal";
  		}else if(uBMI >= 25.0 && uBMI <= 39.9){
    		return "Overweight";
 		}else if(uBMI >= 40){
    		return "Obese";
  		}else{
			return "error";
		}
	}


double shippingCost(double weightLbs){
	if(weightLbs <= 10){
		return 0.00;
	}else if(weightLbs > 10 && weightLbs <= 15){
		return 5.00;
	}else if(weightLbs > 15 && weightLbs <= 25){
		return 10.00;
	}else if(weightLbs > 25){
		return 10 + ( ( weightLbs -  25) * 0.02 );
	}else{
		return 123456789;
	}
}

boolean blueOrViolet(double THz){
	if( (THz >= 600 && THz <= 670) || (THz >= 700 && THz <= 750) ){
		return true;
	}else{
		return false;
	}
}
 
  
}