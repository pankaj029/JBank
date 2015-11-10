import java.util.Date;

public class TransLog {

	private int transId;
	private String custId;
	private double amount;
	private int logNo;
	private Date transDate;
	
	public int getTransId(){
		return transId;
	}
	
	public void setTransId(int transId){
		this.transId = transId;
	}
	
	
	public int getLogNo(){
		return logNo;
	}
	
	public void setLogNo(int logNo){
		this.logNo = logNo;
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
	
		
	public Date getTransDate(){
		return transDate;
	}
	
	public void setTransDate(Date transDate){
		this.transDate = transDate;
	}

}
