class Sector35
{
double area (int r,int t)
{
double res=0.5*r*r*t;
return res;
}
}
class Sector36 
{
public static void main(String[]args)
{
Sector35 d=new Sector35();
d.area(12,45);
double y=new Sector35().area(12,45);
System.out.println(y);
}
}