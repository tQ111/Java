class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    double[] pricess = {5.80, 6.70, 6.70, 4.10};
    print("The price is $" + total(pricess));

    int[] inte = {5,6,7,8,9,10};
    int iss = 6;
    print("The number " + iss + " is in the array: " + isin(inte, iss));

    String[] picks = {"234", "274", "834", "959", "102"};
    String[] drawn = {"234", "274", "910", "959", "102"};
    print("There are " + checkLotto(picks,drawn) + " out of 5 matches");

  }



  // Use these functions below for the activity

  String convertToEmoji(String code){
    return String.valueOf(Character.toChars(
                               Integer.parseInt(code, 16)));
  }

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

  boolean isPrime(int n){
    int divisor = 2;
    while(n%divisor !=0){
      divisor+=1;
    }
    if(divisor==n)
      return true;
    else
      return false;
  }

  double total (double[] prices){
    double sum = 0;
    for(int i = 0; i < prices.length; i++){
      sum += prices[i];
    }
    return ( sum * 1.08525 );
  }

  boolean isin(int[] inte, int iss){
    int yes = 0;
    for(int i = 0; i < inte.length; i++){
      if(inte[i] == iss){
        yes += 1;
      }else{
        yes += 0;
      }
    }
    if(yes == 1){
      return true;
    }else{
      return false;
    }
  }

  int checkLotto(String[] picks, String[] drawn){
    int amount = 0;
    for(int i = 0; i < picks.length; i++){
      if(picks[i].equals(drawn[i])){
        amount += 1;
      }else{
        amount += 0;
      }
    }
    return amount;
  }

  

}



/**

Bonus Challenge:

Write a function biggest that accepts an array of integers and returns the 
largest value in the array.

 */