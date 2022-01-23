package basic_java_program;

public class Throws {
	void setcal()throws ArithmeticException
	  {
		  int x=10/0;
	  }
	  void setsize()throws ArrayIndexOutOfBoundsException
	  {
		  int x[]=new int [5];
		  x[10]=1000;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//********jvm catch the exception
		
		
//		 Throws t=new Throws();
//		 t.setcal();
//		 t.setsize();
		
		//********programmer catch the exception
		
		 Throws t=new Throws();
		 try
		 {
		 t.setcal();
		 t.setsize();
		 }
		 catch(Exception e)
		 {
			 System.err.println(e);
		 }
	}

}
