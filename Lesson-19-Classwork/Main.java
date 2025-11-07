class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){ 
    System.out.println(addNums());
    System.out.println(addNums());
    System.out.println(addNums());
   
  }

  String addNums(){
    int add1 = ( (Math.random( ) * 55) - 5 ) );
    int add2 = ( (Math.random( ) * 55) - 5 ) );
    int sum = ( add1 + add2 );
    return add1 + "+" + add1 + "=" + sum;
  }
}