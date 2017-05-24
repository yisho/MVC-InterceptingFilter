
public class EasyPasswordFilter implements Filter {
	
	public String[] easyWordList = {"password", "123","1234","12345","123456","1234567",
			"12345678","123456789","pass","696969",	
			"mustand","master","baseball","abc","abc123","6969",
			"2000","test","batman","robet","access","admin",
			"love","soccer","hockey","killer","sexy","andrew","superman","dallas",
			"pepper","golfer","summer","healther","biteme","cowboy","silver","orange",
			"121212","secret","admin","111","1111","11111","111111","computer","aaa",
			"aaaa","aaaaa","aaaaaaa","xxx","xxxx","xxxxx","xxxxxx","hardcore","smokey",
			"1212","1337","222","2222","22222","222222","7777","777","77777","777777",
			"bill","eagle1","mother","father","2323","dirty","ford","pizza","food",
			"Chelsea", ""};
	
	
	
	public void execute(UserModel acc){
		
		String passw = acc.getPassword();
		
		for(int i = 0; i < easyWordList.length; i++){
			if(passw.equalsIgnoreCase(easyWordList[i]) || passw.equals(easyWordList[i]+"ManchesterUnited")){
				System.out.println("password is too Easy");
				boolean check = true;
				acc.setEasy(check);
				return;
			}else{
				boolean check = false;
				acc.setEasy(check);
			}
		}
		System.out.println("password is secure");
		
	}
	
}
