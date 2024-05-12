package ClientApplication;
import java.util.*;

import MidApp.AddAplication;
import Module_App.FoodIteams;
public class DriverItemApplication {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		AddAplication ad=new AddAplication();
		int choice;
		do {
			System.out.println("1:Login User:");
			System.out.println("2:Register User:");
			System.out.println("Enter the choice");
			choice=xyz.nextInt();
			switch(choice)
			{
			case 1:
				xyz.nextLine();
				System.out.println("Enter the login id");
				String id=xyz.nextLine();
				System.out.println("Enter the password");
				String pass=xyz.nextLine();
				String b=ad.Login(id,pass);  //for this login refer public String Login(String Password, String id) in AddAplication file. 
				if(b.equals("Manager"))
				{
					System.out.println("Manager login Succesfully!!");
					int ch;
					do {
						System.out.println("1:Add food items:");
						System.out.println("2:Display food items:");
						System.out.println("3:Update food items by name and price:");
						System.out.println("4:Delete food items:");
						System.out.println("5:Display Sales:");
						System.out.println("6:Display all customers:");
						System.out.println("press zero to exit");
						System.out.println("Enter the choice");
						ch=xyz.nextInt();
						switch(ch)
						{
						case 1:
							//xyz.nextLine();
							System.out.println("Enter the food id");
							int fid=xyz.nextInt();
							System.out.println("Enter the food name");
							String fname=xyz.nextLine();
							xyz.nextLine();
							System.out.println("Enter the food price");
							int price=xyz.nextInt();
							xyz.nextLine();
							System.out.println("Enter the food category");
							String category=xyz.nextLine();
							FoodIteams fi=new FoodIteams(fid,fname,price,category);
							boolean b1=ad.addFoodItems(fi);                 //refer method public boolean addFoodItems(FoodIteams fd) in AddAplication.
							if(b1)
							{
								System.out.println("Food items Added succesufully in Menu!!");
							}
							else
							{
								System.out.println("Somthing wrong");
							}
							break;
						case 2:
							System.out.println("==================Menu==================");   //refer public void ShowFoodItems() method in AddAplication.
							ad.ShowFoodItems();
							break;
						
						case 3:
							System.out.println("Enter the id to update the food details");
							int fid1=xyz.nextInt();
							ad.UpdateData(fid1);
							System.out.println("Press 2 for view the updated food details");
							
						case 4:
							System.out.println("Enter the food item id to delete the food item");
							int did=xyz.nextInt();
							boolean b2=ad.DeleteData(did);   //refer public boolean DeleteData(int id) in AddAplication
							if(b2)
							{
								System.out.println("Food Item deleted Succesfully!!");
							}
							else
							{
								System.out.println("Somthing wrong");
							}
							break;
						case 5:
							System.out.println("All Sales pf today is:");
							ad.TotalSale();  //refer public void TotalSale() in AddAplication.
							break;
						case 6:
							System.out.println("All registerd Customers");
							ad.showAllCustomer();
						}
						
							
						
					}while(ch!=0);
				}
				else if(b.equals("Customer"))
				{
					System.out.println("Customer Login Sucessfully!!");
					int ch;
					do {
						System.out.println("1:Display all the food Iteams");
						System.out.println("2:Purchase food items");
						System.out.println("3:Display Total Bill");
						System.out.println("4:Search iteam between price range");
						System.out.println("5:Search Food Iteam by Category");
						System.out.println("Enter your choice");
						ch=xyz.nextInt();
						switch(ch)
						{
						case 1:
							System.out.println("==================Menu==================");  
							ad.ShowFoodItems();
							break;
						case 2:
							ad.ShowFoodItems();
							ad.purchaseFoodItems();
							break;
						case 3:
							ad.TotalBill();
							break;
						case 4:
							System.out.println("Enter the range for search the food Items");
							int start=xyz.nextInt();
							int end=xyz.nextInt();
							ad.SearchInRange(start,end);
							break;
						case 5:
							System.out.println("Enter the Category for search food item:");
							String cat=xyz.nextLine();
							ad.Caregory(cat);
							break;
							
						}
						
					}while(ch!=0);
				}
			else
			{
				System.out.println("Incorrect id and password");
			}
				break;
			case 2:
				ad.registration();
				break;
			}
		}while(choice!=0);
		

	}

}
