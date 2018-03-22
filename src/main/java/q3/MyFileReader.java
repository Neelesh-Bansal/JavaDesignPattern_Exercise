package q3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class MyFileReader {
    private static MyFileReader myFileReader = null;

    private int val;

    private MyFileReader() {

    }

    public static MyFileReader getInstance() {
        if (myFileReader == null) {
            synchronized (MyFileReader.class) {
                if (myFileReader == null) {
                    myFileReader = new MyFileReader();
                    System.out.println("object is created");

                }
            }
        }

        return myFileReader;
    }

    public void performCalculateInFile() {

        try {

            BufferedReader reader=new BufferedReader(new FileReader("/home/neelesh/Documents/file.txt"));
            val=Integer.parseInt(reader.readLine());

            System.out.println(Thread.currentThread().getName()+" : "+val);
            val=val*2;

            reader.close();
            String str=String.valueOf(val);
            BufferedWriter writer = new BufferedWriter(new FileWriter("/home/neelesh/Documents/file.txt"));
            writer.write(str);

            writer.close();
        }
        catch (Exception ex){

        }
    }
}
