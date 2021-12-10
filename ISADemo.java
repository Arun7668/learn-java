class A
{
 int x,y;
A()
{
x=1;
System.out.println("default cons class A");
}
A(int x)
{
  System.out.println("param cons class A="+x);
}
}

class B extends A
{
 int x,y;
B()
{
super(200);
y=2;
System.out.println("default cons class B");
}
B(int x)
{
  System.out.println("param cons class B="+x);
}
}

class C extends B
{
 int x,y;
C()
{
super(100);
x=5;
y=10;

System.out.println("default cons class c");
}
C(int x)
{
 int sum=super.x+y+this.x+this.y;
  System.out.println("param cons class C="+sum);
}
}

class ISADemo
{
public static void main(String[] args)
{
 C c=new C(100);
}
}

