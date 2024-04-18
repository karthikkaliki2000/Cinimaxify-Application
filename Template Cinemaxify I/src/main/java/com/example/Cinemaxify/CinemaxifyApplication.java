//package com.example.Cinemaxify;
//
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import java.util.Scanner;
//
//// 1. Beginner Code Template is already provided to you.
//// 2. Just follow the below task to complete the execution of main application.
//@SpringBootApplication
//public class CinemaxifyApplication {
//
//	public static void main(String[] args) {
//
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Welcome to the Cinemaxify Application");
//		while (true) {
//			System.out.println("Please select the member you want the plan for:");
//			System.out.println("1. Self\n2. Spouse");
//			String userType = "";
//			int userChoice = scanner.nextInt();
//
//			switch (userChoice) {
//			case 1 -> {
//				// a. Set userType according to the userChoice.
//				// userType="self";
//				System.out.println("Please select your plan:\n1.Normal\n2.Premium");
//				int planChoice = scanner.nextInt();
//				scanner.nextLine();
//				switch (planChoice) {
//				case 1: {
//					userType = "selfNormalPlan";
//					break;
//				}
//				case 2: {
//					userType = "selfPremiumPlan";
//					break;
//				}
//				default:
//					// System.out.println("Invalid Plan choice");
//				}
//				break;
//
//			}
//			case 2 -> {
//				// b. Set userType according to the userChoice.
//				// userType="spouse";
//				System.out.println("Please select your plan:\n1.Normal\n2.Premium");
//				int planChoice = scanner.nextInt();
//				scanner.nextLine();
//				switch (planChoice) {
//				case 1: {
//					userType = "spouseNormalPlan";
//					break;
//				}
//				case 2: {
//					userType = "spousePremiumPlan";
//					break;
//				}
//				default:
//					// System.out.println("Invalid Plan choice");
//				}
//				break;
//			}
//			case 3 -> {
//				// c. Print "Exiting..." and return
//				System.out.println("Exiting...");
//				// return;
//			}
//			default -> {
//				// d. Print "Invalid choice." and return.
//				System.out.println("Invalid choice");
//				return;
//
//			}
//			}
//			// e. Pick the user bean using context.getBean().
//
//			User user = (User) context.getBean(userType);
//
//			// f. Take input for User details i.e. name , age, address etc.
//			System.out.println("Please enter your name:");
//			String name = scanner.nextLine();
//			System.out.println("Please enter your age:");
//			int age = scanner.nextInt();
//			scanner.nextLine();
//			System.out.println("Please enter your contact:");
//
//			Long contact = scanner.nextLong();
//			scanner.nextLine();
//			System.out.println("Please enter your address:");
//			String address = scanner.nextLine();
//
//			// g. Set the above fetched details into the user by using appropriate method.
//			user.setUserDetails(name, age, contact, address);
//
//			// h. finally print the details by using appropriate method.
//			user.getUserDetails();
//			System.out.println("Do you want to purchase plan for someone else\n1.Yes\n2.No");
//			int option = scanner.nextInt();
//			switch (option) {
//
//			case 2: {
//				return;
//			}
//			case 1: {
//				continue;
//			}
//			}
//		}
//
//	}
//}

package com.example.Cinemaxify;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;

@SpringBootApplication
public class CinemaxifyApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Cinemaxify Application");
		while (true) {
			System.out.println("Please select the member you want the plan for:");
			System.out.println("1. Self\n2. Spouse");
			String userType = "";
			int userChoice = scanner.nextInt();
			scanner.nextLine();
			switch (userChoice) {
				case 1 -> userType = "self";
				case 2 -> userType = "spouse";
				case 3 -> {
					System.out.println("Exiting...");
					return;
				}
				default -> {
					System.out.println("Invalid choice.");
					return;
				}
			}
			System.out.println("Please select your plan:\n1. Normal\n2. Premium");
			int planChoice = scanner.nextInt();
			scanner.nextLine();
			String myPlan = ""; //name
			switch (planChoice) {
				case 1 -> myPlan = "Normal";
				case 2 -> myPlan = "Premium";
				default -> {
					System.out.println("Invalid choice.");
					return;
				}
			}
			User user = (User) context.getBean(userType + myPlan);
			// Input details for selected user
			System.out.println("Please enter your name:");
			String name = scanner.nextLine();
			System.out.println("Please enter your age:");
			int age = scanner.nextInt();
			System.out.println("Please enter your contact:");
			Long contact = scanner.nextLong();
			scanner.nextLine();
			System.out.println("Please enter your address:");
			String address = scanner.nextLine();
			System.out.println();
			user.setUserDetails(name, age, contact, address);
			user.getUserDetails();
			System.out.println("Do you want to purchase plan for someone else");
			System.out.println("1. Yes\n2. No");
			int input = scanner.nextInt();
			if (input == 2) break;
		}

	}

}
