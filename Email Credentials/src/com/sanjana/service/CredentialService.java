package com.sanjana.service;

import java.util.Random;

import com.sanjana.model.Employee;

public class CredentialService {
	public char[]  generatPassword() {
		Employee employee =new Employee("Sanjana","Pand");
		
		String capitalLetter ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String specialCharacter="!@#$%^&*<>?.)";
		
		String values = capitalLetter + smallLetters + numbers + specialCharacter;
		
		Random random=new Random();
		char[] password = new char[12];
		
		for(int i=0;i<12;i++) {
			password[i]=values.charAt(random.nextInt(values.length()));
		}
		return password;
	}
	
	public String  email(String firstName, String lastName, String department) {
		
		return firstName+lastName+"@"+department+".abc.com";
	}
	
	public void showCredentials(Employee employee ,String email1,char [] generatedPassword ) {
		System.out.println("Dear"+employee.getFirstName()+"Your generated credentials are as follows:");
		System.out.println("Email -->"+email1);
		System.out.println("Password -->"+"");
		
		System.out.print(generatedPassword);
	}
	

}
