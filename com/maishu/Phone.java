package com.maishu;


 public class Phone
//类名使用pascal命名法
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
		System.out.println("正在给"+phoneNumber+"打电话");
		if(phoneNumber.length()==11)
		{
			System.out.println("打电话成功");
			return true;
		}
		else
		{
			System.out.println("号码位数不对,打电话失败");
			return false;
		}
		
	}
	
	void text(String phoneNumber,String msg)
	{
		
	}
	
	
}
