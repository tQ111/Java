import java.io.IOException;
import java.sql.*;
//For compiling on the shell on repl: Same on mac
//javac -cp sqlite-jdbc-3.23.1.jar: Main.java

//Use for windows
//javac -cp sqlite-jdbc-3.23.1.jar; ServerExample.java
class Main {

 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }

  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() {
     

      String queryResult="";
      String sql = "INSERT INTO students(Course, Section, Period, Teacher1, Room, studentID) VALUES ('MCLUB1', 3, 1, 'WHOKNOWS', 'ROOFTOP', 'STUDENT2');";

		  Database   db =  new  Database("jdbc:sqlite:students.db");
      queryResult = db.runSQL(sql, "table-auto");	
      print(queryResult);


      String sql1 = "INSERT INTO students(Course, Section, Period, Teacher1, Room, studentID) VALUES ('CN100', 1, 2, 'PORCHETTA', '108', 'STUDENT4');";
      queryResult = db.runSQL(sql1, "table-auto");
      print(queryResult);


      
  }    
}