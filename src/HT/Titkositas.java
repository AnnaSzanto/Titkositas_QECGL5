package HT;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Titkositas {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new FileReader("aszoveg.txt"));
		
		PrintWriter pw = new PrintWriter("eredmeny.txt");
		
		
		int t;
        while ((t = bf.read()) != -1) 
        {
        	if (64 < t && t < 91 || 96 < t && t < 123) 
        	{
        		pw.write(t + 1);
        	}
        	else 
        	{
        		pw.write(t);;
        	}
        }
		
		pw.flush();
		pw.close();
		bf.close();

	}

}
