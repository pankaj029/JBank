import java.util.Date;

public class Transaction {
	
	private int transId;
	private String custId;
	private double amount;
	private char type;
	private Date transDate;
	
	
	public int getTransId(){
		return transId;
	}
	
	public void setTransId(int transId){
		this.transId = transId;
	}
	
	public String getCustId(){
		return custId;
	}
	
	public void setCustId(String custId){
		this.custId = custId;
	}
	
	public double getAmount(){
		return amount;
	}
	
	public void setAmount(Double amount){
		this.amount = amount;
	}
	
	public char getType(){
		return type;
	}
	
	public void setType(char type){
		this.type = type;
	}
	
	public Date getTransDate(){
		return transDate;
	}
	
	public void setTransDate(Date transDate){
		this.transDate = transDate;
	}

}
