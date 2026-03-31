import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.sql.*;

import java.net.InetSocketAddress;
import java.util.Map;

//For compiling on the shell on repl: Same on mac
//javac -cp sqlite-jdbc-3.23.1.jar: Main.java
//java -cp sqlite-jdbc-3.23.1.jar: Main

//Use for windows
//javac -cp sqlite-jdbc-3.23.1.jar; Main.java
class Main {

 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }


  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() throws IOException{
   

    // create a port - our Gateway
    int port = 8500;
      
    //create the HTTPserver object
    HttpServer server = HttpServer.create(new InetSocketAddress(port),0);

    // create the database object
    Database db = new Database("jdbc:sqlite:chinook.db");
    


    // Add your  code here
    server.createContext("/", new RouteHandler("You are connected, but route not given or incorrect ...") );

    sql = "select * from customers;";
    server.createContext("/customers", new RouteHandler(db, sql));

    sql = "select * from employees;";
    server.createContext("/customers", new RouteHandler(db, sql));

    sql = "select albums.AlbumId, albums.Title, tracks.TrackId, tracks.Name, artists.ArtistId, artists.Name
      from albums
      inner join artists ON albums.ArtistId = artists.ArtistId
      inner join tracks ON albums.AlbumId = tracks.AlbumId
      limit 10;";
    server.createContext("/albumsinfo", new RouteHandler(db, sql));

    sql = "select customers.FirstName, customers.LastName, invoices.InvoiceDate, tracks.Name
      from customers
      inner join invoices ON invoices.CustomerId = customers.CustomerId
      inner join invoice_items ON invoice_items.InvoiceId = invoices.InvoiceId
      inner join tracks ON invoice_items.TrackId = tracks.TrackId
      limit 10;";
    server.createContext("/customersongs", new RouteHandler(db, sql));


    //Start the server
    server.start();

    System.out.println("Server is listening on port "+port);
       
      
    }    
}


