package OnlineExamApplication_Helper;

import OnlineExamApplication_Question.*;
import java.util.*;
public class OnlineExamHelper {
    
	List list=new ArrayList();                         //or  //ArrayList list=new ArrayList();
	
	public void addNewQuestion(Question question)
	{
		list.add(question);
	}
	
	public void viewAllQuestions()
	{
		for(Object obj:list)
		{
			Question q=(Question)obj;
			System.out.println(q.getId()+"\t"+q.getName()+"\t"+q.getOption1()+"\t"+q.getOption2()+"\t"+q.getOption3()+"\t"+q.getOption4()+"\t"+q.getAnswer());
		}
	}
	
	public void removeQuestion(int questionId)
	{
		for(Object obj:list)
		{
		
		    Question q=(Question)obj;
		     int qid=q.getId();
		
		if(qid==questionId)
		{
			    int index=list.indexOf(q);
			    if(index!=-1)
			    {
				list.remove(index);
			    }
		}
		System.out.println(q.getId()+"\t"+q.getName()+"\t"+q.getOption1()+"\t"+q.getOption2()+"\t"+q.getOption3()+"\t"+q.getOption4()+"\t"+q.getAnswer());
		}
	}
		
     public boolean searchQuestion(String questionName)
     {
    	 Iterator i=list.iterator();
    	 boolean b=false;
    	 while(i.hasNext())
    	 {
    		 Object obj=i.next();
    		 Question q=(Question)obj;
    		 String question=q.getName();
    		 if(question.equals(questionName))
    		 {
    			 b=true;
    			 break;
    		 }
    	 }
    	 return b;
    	 
    	 
     }
     int count=0;
     public void attemptQuestion(int questionId,String answer)
     {
    	 
    	 for(Object obj:list)
    	 {
    		 
    		 Question q=(Question)obj;
    		 int qid=q.getId();
    		 String ans=q.getAnswer();
    		 if(qid==questionId && ans.equals(answer))
    		 {
    			 
				++count;
    		 }
    	 }
    	 
     }
     
     public void showResult()
     {
    	 if(list.size()!=0)
    	 {
    	 float totalQuestion=(float)list.size();
    	 float  incorrectQuestion=totalQuestion-count;
    	 float per=count/totalQuestion;
    	 System.out.println("Percentage achieve by student  "+(per*100));
    	 
     }
    	 else
    	 {
    		 System.out.println("Please add question in test then you get result");
    		 
    	 }

}
}

