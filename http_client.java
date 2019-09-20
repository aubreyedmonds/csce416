//Deirdre Aubrey Edmonds
//use readLine and see that it returns null to see that youre done
//read every line of a page and then write it 
//javac compiles it to byte code for the jvm
//java http_client <-- runs the byte code 
//cat http_client output
import java.util.*;
import java.net.*;
import java.io.*;

public class http_client {
    public static void main (String [] args) {
        try {
            URL url = new URL("https://cse.sc.edu/~oreillyj"); //be able to type website from command line (command line arguments java)
            HttpURLConnection httpCon = (HttpURLConnection) url.openConnection(); //establishes that you want a  connection
            httpCon.setRequestMethod("GET"); //setting the method to request the connection and that it is going to use GET
            InputStream inputStream = httpCon.getInputStream(); //now you have inputStream and it starts to GET
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream)); //sets up the reader

            FileWriter writer = new FileWriter("http_client_output"); //sets up the writer
            BufferedWriter bw = new BufferedWriter(writer); 
            
            String line = reader.readLine(); //reads a line
            bw.write(line); //writing to it
            bw.flush(); //puts info into the file, makes the writer to commit to the file
            

            bw.close(); 
            reader.close();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}