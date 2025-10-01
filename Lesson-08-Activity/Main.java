class Main {

	public static void main(String[] args) {
    	
	}

	void print(String s){
    System.out.println(s);
  }

  double FtoC(double tempF){
    return ( tempF - 32 )*5.0/9.0;
  }

  double sphereVolume(double radius){
    return ( 4/3.*Math.PI ) * Math.pow( radius, 3 );
    
  }
  
  double coneVolume(double radius,double height){
	  return 1.0/3.0 * ( height * Math.PI * Math.pow(radius, 2) );
  
  }

  
  void init(){

    System.out.println( "Enter word" );
    String name = Input.readString();
    print( "Your word is " + name );

    System.out.println( "Enter temperature (farenhiet)" );
    double tempF = Input.readDouble();
    print("\n" + tempF + "F = " + FtoC(tempF) + "C");

    System.out.println("Enter the radius of the sphere ");
    double radi= Input.readDouble();
    print( "\nVolume of sphere= " + sphereVolume(radi) );

    System.out.println("Enter radius");
    radi= Input.readDouble();
    System.out.println( "Enter height" );
    double height = Input.readDouble();
    print( "\nVolume of cone= " + coneVolume(radi,height) );

  }
}

 
