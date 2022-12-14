import java.util.Scanner;
class Calculator
{
   public static void main(String[] args)
 {
    boolean flag=true;
    while (flag)
   {
     Scanner sa=new Scanner(System.in);
      System.out.println("1.Addition\n2.Subtraction\n3.Division\n4.Multiplication\n5.Exit");
      System.out.println("enter the valid option");
      int opt=sa.nextInt();
      switch(opt)
     {
     case 1:
     { 
       System.out.println("enter 1st number");
       int a=sa.nextInt();
       System.out.println("enter 2nd number");
       int b=sa.nextInt();
       int res=a+b;
       System.out.println("Result is:" +res);
       }
       break;
     case 2:
     { 
       System.out.println("enter 1st number");
       int a=sa.nextInt();
       System.out.println("enter 2nd number");
       int b=sa.nextInt();
       int res=a-b;
       System.out.println("Result is:" +res);
       }
       break;
      case 3:
     { 
       System.out.println("enter 1st number");
       double a=sa.nextDouble();
       System.out.println("enter 2nd number");
       double b=sa.nextDouble();
       double res=a/b;
       System.out.println("Result is:" +res);
       }
       break;
      case 4:
     { 
       System.out.println("enter 1st number");
       int a=sa.nextInt();
       System.out.println("enter 2nd number");
       int b=sa.nextInt();
       int res=a*b;
       System.out.println("Result is:" +res);
       }
       break;
       case 5:
       {
       flag=false;
       System.out.println("Thank you");
       }
       break;
       default:
       {
       System.out.println("invalid option");
       }
       }
       }
       }
       }