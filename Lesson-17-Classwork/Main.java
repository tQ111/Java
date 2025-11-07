class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    System.out.println("Enter words:");
    String word = Input.readString();
    System.out.println("Enter character to find:");
    String find = Input.readString();
    System.out.println("Enter replace character:");
    String replace = Input.readString();
    System.out.println(swapLetter(word, find, replace));
    
  }

  //will use reverse for problem 3
  String reverse(String s){
    String bld="";
    for(int x=s.length()-1; x>=0; x--)
      bld+=s.substring(x,x+1);

    return bld;
  }

  String swapLetter(String word, String find, String replace){
    String build = "";
    for(int x = 0; x < word.length();x++){
      if(word.substring(x, x+1).equals(find)){
        build += replace;
      }else{
        build += word.substring(x,x+1);
      }
    }
    return build;
  }

  String encryption2(String string1){
    String build="";
    String half = string1.length()/2;
    String part1 = string1.substring(0, half);
    String part2 = string1.substring(half,string1.length());
    for(int x=0; x<part1.length()+1; x++){
      build += part1.substring(x,x+1) + part2.substring(x,x+1);
    }
    return build;
  }

}

/*
Problem 2:
Write a function encryption2 that accepts a string and returns the string where the orginal string is split in half 
and each letter from each of the half's is used to create a new string using the 

Example: There are two examples, one is odd number of chars and the second is even number of chars.

encryption2("abcdefghi")==> "aebfcgdhi"

process:  "abcdefghi" -> "abcd" "efghi"  -> "ae" + "bf" + "cg" + "dh" +"i"  -> "aebfcgdhi"

encryption2("abcdefgh") ==> "aebfcgdh"
process:  "abcdefgh" -> "abcd" "efgh"  -> "ae" + "bf" + "cg" + "dh"  -> "aebfcgdh"



Problem 3:
Write a function encryption3 that accepts a string and returns the string that rearranges the characters of the 
incoming string as: 1st,last,2nd,last-1,3rd,last-2,... 
and so on.

Example
encryption3("abcdef")==> "afbecd"
encryption3("abcde")==> "aebd"
*/