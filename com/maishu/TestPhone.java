package com.PackageMaiUncle;


public class TestPhone
{
	public static void main(String[] args)
	{
		 Phone p = new Phone("HuaWei","HonorPlus");
		 // p.call("12345678912");
		 // p.call("244222525242");
		// p.brand = "huawei"; 
		 // System.out.println(p.brand);
		 // p.model = "Honor6Plus";
		 System.out.println(p.model);
		 Phone p2 = new Phone();
		 
		 Phone p3 = new Phone("Apple","7Plus",5000);
		 System.out.println(p3.price);
	}
}	