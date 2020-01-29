package com.klu;

import java.util.Scanner;

public class Student {
	int studentNo;
	double cgpa;
	String studentName;
	void readData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num");
		studentNo=sc.nextInt();
		System.out.println("Enter name");
		studentName=sc.next();
		System.out.println("Enter cgpa");
		cgpa=sc.nextDouble();
	}
	void printDetails()
	{
		System.out.println("number"+studentNo);
		System.out.println("name"+studentName);
		System.out.println("cgpa"+cgpa);
	}
	public static void main(String [] args)
	{
		Student s=new Student();
		s.readData();
		s.printDetails();
	}
}
