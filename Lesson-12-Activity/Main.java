class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){ 
    System.out.println("Enter Credit Card Number:");
    String cardNum = Input.readString();
    System.out.println("Your card is a" + creditCardType(cardNum));

    System.out.println("\nEnter One Word");
    String word = Input.readString();
    System.out.println("Your word in pig latin is: " + pigLatin(word));

    System.out.println("\nEnter Zip Code");
    String zipcode = Input.readString();
    System.out.println("Your zipcode is in " + nycLocate(zipcode));

    System.out.println("\nEnter Date (MM/DD/YYYY)");
    String date = Input.readString();
    System.out.println("Your date is in " + getMonth(date));

    System.out.println("\nEnter password");
    String password = Input.readString();
    System.out.println("Your password is valid: " + validatePswd(password));
   
  }

  String creditCardType(String cardNum){
    if(cardNum.substring(0,1).equals("4")){
      return " Visa card";
    }else if(cardNum.substring(0,2).equals("34") || cardNum.substring(0,2).equals("37")){
      return "n American Express card";
    }else if(cardNum.substring(0,2).equals("36")){
      return " Diner Club card";
    }else if(cardNum.substring(0,2).equals("51") || cardNum.substring(0,2).equals("55")){
      return " Mastercard card";
    }else if(cardNum.substring(0,4).equals("6011") || cardNum.substring(0,2).equals("65")){
      return " Discovery card";
    }else{
      return " ERROR";
    }
  }

  String pigLatin(String word){
    String firstLetter = word.substring(0,1);
    String wordy = word.substring(1,word.length());
    return wordy + firstLetter + "ay";
  }

  String nycLocate(String zipcode){
    String firstThree = zipcode.substring(0,3);
    if(firstThree.equals("100") || firstThree.equals("101") || firstThree.equals("102")){
      return "Manhattan";
    }else if(firstThree.equals("103")){
      return "Staten Island";
    }else if(firstThree.equals("104")){
      return "the Bronx";
    }else if(firstThree.equals("112")){
      return "Brooklyn";
    }else if(firstThree.equals("113") || firstThree.equals("114") || firstThree.equals("111")){
      return "Queens";
    }else{
      return "ERROR";
    }
  }

  String getMonth(String date){
    int pos = date.indexOf("/");
    String month = date.substring(0,pos);
    if(month.equals("01") || month.equals("1")){
      return "January";
    }else if(month.equals("02") || month.equals("2")){
      return "February";
    }else if(month.equals("03") || month.equals("3")){
      return "March";
    }else if(month.equals("04") || month.equals("4")){
      return "April";
    }else if(month.equals("05") || month.equals("5")){
      return "May";
    }else if(month.equals("06") || month.equals("6")){
      return "June";
    }else if(month.equals("07") || month.equals("7")){
      return "July";
    }else if(month.equals("08") || month.equals("8")){
      return "August";
    }else if(month.equals("09") || month.equals("9")){
      return "September";
    }else if(month.equals("10")){
      return "October";
    }else if(month.equals("11")){
      return "November";
    }else if(month.equals("12")){
      return "December";
    }else{
      return "ERROR";
    }
  }

  boolean validatePswd(String password){
    if( (password.length() > 5 && password.length() < 8 ) && ( !password.contains("^") && !password.contains("*") && !password.contains(",") ) ){
      return true;
    }else{
      return false;
    }
  }


  
}