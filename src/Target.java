
public class Target {

	public void execute(UserModel acc){
		
		boolean checkU = acc.getOffensive();
		boolean checkP = acc.getEasy();
		String reportU = "";
		String reportP = "";
//		String reportF = "";
		
		
		if(checkU == true){
			System.out.println("Your username did not meet requirements");
			reportU = "Your username did not meet requirements";
		} else{
			reportU = "Your username met requirements";
		}

		if(checkP == true){
			System.out.println("password did not meet requirements");
			reportP = "password did not meet requirements";
		} else{
			reportP = "password met requirements";
		}
		
//		if(checkU == false && checkP == false){
//			System.out.println("Username and password have been saved");
//			reportF = "Username and password have been saved";
//		} else{
//			System.out.println("Username and password was not saved");
//			reportF = "Username and password was not saved";
//		}
		acc.setStatusU(reportU);
		acc.setStatusP(reportP);
//		acc.setStatusF(reportF);
	}
}
