class Demo1
{
static double area()
{
 final double pi=3.142;
       double r=5;
       double A=pi*r*r;
       return A;
  }
  }
  class Tester1
  {
  public static void main(String[] args)
  {
   double y=Demo1.area();
   System.out.println(y);
   }
   }