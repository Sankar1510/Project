package com.test.com;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
String str;
Scanner sc=new Scanner(System.in);
System.out.println("enter the String");	
str=sc.nextLine();
sc.close();
//(forward)
//for(int i=0;i<str.length();i++) {
System.out.println("backword String");
for(int i=str.length()-1;i>=0;i--) {	
System.out.println(str.charAt(i));
	
}

	}

}
