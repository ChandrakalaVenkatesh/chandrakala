import java.util.Scanner;

class WelcomePage {
	static Scanner sc = new Scanner(System.in);
	String name;
	String pwd;
	long phno;
	String email;
	double balance;

	void signUp(String a, String b, long c, String d) {
		name = a;
		pwd = b;
		phno = c;
		email = d;
		System.out.println("sigup done");

	}

	void checkBalance(String pwd1) {
		if (pwd.equals(pwd1)) {
			System.out.println("ur balance is : " + balance);

		} else {
			System.out.println("invalid pwd");

		}

	}

	void deposite(String pwd1) {
		if (pwd.equals(pwd1)) {
			System.out.println("enter the amount");
			double amount = sc.nextDouble();
			balance = amount;
			System.out.println("amount deposited successfully(-_-)");
		} else {
			System.out.println("invalid pwd");
		}

	}

	void withdraw(String pwd1) {
		if (pwd.equals(pwd1)) {
			System.out.println("enter the amount");
			double amount = sc.nextDouble();
			if (balance >= amount) {
				System.out.println("Take and enjoy");
				balance = balance - amount;
			}
			else
			{
				System.out.println("enter the lesser amount");
			}
			
		} else {
			System.out.println("invalid pwd");

		}
	}

	void changePwd(String pwd1) {
		if (pwd.equals(pwd1)) {
			System.out.println("enter the new pwd");
			String newPwd = sc.next();
			pwd = newPwd;
			System.out.println("done .....!");

		} else {
			System.out.println("invalid pwd");

		}
	}

	void logIn(String a, String b) {
		boolean flag = true;

		if (a.equals(email) && b.equals(pwd)) {
			while (flag) {
				System.out.println("-----------------------");
				System.out.println("1.check balance\n2.deposite" + "\n3.withdraw\n4.change pwd"
						+ "\n5.exit\nEnter the valid option");
				switch (sc.nextInt()) {
				case 1: {

					System.out.println("enter the  pwd");
					String pwd = sc.next();
					checkBalance(pwd);
					System.out.println("-----------------------");

				}
					break;
				case 2: {
					System.out.println("enter the pwd");
					String pwd = sc.next();
					deposite(pwd);
					System.out.println("-----------------------");

				}
					break;
				case 3: {
					System.out.println("enter the pwd");
					String pwd = sc.next();
					withdraw(pwd);
					System.out.println("-----------------------");

				}
					break;
				case 4: {
					System.out.println("enter the old pwd");
					String pwd = sc.next();
					changePwd(pwd);
					System.out.println("-----------------------");

				}
					break;
				case 5: {
					System.out.println("thank you");
					flag = false;
					System.out.println("-----------------------");

				}
					break;
				default: {
					System.out.println("invalid option");
					System.out.println("-----------------------");
				}

				}
			}
		} else
			System.out.println("invalid us or pwd");

	}
}

public class Suraj_Bank {
	static Scanner sc = new Scanner(System.in);
	static WelcomePage page = new WelcomePage();

	public static void main(String[] args) {
		boolean flag = true;
		while (flag) {
			System.out.println("1.signup\n2.login\n3.exit\nEnter the option");
			switch (sc.nextInt()) {
			case 1: {
				System.out.println("enter the un");
				String name = sc.next();
				System.out.println("enter the pwd");
				String pwd = sc.next();
				System.out.println("enter the number");
				long no = sc.nextLong();
				System.out.println("enter the email");
				String email = sc.next();
				page.signUp(name, pwd, no, email);
				System.out.println("-----------------------");

			}
				break;
			case 2: {
				System.out.println("enter the email");
				String name = sc.next();
				System.out.println("enter the pwd");
				String pwd = sc.next();
				page.logIn(name, pwd);
				System.out.println("-----------------------");

			}
				break;
			case 3: {
				flag = false;
				System.out.println("thank you");
				System.out.println("-----------------------");

			}
				break;
			default: {
				System.out.println("invalid option");
				System.out.println("-----------------------");
			}
			}
		}
	}
}