
class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
/*  
    Challenge 1:
    1) Create the variables, ask the user for the variable values, write the equation in file EQ1-act6 and display the equation value.
*/

System.out.println("#1");
System.out.println("Enter x value");
double x = Input.readDouble();
double ans1 = Math.pow(x, 7);
System.out.println("y = " +ans1);

/*  
    Challenge 2:
    1) Create the variables, ask the user for the variable values, write the equation in fileEQ1.1-act6 and display the equation value.
*/

System.out.println("\n#2");
System.out.println("Enter z value");
double z = Input.readDouble();
double ans2 = Math.pow(z, 3) + 5;
System.out.println("q = " +ans2);

/*  
    Challenge 3:
    Create the variables, ask the user for the variable values, write the equation in file EQ2-act6 and display the equation value..
    
*/

System.out.println("\n#3");
System.out.println("Enter t value");
double t = Input.readDouble();
System.out.println("Enter r value");
double r = Input.readDouble();
double ans3 = ( Math.pow(t, 5) ) * ( Math.pow(r+2, 4) );
System.out.println("s = " +ans3);

/*  
    Challenge 4:
    Create the variables, ask the user for the variable values, write the equation in file EQ3-act6 and display the equation value..
    
*/

System.out.println("\n#4");
System.out.println("Enter A value");
double A = Input.readDouble();
System.out.println("Enter B value");
double B = Input.readDouble();
double ans4 = Math.sqrt(A+B);
System.out.println("C = " +ans4);

/*  
    Challenge 5:
    Create the variables, ask the user for the variable values, write the equation in file EQ4-act6 and display the equation value..
    
*/

System.out.println("\n#5");
System.out.println("Enter x1 value");
double x1 = Input.readDouble();
System.out.println("Enter x2 value");
double x2 = Input.readDouble();
System.out.println("Enter y1 value");
double y1 = Input.readDouble();
System.out.println("Enter y2 value");
double y2 = Input.readDouble();
double ans5 = Math.sqrt( (Math.pow(x2-x1, 2) ) + ( Math.pow(y2-y1, 2) ) );
System.out.println("d = " +ans5);


/*  
    Challenge 6:
    Create the variables, ask the user for the variable values, write the equation g=sin(deg) and display the equation value..
    
*/

System.out.println("\n#6");
System.out.println("Enter degree value");
double deg = Input.readDouble();
double ans6 = Math.sin(deg);
System.out.println("g = " +ans6);


/*  
    Challenge 7:
    Create the variables, ask the user for the variable values, write the equation in file EQ5-act6 and display the equation value.
    
*/

System.out.println("\n#7");
System.out.println("Enter m value");
double m = Input.readDouble();
System.out.println("Enter n value");
double n = Input.readDouble();
double ans7 = ( Math.pow(m,5) ) / ( Math.sqrt(n+1) );
System.out.println("k = " +ans7);


/*  
    *** Bonus Challenge ***:
    Create the variables, ask the user for the variable values, write the equation in file Ch-act6 and display the equation value.

    HINT: What does the "plus minus: after "-b" mean.
*/

System.out.println("\nBonus:");
System.out.println("Enter a value");
double a = Input.readDouble();
System.out.println("Enter b value");
double b = Input.readDouble();
System.out.println("Enter c value");
double c = Input.readDouble();
double anse1 = ( (b*-1) + (Math.sqrt( (Math.pow(b,2)) - (4*a*c) ) ) ) / (2*a);
double anse2 = ( (b*-1) - (Math.sqrt( (Math.pow(b,2)) - (4*a*c) ) ) ) / (2*a);
System.out.println("x has two answers: ");
System.out.println("x = " +anse1 );
System.out.println("x = " +anse2 );




    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}