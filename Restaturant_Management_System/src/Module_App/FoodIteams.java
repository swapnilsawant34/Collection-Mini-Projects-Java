package Module_App;

public class FoodIteams {

	private int id; //food id
	private String name; //food name
	private int price;
	private String category;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public FoodIteams(int id,String name,int price,String Category)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.category=Category;
	}
	

}
