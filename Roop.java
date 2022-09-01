package test;

import java.util.Scanner;

public class Roop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner i = new Scanner(System.in);
		
		System.out.println("------------------MENU-----------------------------------");
		//i.nextLine();
		System.out.println("Code		Description			Price");
		System.out.println("PM1		1pc. Chicken with rice		120.00");
		System.out.println("PM2		Halo-halo			75.00");
		System.out.println("PM3		Sisig				111.00");
		System.out.println("---------------------------------------------------------");
		
		String rep;
		String cd;
		do {
		System.out.print("Enter Code: ");
		cd = i.next();
		if (cd.equals("PM1") || cd.equals("pm1") ) {
			System.out.println("Description: 1pc. Chicken with rice ");
			System.out.println("Price: 120.00");
			
			int qt;
			System.out.print("Enter Quantity: ");
			qt = i.nextInt();
			
			float tp = qt * 120;
			System.out.printf("Total Price: %.2f", tp);
			
			int cs;
			System.out.print("\n" +"Enter Cash: ");
			cs = i.nextInt();
			if (cs < tp) {
				System.out.println("Insufficient Cash ");
				System.out.print("Transaction Unsuccessful");
				System.out.println("Order Again(Y/N)? ");
				rep = i.next();
			}
			else {
				float gg;
				gg = (float)cs-(float)tp;
				System.out.printf("Change: %.2f", gg );
				System.out.printf( "\n" +"Transaction sucsessful");
				System.out.println("\n" +"Order Again(Y/N)? ");
				rep = i.next();
			}
		}
		else if (cd.equals("PM2") || cd.equals("pm2") ) {
			System.out.println("Description: Halo-halo ");
			System.out.println("Price: 75.00");
			
			int qt;
			System.out.print("Enter Quantity: ");
			qt = i.nextInt();
			
			float tp = qt * 75;
			System.out.printf("Total Price: %.2f", tp);
			
			int cs;
			System.out.print("\n" +"Enter Cash: ");
			cs = i.nextInt();
			if (cs < tp) {
				System.out.println("Insufficient Cash ");
				System.out.print("Transaction Unsuccessful");
				System.out.println("\n" +"Order Again(Y/N)? ");
				rep = i.next();
			}
			else {
				float gg;
				gg = (float)cs-(float)tp;
				System.out.printf("Change: %.2f", gg );
				System.out.printf( "\n" +"Transaction sucsessful");
				System.out.println("\n" +"Order Again(Y/N)? ");
				rep = i.next();
			}
		}
		else if (cd.equals("PM3") || cd.equals("pm3") ) {
			System.out.println("Description: Sisig");
			System.out.println("Price: 111.00");
			
			int qt;
			System.out.print("Enter Quantity: ");
			qt = i.nextInt();
			
			float tp = qt * 111;
			System.out.printf("Total Price: %.2f", tp);
			
			int cs;
			System.out.print("\n" +"Enter Cash: ");
			cs = i.nextInt();
			if (cs < tp) {
				System.out.println("Insufficient Cash ");
				System.out.print("Transaction Unsuccessful");
				System.out.println("\n" +"Order Again(Y/N)? ");
				rep = i.next();
			}
			else {
				float gg;
				gg = (float)cs-(float)tp;
				System.out.printf("Change: %.2f", gg );
				System.out.printf( "\n" +"Transaction sucsessful");
				System.out.println("\n" +"Order Again(Y/N)? ");
				rep = i.next();
			}
		}
		else {
			System.out.println("Code Invalid");
			System.out.println("\n" +"Order Again(Y/N)? ");
			rep = i.next();
		}
		
		}while(rep.equals("Y") || rep.equals("y"));
		
				
		i.close();
	}

}
