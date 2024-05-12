package ReviewRatingApplication_ClientApp;
import java.util.*;

import ReviewRatingApplication_Rating.RatingCounter;
import ReviewRatingApplication_Teacher.Teacher;
public class RatingClientApplication {

	public static void main(String[] args) {
		RatingCounter r= new RatingCounter();
		Scanner xyz=new Scanner(System.in);
		
		do {
			
			System.out.println("1:Add New Teacher");
			System.out.println("2:Rate to Teacher");
			System.out.println("3:View Teacher Rating");
			System.out.println("4:View Positive Rating");
			System.out.println("5:View Negative Rating");
			System.out.println("6:View Average Rating");
			
			System.out.println("Enter the choice");
			int choice=xyz.nextInt();
			
			switch(choice)
			{
			case 1:
				xyz.nextLine();
				System.out.println("Enter the teacher name");
				String name=xyz.nextLine();
				
				System.out.println("Enter the id of teacher");
				int id=xyz.nextInt();
				
				Teacher t=new Teacher();
				t.setId(id);
				t.setName(name);
				
				boolean b=r.isAddTeacher(t);
				if(b)
				{
					System.out.println("Teacher added Successfully.......!");
				}
				else
				{
					System.out.println("Teacher Not added.................!");
				}
			  break;
			case 2:
				xyz.nextLine();
				System.out.println("Enter the teacher name");
				name=xyz.nextLine();
				
				System.out.println("Enter the text review for teacher");
				String textReview=xyz.nextLine();
				
				System.out.println("Enter the id of teacher");
				id=xyz.nextInt();
				
				System.out.println("Enter the rating to teacher");
				int rating=xyz.nextInt();
				
				
				r.rateToTeacher(rating, name, id, textReview);
				break;
			case 3:
				r.viewAllRating();
				break;
			case 4:
				r.viewPositiveReview();
				
				
				break;
			case 5:
				r.viewNegativeReview();
				break;
			case 6:
				r.viewAverageReview();
				break;
			case 7:
				System.exit(0);
				break;
			
			default:
				System.out.println("Invalid choice");
			}
			
			
		}while(true);

	}

}
