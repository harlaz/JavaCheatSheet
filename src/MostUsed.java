import java.io.*;
import java.net.URL;

public class MostUsed {
    public static void main( String ... args )
    {
        p("-------- Reading the text of a file ------");
        //import java.io.*;
        String filePath = "resources/TestFile.txt";
        try(InputStream is = new FileInputStream(new File(filePath)) ) //this would close the resource
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line = br.readLine();
            while( line != null )
            {
                p(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        p("-------- Read Contents of URL ------");
        // import java.net.URL;
        String urlText = "http://txt2html.sourceforge.net/sample.txt";
        try( InputStream is = new URL(urlText ).openStream() )
        {
            //Same block as when reading a file
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line = br.readLine();
            while( line != null )
        {
            p(line);
            line = br.readLine();
        }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    private static void p( String toPrint )
    {
        System.out.println( toPrint );
    }
}
