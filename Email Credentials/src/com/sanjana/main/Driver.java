package com.sanjana.main;

import java.util.Scanner;

import com.sanjana.model.Employee;
import com.sanjana.service.CredentialService;

public class Driver {
	
	public static void main(String [] args) {
		CredentialService c=new CredentialService();
		
		Employee e=new Employee("Sanjana","Panday");
		String generatedEmail;
		char[] generatedPassword;
	
		System.out.println("Please enter the department form the following ");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resources");
		System.out.println("4. Legal");
	
		Scanner in=new Scanner(System.in);
		int ch=in.nextInt();
		String department=null;
		String emailAdd;
		switch(ch) {
			case 1:
				generatedEmail=c.email(e.getFirstName().toLowerCase(),e.getLastName().toLowerCase(),"tech");
				generatedPassword =c.generatPassword();
				c.showCredentials(e, generatedEmail, generatedPassword);
				break;
			case 2:
				generatedEmail=c.email(e.getFirstName().toLowerCase(),e.getLastName().toLowerCase(),"adm");
				generatedPassword =c.generatPassword();
				c.showCredentials(e, generatedEmail, generatedPassword);
				break;
			case 3:
				generatedEmail=c.email(e.getFirstName().toLowerCase(),e.getLastName().toLowerCase(),"hr");
				generatedPassword =c.generatPassword();
				c.showCredentials(e, generatedEmail, generatedPassword);
				break;
			case 4:
				generatedEmail=c.email(e.getFirstName().toLowerCase(),e.getLastName().toLowerCase(),"legal");
				generatedPassword =c.generatPassword();
				c.showCredentials(e, generatedEmail, generatedPassword);
				break;
			default:
					System.out.println("Enter the correct choice");
					
			}
	}
}
