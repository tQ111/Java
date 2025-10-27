class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    System.out.println("Enter N value");
    double nvalue = Input.readDouble();
    System.out.println( spaces(nvalue) );
    
    
  }

  String spaces(int nvalue){
    String output = "";
    for(int x = 0; x <= nvalue; x++){
	    output += " ";
    }
    return output + "DONE";

  }

  
}

  






