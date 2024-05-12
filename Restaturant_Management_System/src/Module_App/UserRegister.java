package Module_App;



public class UserRegister {

	private String uid;
	private String type;
	private String uname;
	private String ucontact;
	private String password;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUcontact() {
		return ucontact;
	}
	public void setUcontact(String ucontact) {
		this.ucontact = ucontact;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserRegister(String name,String contact,String type,String id,String password)
	{
		this.uid=id;
		this.type=type;
		this.uname=name;
		this.password=password;
		
	}

}
