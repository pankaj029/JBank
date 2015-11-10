import java.util.Date;

public class Customer {
	
	private String custId;
	private String name;
	private char type;
	private Date doj;
	
	
	public String getCustId(){
		return custId;
	}
	
	public void setCustId(String custId){
		this.custId = custId;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public char getType(){
		return type;
	}
	
	public void setType(char type){
		this.type = type;
	}
	
	public Date getDoj(){
		return doj;
	}
	
	public void setDoj(Date doj){
		this.doj = doj;
	}
}
