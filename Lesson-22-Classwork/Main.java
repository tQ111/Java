class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    String[] friends = {"thing1","thing2","thing3","thing4"};
    print(friends[0]);
    print(friends[3]);

    double[] tempC = {23.3,26.7,25.3,32.7,20.5,30.1};
    double[] tempF = convert(tempC);
    
    for(int i = 0; i < tempF.length; i++){
      print(tempF[i]);
    }

  }

  double[] convert(double[] c){
    double[] tmp = new double[c.length];
    for(int i = 0; i < c.length; i++){
      tmp[i] = celsiusToFarhenheit(c[i]);
    }
    return tmp;
  }

  double celsiusToFarhenheit(double c){
        return c*9/5+32;
  }
}