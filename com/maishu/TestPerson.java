package com.maishu;

public class TestPerson
{
	
	public static void main(String[] args)
	{
		Person p = new Person("����",21,"555555555");
		
		System.out.println(p.getName());
		System.out.println(p.getIDNumber(
		"Police"));
		p.celebrateBirthDay();
		System.out.println(p.getAge());
		
		Phone newPhone = new Phone("��Ϊ","��ҫ");
		
		p.phone = newPhone;
		
		System.out.println(p.phone.model);
		
		
	}
}