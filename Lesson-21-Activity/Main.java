class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    System.out.println("\nIt takes a doubling penny " + allowance() + " days to be >= $5");

    addTwoNumbers();

    System.out.println("\nEnter the first integer:");
    int n1 = Input.readInt();
    System.out.println("Enter the Second integer:");
    int n2 = Input.readInt();
    System.out.println("Your GCF is " + GCF(n1,n2));

    menu();
  }

  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

  int allowance(){
    double x = 0.01;
    int days = 1;
    while(x < 5){
      x *= 2;
      days += 1;
    }
    return days;
  }

  void addTwoNumbers(){
    int i1 = randInt(1,20);
    int i2 = randInt(1,20);
    int ans = i1 + i2;
    System.out.println("\n" + i1 + " " + "+" + " " + i2 + " =");
    int answ = Input.readInt();
    
    while( !(answ == ans) ){
      System.out.println("Try again");
      answ = Input.readInt();
    }
    System.out.println("Correct - the answer is " + ans);
  }

  int GCF(int n1, int n2){

    int jeb = 0;
    if(n1<n2){
      jeb += n1;
    }else if(n2<n1){
      jeb += n2;
    }else{
      jeb += n1;
    }


    for(int i = jeb; i > 0; i--){
      if(n1%i == 0 && n2%i == 0){
        return i;
      }
    }
    return 0;
  }

  String menu(){
    System.out.println("\nWelcome to the Menu System");
    System.out.println("\nSelect from the following choices:");
    System.out.println("1 - Allowance");
    System.out.println("2 - Addition game");
    System.out.println("3 - Calculate the GCF of two integers");
    System.out.println("4 - Exit Looney Tune System");
    int chois = Input.readInt();
    if(chois == 1){
      System.out.println("\nIt takes a doubling penny " + allowance() + " days to be >= $5");
      menu();
    }else if(chois == 2){
      addTwoNumbers();
      menu();
    }else if(chois == 3){
      System.out.println("\nEnter the first integer:");
      int n1 = Input.readInt();
      System.out.println("Enter the Second integer:");
      int n2 = Input.readInt();
      GCF(n1,n2);
      System.out.println("Your GCF is " + GCF(n1,n2));
      menu();
    }else{
      return "";
    }
    return "";
  }
  
}
