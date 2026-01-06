class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    dog toto = new dog();
    dog snoopy = new dog();
    dog poophy = new dog();

    toto.bark()
    snoopy.bark()
    poophy.bark()


  }

  



  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}