package com.maishu;


 public class Phone
//����ʹ��pascal������
{
	public String brand;
	public String model;
	public int price;
	public String owner;
	
	public Phone(String brand,String model)
	{
		this.brand = brand;
		this.model = model;
		
	}
	
	public Phone()
	{
		
	}
	
	public Phone(String brand, String model,int price)
	{
		this.brand =brand;
		this.model = model;
		this.price = price +100;
	}
	
	Boolean call(String phoneNumber)
	{
		System.out.println("���ڸ�"+phoneNumber+"��绰");
		if(phoneNumber.length()==11)
		{
			System.out.println("��绰�ɹ�");
			return true;
		}
		else
		{
			System.out.println("����λ������,��绰ʧ��");
			return false;
		}
		
	}
	
	void text(String phoneNumber,String msg)
	{
		
	}
	
	
}
