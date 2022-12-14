class Gmail
{
static void signup()
{
System.out.println("Signing up..");
}
static void homePage()
{
System.out.println("Homepage..");
}
static void logout()
{
System.out.println("logging out");
}
public static void main(String[] args)
{
System.out.println("Welcome to Gmail..!");
signup();
login();
homePage();
logout();
System.out.println("Thank you..");
}
static void login()
	{
System.out.println("logging in..");
}
}