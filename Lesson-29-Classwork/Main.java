class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    dog dog1 = new dog();
    dog1.name = "Toto"
    dog1.breed = "Terrier";
    dog1.age = 3;

    dog dog2 = new dog();
    dog1.name = "Snoopy"
    dog1.breed = "Beagle";
    dog1.age = 75;

    dog dog3 = new dog();
    dog1.name = "Poophy"
    dog1.breed = "Corgi";
    dog1.age = 4;

    dog1.bark()
    dog2.bark()
    dog3.bark()


  }

  



  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}