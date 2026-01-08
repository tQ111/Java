class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    Car car1 = new Car();
    car1.brand = "BMW";
    car1.color = "red";
    car1.model = "X5";
    car1.year = 2017;
    car1.value = 25391;
    print("Brand: " + car1.brand);
    print("Model: " + car1.model);
    print("Value: $" + car1.value);
    print("");

    Car car2 = new Car();
    car2.brand = "Mercedes";
    car2.color = "white";
    car2.model = "S63";
    car2.year = 2016;
    car2.value = 189203;
    print("Brand: " + car2.brand);
    print("Model: " + car2.model);
    print("Value: $" + car2.value);
    
    print("\nBONUS");
    if(car1.value > 10000){
      print(car1.value);
    }else{
      print("");
    }

    if(car2.value > 10000){
      print(car2.value);
    }else{
      print("");
    }
    
  }


  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }


}

//**

//Bonus:
//Display the brand and model of any of the cars that has a value over 10,000.  You need 
// to get that information from the object itself to the determine the value.
// */