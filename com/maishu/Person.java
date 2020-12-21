package com.maishu;

public class Person
{
	private String name;
	private int age;
	private String idNumber;
	public Phone phone;
	
	public Person(String name,int age,String idNumber)
	{
		this.name= name;
		this.age = age;
		this.idNumber = idNumber;
	}
	
	public String getName()
	{
		return name;
	}
	
	protected int getAge()
	{
		return age;
	}
	
	public void increaseAge()
	{
		age = age + 1;
	}
	
	public void celebrateBirthDay()
	{
		System.out.println("过生日了,生日礼物呢?");
		increaseAge();
	}
	
	public String getIDNumber(String whoAreYou)
	{
		if(whoAreYou == "Police")
		{
			return idNumber;
		}
		else
			return "";
	}
}