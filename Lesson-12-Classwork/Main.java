class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    System.out.println("Enter Course Code");
		String course1 = Input.readString();
		if(collegeCredit(course1) == "true"){
      System.out.println("Course is college credit");
    }else{
      System.out.println("Course is NOT college credit");
    }

    System.out.println("\nEnter Official Class");
		String class1 = Input.readString();
		System.out.println("Your Counselor is " + getCounselor(class1) );

    System.out.println("\nEnter File");
		String file = Input.readString();
		System.out.println("Your file is a " + imageType(file) );
    
  }

  String collegeCredit(String course1){
    String credit1 = course1.substring(5,6);
    if(credit1.equalsIgnoreCase("E") || credit1.equalsIgnoreCase("M")){
      return "true";
    }else{
      return "false";
    }
  }


  String getCounselor(String class1){

    if(class1.substring(0,1).equalsIgnoreCase("B") || class1.substring(1,2).equalsIgnoreCase("B")){
      return "Berrouet";
    }else if(class1.substring(0,1).equalsIgnoreCase("C") || class1.substring(1,2).equalsIgnoreCase("C")){
      return "Chu";
    }else if(class1.substring(0,1).equalsIgnoreCase("D") || class1.substring(1,2).equalsIgnoreCase("D")){
      return "Dinn";
    }else if(class1.substring(0,1).equalsIgnoreCase("E") || class1.substring(1,2).equalsIgnoreCase("E")){
      return "Eyzengart";
    }else if(class1.substring(0,1).equalsIgnoreCase("F") || class1.substring(1,2).equalsIgnoreCase("F")){
      return "Flores";
    }else if(class1.substring(0,1).equalsIgnoreCase("G") || class1.substring(1,2).equalsIgnoreCase("G")){
      return "Gibson";
    }else if(class1.substring(0,1).equalsIgnoreCase("L") || class1.substring(1,2).equalsIgnoreCase("L")){
      return "Shim Lee";
    }else if(class1.substring(0,1).equalsIgnoreCase("M") || class1.substring(1,2).equalsIgnoreCase("M")){
      return "Meltzer";
    }else if(class1.substring(0,1).equalsIgnoreCase("P") || class1.substring(1,2).equalsIgnoreCase("P")){
      return "Paccione";
    }else if(class1.substring(0,1).equalsIgnoreCase("S") || class1.substring(1,2).equalsIgnoreCase("S")){
      return "Fiore";
    }else if(class1.substring(0,1).equalsIgnoreCase("T") || class1.substring(1,2).equalsIgnoreCase("T")){
      return "Tsai";
    }else if(class1.substring(0,1).equalsIgnoreCase("Z") || class1.substring(1,2).equalsIgnoreCase("Z")){
      return "Zayes";
    }else{
      return "ERROR";
    }
  }

  String imageType(String file){
    int pos = file.indexOf(".");
    String endd = file.substring(pos + 1);

    if(endd.equalsIgnoreCase("JPG") || endd.equalsIgnoreCase("JPEG")){
      return "Joint Photographic Experts Group";
    }else if(endd.equalsIgnoreCase("PNG")){
      return "Portable Network Graphics";
    }else if(endd.equalsIgnoreCase("GIF")){
      return "Graphics Interchange Format";
    }else if(endd.equalsIgnoreCase("PDF")){
      return "Portable Document Format";
    }else{
      return "ERROR";
    }
  }
 

}