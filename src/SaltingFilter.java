
public class SaltingFilter implements Filter {
	private String salt = "ManchesterUnited";
	
	
	public void execute(UserModel acc){
		
		String passw = acc.getPassword();
		passw = passw + salt;
		acc.setPassword(passw);
		System.out.println("password has been salted");	
	}
}
