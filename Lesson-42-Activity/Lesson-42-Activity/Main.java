
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
    String sql = "update students set Room = 122 where (StudentID = 'STUDENT1001' and Period = 3);" 
    + "delete Course from students where StudentID = 'STUDENT1200';" 
    + "update students set Room = 213 where (Period in (4,5) and Teacher1 = 'DOYLE');"
    + "update students set Teacher1 = 'ROFFLER' where (Teacher1 = 'ARCHETTI' and Course = 'MQF44QGF' and Section = 1);"
    + "update students set (Grade = 11 and OffClass = '3V1') where StudentID = 'STUDENT999';"
    + "insert into students (Course, Section, StudentID, Teacher1, Period, Room) values ('MKUFTC6', 1, 'STUDENT1231', 'CASTRO R', 9, 322);"
    + "Select * from students;";


		Database db = new Database("jdbc:sqlite:students.db");
    queryResult = db.runSQL(sql, "table-auto");
    print(queryResult);
    
   
     
      }    
}