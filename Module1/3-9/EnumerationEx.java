package com.a39;


enum Student
{
	John(11), Bella(10), Sam(13), Viraaj(9);
	
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	private Student(int age) 
	{
		this.age= age;
	}
	
	
	
}

public class EnumerationEx 
{
	public static void main(String[] args) 
	{
		
			System.out.println(Student.Bella.getAge());
		
	}
}
