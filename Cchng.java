class A
{
 A()
{
System.out.println("Cons A class call");
}
 void show()
{
 System.out.println("class A fun Call");
}
}
class B extends A 
{
  B()
{
System.out.println("Cons B class call");
}
 void show()
{
 System.out.println("class B fun Call");
//super.show();
}
}
class C extends B
{
  C()
{
System.out.println("Cons C class call");
}
 void show()
{
 System.out.println("class C fun Call");
//super.show();
}

}
class D extends C
{
  D()
{
System.out.println("Cons D class call");
}
 void show()
{
 System.out.println("class D fun Call");
//super.show();
}
}
class Cchng extends D
{
  Cchng()
{
System.out.println("Cons Cchng class call");
}
 void show()
{
 System.out.println("class Cchng fun Call");
 //super.show();
  ((A)this).show();
}
public static void main(String[] args)
{
 Cchng cch=new Cchng();
  cch.show();
}

}