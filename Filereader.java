package basic_java_program;
import java.io.*;
public class Filereader {
	  static void Filereader() throws FileNotFoundException
	  {
		  FileReader fi=new  FileReader("umika.txt");
		  throw new FileNotFoundException();
	  }
	public static void main(String[] args) {
		try
		{
			Filereader();

	    }
	 catch(FileNotFoundException e)
		{
		 e.printStackTrace();
		}
		System.out.println("Rest of code");
	}

}
