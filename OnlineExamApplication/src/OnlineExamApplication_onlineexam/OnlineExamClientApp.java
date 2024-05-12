package OnlineExamApplication_onlineexam;
import java.util.*;

import OnlineExamApplication_Helper.OnlineExamHelper;
import OnlineExamApplication_Question.Question;
public class OnlineExamClientApp {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		OnlineExamHelper helper=new OnlineExamHelper(); 
	do {
		System.out.println("Welcome to Online Exam Application");
		System.out.println("Enter the choice");
		int choice=xyz.nextInt();
		
		switch(choice)
		{
		case 1:
			xyz.nextLine();
			System.out.println("Enter the question id");
			int qid=xyz.nextInt();
			xyz.nextLine();
			System.out.println("Enter the question");
			String question=xyz.nextLine();
			
			System.out.println("Enter the option1");
			String option1=xyz.nextLine();
			System.out.println("Enter the option2");
			String option2=xyz.nextLine();
			System.out.println("Enter the option3");
			String option3=xyz.nextLine();
			System.out.println("Enter the option4");
			String option4=xyz.nextLine();
			
			System.out.println("Enter the answer");
			String ans=xyz.nextLine();
			
			Question q=new Question();
			q.setId(qid);
			q.setName(question);
			q.setOption1(option1);
			q.setOption2(option2);
			q.setOption3(option3);
			q.setOption4(option4);
			q.setAnswer(ans);
			
			helper.addNewQuestion(q);
		break;
		
       case 2:
			System.out.println("Enter the question id which you want to remove");
			int questionId=xyz.nextInt();
			helper.removeQuestion(questionId);
		break;
		
       case 3:
    	   helper.viewAllQuestions();
			
			break;
         
       case 4:
    	   System.out.println("Enter the question for search");
    	   xyz.nextLine();
    	    question=xyz.nextLine();
    	   boolean b=helper.searchQuestion(question);
    	   
    	   if(b)
    	   {
    		   System.out.println("Question Found");
    	   }
    	   else
    	   {
    		   System.out.println("Question not Found");
    	   }
    	   
    	   break;
    	   
       case 5:
    	   xyz.nextLine();
    	   System.out.println("Enter the answer");
    	   ans=xyz.nextLine();
    	   
    	   System.out.println("Enter the question number");
    	   qid=xyz.nextInt();
    	  helper.attemptQuestion(qid,ans);
    	  
    	   
       break;
       
       case 6:
    	   
    	   helper.showResult();
       break;
		default:
			System.out.println("Invalid choice");
		}

	}while(true);

}
}
