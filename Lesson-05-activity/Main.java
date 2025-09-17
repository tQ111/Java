class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
    

/*  
    Challenge 1:
    Create two integer variables and Assign values to them. 
    Calculate the sum of the two numbers and store the 
    calculated sum and then display it.
    
*/
   
int num1 = 5;
int num2 = 6;
System.out.println( "The sum of the integers: ");
System.out.println( num1 + num2 );



/*  
    Challenge 2:
    Create three variables to assign three grades and Assign values to each grade. 
    Calculate the sum of the three grades and store the 
    calculated sum and then display it.
    
*/

double gra1 = 87.5;
double gra2 = 97.4;
double gra3 = 96.7;
System.out.println("\nThe sum of the grades:");
System.out.println( gra1 + gra2 + gra3 );


/*  
    Challenge 3:
    Calculate the average from the three grades from challenge 2,
    store the value and then display it.
    Declare and assign values to any new variables
    NOTE: Does it look correct, check with a calculator?
*/

double ans = ( gra1 + gra2 + gra3 ) / 3;
System.out.println("\nThe average of the grades:");
System.out.println( ans );

/*  
    Challenge 4:
    Write the following equation in EQ1.PNG file in Java; store the result and the display it:
    Declare and assign values to any new variables

*/

double x = 5.1;
double A = 6.7;
double y = A/(x+1);
System.out.println( "\nlet x = 5.1" );
System.out.println( "let A = 6.7" );
System.out.println( "y = A/(x+1), y =" );
System.out.println( y );

/*  
    Challenge 5:
    Using the variables same variables from challenge4 above, write the following equation in EQ2.PNG file in Java, store the result and the display it:

    Declare and assign values to any new variables

*/

double anse1 = (2 * x);
double anse2 = (x+1) * (-x/2);
double anse = (anse1 * anse2)/A;
System.out.println( "\n y = [ 2x(x+1)(-x/2) ] / A, y =" );
System.out.println( anse );




/*  
    Challenge 6:
    Create the variables and write the equation in
    file  EQ3.PNG

    Declare and assign values to any new variables
*/
 
double b = 4.2;
double h = 7.5;
double area = (b * h)/2;
System.out.println( "\nlet b = 4.2" );
System.out.println( "let h = 7.5" );
System.out.println( "area = (1/2)(bh), area = " );
System.out.println( area );




/*  
    **** Bonus Challenge ****:
    Create a variable that stores the total number of eggs 
    and assign it 100. We want to fill as many baskets with 
    eggs as we can. Each basket can hold only 12 eggs.

    1) Write the java code that will calcute how many baskets
    of 12 eggs can we fill fully.

    HINT: What do we get when we divide an integer by 
    an integer in Java

    2) Write the java code that will calculate how many eggs
    are left over after we filled as many baskets of 12 eggs.
*/

int eggs = 100;
int bas = eggs/12;
System.out.println("\n100 eggs will fully fill baskets of 12 eggs. baskets = ");
System.out.println( bas );

System.out.println("Eggs left over = ");
int rem = 100%12;
System.out.println( rem );


    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}