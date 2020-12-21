using System;
using System.Threading;

namespace _01
{
	class Program
	{
		static void Main(string[] args)
		{
			Customer customer = new Customer();
			//事件的拥有者
			Waiter waiter = new Waiter();//事件的响应者
			
			customer.Order +=waiter.Action;
			customer.Action();
			customer.PayTheBill();
		}
	}
	
	public delegate void OrderEventHandler(customer customer,OrderEventArgs e);
	
	public class OrderEventArgs:EventArgs
	{
		public string DishName{get;set;}
		public string Size{get;set;}
	}
	
	public class Customer//事件拥有者
	{
		private OrderEventHandler orderEventHandler;//引用事件处理器
		add//addd remove 是什么?从何而来?value呢?
		{
			this.orderEventHandler += value;
		}
		remove
		{
			this.orderEventHandler -=value;
		}
		
		public double Bill{get;set;}
		public void PayTheBill()
		{
			Console.WriteLine("customer will pay ${0}",this.Bill);
		}
		
		public void WalkIn()
		{
			Console.WriteLine("Customer walks into the restauant.");
		}
		
		public void SitDown()
		{
			Console.WriteLine("Customer sits down");
		}
		
		public void Think()
		{
			for(int i = 0;i<5;i++)
			{
				Console.WriteLine("Let customer think...");
				Thread.Sleep(1000);
			}
			if(this.orderEventHandler != null)
			{
				orderEventArgs e = new OrderEventArgs();
				e.DishName = "Kongpao Chiken";
				e.Size = "Large";
				this.orderEventHandler.Invoke(this.e);//invoke 的意思
			}
		}
		public void Action()
		{
			Console.ReadLine();
			this.WalkIn();
			this.SitDown();
			this.Think();
		}
		
	}
	public class Waiter
	{
		public void Action(Customer customer,orderEventArgs e)
		{
			Console.WriteLine("waiter will serve the dish {0}",e.DishName);
			double price = 10;
			switch(e.Size)
			{
				case "small":
					price = price *5;
					break;
				case "large"
					price = price * 1.5;
					break;
				default:
					break;
			}
			customer.Bill += price;
		}
	}
}