package basic_java_program;

public class Testthrow {
	static void  validate(int age)
	{
		 try
		 {
		if(age<18)
		{
			throw new ArithmeticException("person is not eligible for vote");
		}
		else
		{
			System.out.println("person is eligible foe vote");
		}
	 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       validate(10);
		

	}

}
