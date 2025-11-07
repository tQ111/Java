class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){

    System.out.println( rollDice() );

    System.out.println( lotto() );

    System.out.println("\nEnter # of Dice Rolls");
    int Ne = Input.readInt();
    System.out.println( diceDistribution(Ne) );


    System.out.println( additionTutor() );


    
  }

  String rollDice(){
    long di1 = Math.round( Math.random( ) * 6 );
    long di2 = Math.round( Math.random( ) * 6 );
    return "Dice 1: " + di1 + "\nDice 2: " + di2;
  }

  String lotto(){
    long str1 = Math.round( Math.random( ) * 48 );
    long str2 = Math.round( Math.random( ) * 48 );
    long str3 = Math.round( Math.random( ) * 48 );
    long str4 = Math.round( Math.random( ) * 48 );
    long str5 = Math.round( Math.random( ) * 48 );
    return "\nYour lotto number is: " + str1 + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
  }

  String diceDistribution(int Ne){
    int one = 0;
    int two = 0;
    int three = 0;
    int four = 0;
    int five = 0;
    int error = 0;

    for(int x=0; x<=Ne; x++){
      long roll = Math.round( Math.random( ) * 6 );
      if(roll == 1){
        one += 1;
      }else if(roll == 2){
        two += 1;
      }else if(roll == 3){
        three += 1;
      }else if(roll == 4){
        four += 1;
      }else if(roll == 5){
        five += 1;
      }else{
        error += 1;
      }
    }

    return "\nAmount of times ( 1 ) was rolled: " + one + "\nAmount of times ( 2 ) was rolled: " + two + 
      "\nAmount of times ( 3 ) was rolled: " + three + "\nAmount of times ( 4 ) was rolled: " + four + 
      "\nAmount of times ( 5 ) was rolled: " + five + "\nErrors: " + error;
  }

  String additionTutor(){
    long first = Math.round( Math.random( ) * 500 );
    long second = Math.round( Math.random( ) * 500 );
    System.out.println("\nYour Equation is: " + first + " + " + second + " = ?");
    int ans = Input.readInt();

    if(ans == (first + second) ){
      return "Correct";
    }else{
      return "Incorrect";
    }
  }


}

/**
 * 

Bonus Challenge:
Write a function mathQuiz that generates and that generates random addition, subtraction, multiplication or division problem of
 two random integers, prompts the user for the answer and returns "Correct!" if the answer is correct, otherwise return "Incorrect". 
 The random integers should range from -100 to 100 (inclusively).

Hint: For the random operations (+,-,*,/) using a random number from 0 to 3 where 0 means +, 1 means -, 2 means * and 3 means /.

 */