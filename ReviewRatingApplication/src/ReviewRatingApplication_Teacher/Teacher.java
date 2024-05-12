package ReviewRatingApplication_Teacher;
import java.util.*;
public class Teacher {

	private String name;
	private int id;
	private ArrayList rating;
	private int count;
	private ArrayList textReview;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList getRating() {
		return rating;
	}
	public void setRating(ArrayList rating) {
		this.rating = rating;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public ArrayList getTextReview() {
		return textReview;
	}
	public void setTextReview(ArrayList textReview) {
		this.textReview = textReview;
	}

}
