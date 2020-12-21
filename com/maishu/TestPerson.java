package com.maishu;

public class TestPerson
{
	
	public static void main(String[] args)
	{
		Person p = new Person("张三",21,"555555555");
		
		System.out.println(p.getName());
		System.out.println(p.getIDNumber(
		"Police"));
		p.celebrateBirthDay();
		System.out.println(p.getAge());
		
		Phone newPhone = new Phone("华为","荣耀");
		
		p.phone = newPhone;
		
		System.out.println(p.phone.model);
		
		
	}
}