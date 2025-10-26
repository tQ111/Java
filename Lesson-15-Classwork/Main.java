class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    System.out.println("Enter N value");
    double nvalue = Input.readDouble();
    System.out.println("pi(n) = " +pi(nvalue));
  }

  double pi(double nvalue){

    double result1 = 0;
    int switch1 = 0;

    for(double x = 1; x <= nvalue; x+=2){
      if(switch1 == 0){
	      result1 += (1.0/x);
        switch1 += 1;
      }else if(switch1 > 0){
        result1 -= (1.0/x);
        switch1 -= 1;
      }else{
        result1 = 250;
      }
    }
    return 4*result1;
  }
  
  
}