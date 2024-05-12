package MidApp;
import java.util.*;

import Module_App.FoodIteams;
import Module_App.UserRegister;
public class AddAplication {
        ArrayList al=new ArrayList();
        Vector v=new Vector();
        ArrayList billcoll=new ArrayList();
        Scanner xyz=new Scanner(System.in);
	

	public String Login(String id,String Password) {
		String x="xyz";                                    // please refer System.out.println("1:Login User:"); and case 1 and UserRgister class.
		for(Object obj:v)
		{
			UserRegister ur=(UserRegister)obj;
			//if(Password.equals(ur.getPassword())&& id.equals(ur.getUid()))
			if(id.equals(ur.getUid()) && Password.equals(ur.getPassword()))
			{
				x=ur.getType();
			}
		}
		return x;
	}
	public boolean addFoodItems(FoodIteams fd)
	{
		boolean b=al.add(fd);
		return b;
	}
	public void ShowFoodItems()
	{
		for(Object obj:al)
		{
			FoodIteams fi=(FoodIteams)obj;
			System.out.println(fi.getId()+"\t"+fi.getName()+"\t"+fi.getPrice()+"\t"+fi.getCategory());
			
		}
	}
	
	public void UpdateData(int id)  //food id
	{
		
		for(Object obj:al)
		{
			FoodIteams fi=(FoodIteams)obj;
			if(id==fi.getId())
			{
				int ch;
				do {
					System.out.println("1:update food name:");
					System.out.println("1:update food price:");
					System.out.println("press 0 for exit");
					System.out.println("Enter the choice");
					ch=xyz.nextInt();
					
					switch(ch)
					{
					case 1:
						xyz.nextLine();
						System.out.println("Enter the name for change current food name:");
						String cname=xyz.nextLine();
						fi.setName(cname);
						break;
					case 2:
						System.out.println("Enter the name for change current food name:");
						int cprice=xyz.nextInt();
						fi.setPrice(cprice);
						break;
					}
				}while(ch!=0);
				
			}
			
		}
	}
	
	public boolean DeleteData(int id)
	{
		boolean t=false;
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			FoodIteams fi=(FoodIteams)i.next();
			if(id==fi.getId())
			{
				i.remove();
				t=true;
			}
		}
		return t;
	}
	
	public void TotalSale()
	{
		int tsale=0;
		for(Object obj:billcoll)
		{
			int bill=(int)obj;
			tsale=tsale+bill;
			
		}
		System.out.println(tsale);
	}
	
	public void showAllCustomer()
	{
		for(Object obj:v)
		{
			int c=1;
			UserRegister ur=(UserRegister)obj;
			if(ur.getType().equals("Customer"))
			{
				System.out.println("Customer "+c++);
				System.out.println("================================================");
				System.out.println(ur.getUid()+"\t"+ur.getUname()+"\t"+ur.getUcontact()+"\t"+ur.getPassword());
			}
			System.out.println();
		}
	}
	int tbill;
	public void purchaseFoodItems()
	{
		int ch;
		do {
			System.out.println("Press any number other than 0 to continue order:");
			System.out.println("Enter the choice");
			ch=xyz.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter the food id and Quantity");
				int fid=xyz.nextInt();
				int qty=xyz.nextInt();
				for(Object obj:al)
				{
					int bill=0;
					FoodIteams fi=(FoodIteams)obj;
					if(fid==fi.getId())
					{
						bill=fi.getPrice()*qty;
					}
					tbill=tbill+bill;
				}
				break;
			}
			
		}while(ch!=0);
	}
	public void TotalBill()
	{
		System.out.println("Total bill is:"+tbill);
		billcoll.add(tbill);
	}
	public void SearchInRange(int start,int end)
	{
		for(Object obj:al)
		{
			FoodIteams fi=(FoodIteams)obj;
			if(fi.getPrice()>start && fi.getPrice()<end)
			{
				System.out.println(fi.getId()+"\t"+fi.getName()+"\t"+fi.getPrice()+"\t"+fi.getCategory());
			}
		}
	}
	
	public void Caregory(String cat)
	{
		for(Object obj:al)
		{
			FoodIteams fi=(FoodIteams)obj;
			if(fi.getCategory().equals(cat))
			{
				System.out.println(fi.getId()+"\t"+fi.getName()+"\t"+fi.getPrice()+"\t"+fi.getCategory());
			}
		}
	}
	
	public void registration()
	{
		System.out.println("a) User type is Manager:");
		System.out.println("b) User type is Customer:");
		System.out.println("Please select option");
		char ch=xyz.next().charAt(0);
		
		 switch(ch)
		 {
		 case 'a':
			 String type="Manager";
			 xyz.nextLine();
			 System.out.println("Enter the name of User");
			 String name=xyz.nextLine();
			 System.out.println("Enter the Login id");
			 String lid=xyz.nextLine();
			 System.out.println("Enter the contact of the User");
			 String contact=xyz.nextLine();
			 System.out.println("Enter the password:");
			 String password=xyz.nextLine();
			 UserRegister ur= new UserRegister(name,contact,type,lid,password);
			 boolean b=v.add(ur);
			 if(b)
			 {
				 System.out.println("User Registration proccess succesfullyy!!");
			 }
			 else
			 {
				 System.out.println("User not added");
			 }
			 break;
			 
		 case 'b':
			 String type1="Customer";
			 xyz.nextLine();
			 System.out.println("Enter the name of User");
			 String name1=xyz.nextLine();
			 System.out.println("Enter the Login id");
			 String lid1=xyz.nextLine();
			 System.out.println("Enter the contact of the User");
			 String contact1=xyz.nextLine();
			 System.out.println("Enter the password:");
			 String password1=xyz.nextLine();
			 UserRegister ur1= new UserRegister(name1,contact1,type1,lid1,password1);
			 boolean b1=v.add(ur1);
			 if(b1)
			 {
				 System.out.println("User Registration proccess succesfullyy!!");
			 }
			 else
			 {
				 System.out.println("User not added");
			 }
			 break;
			 
		 }
	}

}
