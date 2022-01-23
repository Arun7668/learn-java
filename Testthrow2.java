package basic_java_program;

public class Testthrow2 {
	static void  validate(int age)throws ArithmeticException
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
		 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       validate(10);
		

	}

}
