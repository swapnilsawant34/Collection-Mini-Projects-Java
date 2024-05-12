package Travelagency;
import java.util.*;

import passenger.Passenger;
public class TravelAgency {
    
	Stack s=new Stack();
	private static int seatNo;
	public TravelAgency()
	{
		seatNo=0;
	}
	public void addNewPassenger(Passenger p)
	{
		++seatNo;
		p.setSeatNo(seatNo);
		s.push(p);
	}
	
	public ListIterator getAllPassengers()
	{
		ListIterator li=s.listIterator(s.size());
		return li;
	}
	public void removePassenger()
	{
		boolean b=s.isEmpty();
		if(b)
		{
			System.out.println("No passenger in bus");
		}
		else
		{
			s.pop();
		}
	}
	public int getPassengerCount()
	{
	//int count=s.size();
	//return count;
		
		return s.size();
	}

}
