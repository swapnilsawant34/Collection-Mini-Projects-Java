package ReviewRatingApplication_Rating;
import java.util.*;

import ReviewRatingApplication_Teacher.Teacher;
public class RatingCounter {
         LinkedList teacherList =new LinkedList();
	
         public boolean isAddTeacher(Teacher teacher)
         {
        	boolean b= teacherList.add(teacher);
        	return b;
         }
         
         public void rateToTeacher(int rating,String name,int id,String textReview)
         {
        	 boolean flag=false;
        	 Teacher t=null;
        	 for(Object obj:teacherList)
        	 {
        		  t=(Teacher)obj;
        		 String n=t.getName();
        		 int i=t.getId();
        		 
        		 if(n.equals(name) && i==id)
        		 {
        			flag=true;
        			break;
        		 }
        		
        	 }
        	 if(flag)
        	 {
        		 ArrayList ratingArrayList=t.getRating();
        		 if(ratingArrayList==null)
        		 {
        			 ratingArrayList =new ArrayList();
        			 
        		 }
        		 ratingArrayList.add(rating);
        		 ArrayList textReviewList=t.getTextReview();
        		 if(textReviewList==null)
        		 {
        			 textReviewList=new ArrayList(); 
        		 }
        		 textReviewList.add(textReview);
        		 t.setRating(ratingArrayList);
        		 t.setTextReview(textReviewList);
        	 }
        	 else
    		 {
    			 System.out.println("Teacher not found for Rating");
    		 }
        	 
        	 
         }
         
         public void viewAllRating()
         {
        	 for(Object obj:teacherList)
        	 {
        		 Teacher t=(Teacher)obj;
        		 
        		 System.out.println(t.getId()+"\t"+t.getName()+"\t"+t.getRating()+"\t"+t.getTextReview());
        	 }
         }
         
         public void viewPositiveReview()
         {
        	// String reviews[]= {"good","excellent","better"};
        	
        	 for(Object obj:teacherList)
        	 {
        		 Teacher t=(Teacher)obj;
        		 
        		 ArrayList reviewList=(ArrayList)t.getTextReview();
        		 
        		 Iterator i=reviewList.iterator();
        		 
        		 System.out.println("View positive Reviews");
        		 while(i.hasNext())
        		 {
        			 String review=(String)i.next();
        			 
        			 if(review.equals("good") ||review.equals("exellent") || review.equals("better"))
        			 {
        				System.out.println(review); 
        			 }
        		 }
        	 }
        			 
         }
         
         public void viewNegativeReview()
         {
        	// String reviews[]= {"good","excellent","better"};
        	
        	 for(Object obj:teacherList)
        	 {
        		 Teacher t=(Teacher)obj;
        		 
        		 ArrayList reviewList=(ArrayList)t.getTextReview();
        		 
        		 Iterator i=reviewList.iterator();
        		 
        		 System.out.println("View negative Reviews");
        		 while(i.hasNext())
        		 {
        			 String review=(String)i.next();
        			 
        			 if(review.equals("bad") ||review.equals("worst") || review.equals("unclear"))
        			 {
        				System.out.println(review); 
        			 }
        		 }
        	 }
        			 
         }
         
         public void viewAverageReview()
         {
        	// String reviews[]= {"good","excellent","better"};
        	
        	 for(Object obj:teacherList)
        	 {
        		 Teacher t=(Teacher)obj;
        		 
        		 ArrayList reviewList=(ArrayList)t.getTextReview();
        		 
        		 Iterator i=reviewList.iterator();
        		 
        		 System.out.println("View average Reviews");
        		 while(i.hasNext())
        		 {
        			 String review=(String)i.next();
        			 
        			 if(review.equals("decent") ||review.equals("average"))
        			 {
        				System.out.println(review); 
        			 }
        		 }
        	 }
        			 
         }


}
