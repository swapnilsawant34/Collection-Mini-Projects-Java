package clientApp;
import java.util.*;
import Travelagency.TravelAgency;
import passenger.Passenger;

public class TravelAgencyApplication {

	public static void main(String[] args) {
		Scanner xyz= new Scanner(System.in);
		TravelAgency agency=new TravelAgency();
		
		do {
			
			System.out.println("1:Add new Passenger");
			System.out.println("2:View All passenger");
			System.out.println("3:Remove Passenger");
			System.out.println("4:count the no. of passenger");
			
			
			System.out.println("Enter the choice");
			int choice=xyz.nextInt();
			switch(choice)
			{
			case 1:
				xyz.nextLine();
				Passenger p=new Passenger();
				System.out.println("Enter the name of passenger");
				String name=xyz.nextLine();
				
				System.out.println("Enter the contact of passenger");
				String contact=xyz.nextLine();
				
				System.out.println("Enter source location of passenger");
				String source=xyz.nextLine();
				
				System.out.println("Enter the destination location of passenger");
				String dest=xyz.nextLine();
				
				p.setName(name);
				p.setContact(contact);
				p.setSource(source);
				p.setDest(dest);
				
				agency.addNewPassenger(p);
				break;
				
			case 2:
				ListIterator li=agency.getAllPassengers();
				
				while(li.hasPrevious())
				{
					Object obj=li.previous();
					 p = (Passenger) obj;
					System.out.println(p.getSeatNo()+"\t"+p.getName()+"\t"+p.getContact()+"\t"+p.getSource()+"\t"+p.getDest());
				}
				break;
			case 3:
				agency.removePassenger();
				break;
			case 4:
				//int count=agency.getPassengerCount();
				//System.out.println("Now passenger in the bus:"+count);
				System.out.println("Now passenger in the bus:"+agency.getPassengerCount());
				break;
				default:
					System.out.println("Invalid Choice");
					break;
			}
			
		}while(true);

	}

}
