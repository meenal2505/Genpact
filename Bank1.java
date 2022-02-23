package Day_11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Bank1 {
	public static void main(String args[])
	{
		int balance;
		double phone_number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcom to XYZ bank");
		System.out.println("Enter customer name :- ");
		String name = sc.nextLine();
		System.out.println("Enter account number :- ");
		int account_number = sc.nextInt();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loading...");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/genpact","root","root");
			System.out.println("Connceting to database");
			PreparedStatement pr =con.prepareStatement("select * from bank where Account_number = ?");
			pr.setInt(1,account_number);
			int data = pr.executeUpdate();
			System.out.println(pr);
			int acc;
			ResultSet rs = pr.executeQuery();
			rs.next();
			acc = rs.getInt(1);
			name = rs.getString(2);
			balance = rs.getInt(3);
			phone_number = rs.getDouble(4);
			if ( acc == account_number )
			{
				int choice;
				do
				{
					System.out.println("1. check balance");
					System.out.println("2. deposite amount");
					System.out.println("3. withdraw money");
					System.out.println("4. exit");
					System.out.println("\n\n Enter your choice: ");
					choice = sc.nextInt();
					System.out.println("\n");
					switch(choice)
					{
					case 1:
						System.out.println("available balance :- "+balance);
						break;
					case 2:
						System.out.println("Enter the amount to deposite :- ");
						int amt = sc.nextInt();
						PreparedStatement pr1 =con.prepareStatement("update bank set balance =? where account_number =?");
						pr1.setInt(1, balance+amt);
						pr1.executeUpdate();
						System.out.println(amt+" amount deposited");
						break;
					case 3:
						if(balance<=10000)
						{
							System.out.println("Balance is less.");
						}
						else
						{
							System.out.println("Enter the amount to withdraw :- ");
							int withdraw = sc.nextInt();
							PreparedStatement pr2 =con.prepareStatement("update bank set balance =? where account_number =?");
							pr2.setInt(1, balance-withdraw);
							pr2.executeUpdate();
							System.out.println(withdraw+" amount withdraw");
						}
						break;
					case 4:
						break;
					default :
						System.out.println("exit");
					}
				}while(choice<=4);
			}
			else
			{
				System.out.println("You are not registred in bank XYZ");
			}
			con.close();
		}
		catch(Exception e)
		{
			
		}
	}

}
