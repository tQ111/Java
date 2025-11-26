class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    //Using this array to test your summArray and avgArray function
    int nums[] = {10,15,22,54,32,34,65,87,45,100,23,99,95,87,56,83};


    // Use these two arrays to test your quizGrader function
    char[] studentAns = {'A','A','B','C','D','C'};
    char[] ansKey = {'A','B','B','C','D','C'};

    print("Sum Array:");
    print(sumArray(nums));

    print("\nAverage Array:" + "\n" + avgArray(nums));

    print("\nQuiz Score:");
    print("" + quizGrader(ansKey, studentAns) + " %");

  }

  //Problem 1:
  // Write a function called sumArray that accepts an array of integers and
  // returns the sum of all the values in the array.

  int sumArray(int[] s){
    int sum = 0;
    for(int i = 0; i < s.length; i++){
      sum += s[i];
    }
    return sum;
  }

  

  //Problem 2
  // Write a function called avgArray that accepts an array of integers and
  // returns the average of the values in the array


  double avgArray(int[] a){
    double all = 0;
    for(int i = 0; i < a.length; i++){
      all += a[i];
    }
    return (all/a.length);
  }
  

  //Problem 3
  // Write a function called quizGrader that accepts two arrays of characters.  One array 
  // represents the students answers and the other array represents the answer key.
  //
  // Return the quiz grade by counting the number of correct answers divided by
  // the number of quEstions.

  double quizGrader(char[] ans, char[] res){

    double score = 0;
    int questions = ans.length;

    for(int i = 0; i < ans.length; i++){
      if( ans[i] == res[i] ){
        score += 1;
      }else{
        score += 0;
      }
    }

    double fin = score/questions;

    return fin;
  }

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}