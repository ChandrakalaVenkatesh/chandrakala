class Amazon
{
static void order()
{
System.out.println("place your order");
}
static void signup()
{
System.out.println("Signing up..");
}
static void homePage()
{
System.out.println("HI homepage..");
}
static void logout()
{
System.out.println("logging out");
}
public static void main(String[] args)
{
System.out.println("Welcome to Amazon..!");
signup();
login();
homePage();
order();
logout();
System.out.println("Thank you for ordering in Amazon");
}
static void login()
	{
System.out.println("logging in..");
}
}