
public class UserModel {
	
	private static UserModel account = new UserModel();
	private UserModel (){}
	
	public static UserModel getAccount(){
		return account;
	}
	
	private String username;
	private String password;
	private boolean passU;
	private boolean passP;
	private String statusU;
	private String statusP;
	private String statusF;
	
	public void setStatusU(String report){
		statusU = report;
	}
	
	public String getStatusU(){
		return statusU;
	}
	
	public void setStatusP(String report){
		statusP = report;
	}
	
	public String getStatusP(){
		return statusP;
	}
	
	public void setStatusF(String report){
		statusF = report;
	}
	
	public String getStatusF(){
		return statusF;
	}
	
	public void setUsername(String input){
		username = input;
	}
	
	public String getUsername(){
		return username;
	}
	
	public void setPassword(String input){
		password = input;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setOffensive(boolean check){
		passU = check;
	}
	
	public boolean getOffensive(){
		return passU;
	}
	
	public void setEasy(boolean check){
		passP = check; 
	}
	public boolean getEasy(){
		return passP;
	}
}
