
public class OffensiveWordFilter implements Filter {
	//UserModel acc = UserModel.getAccount();
	
	//private String username = acc.getUsername();
	
	public String[] offensiveList = {
			"anal",
			"anus",
			"arse",
			"ass",
			"ballsack",
			"bastard",
			"bitch",
			"biatch",
			"bloody",
			"blowjob",
			"blow job",
			"bollock",
			"bollok",
			"boner",
			"boob",
			"bugger",
			"bum",
			"butt",
			"buttplug",
			"Chelsea",
			"clitoris",
			"cock",
			"coon",
			"crap",
			"cunt",
			"damn",
			"dick",
			"dildo",
			"dyke",
			"fag",
			"feck",
			"fellate",
			"fellatio",
			"felching",
			"fuck",
			"f u c k",
			"fudgepacker",
			"fudge packer",
			"flange",
			"Goddamn",
			"God damn",
			"hell",
			"homo",
			"jerk",
			"jizz",
			"knobend",
			"knob end",
			"labia",
			"lmao",
			"lmfao",
			"muff",
			"nigger",
			"nigga",
			"omg",
			"penis",
			"piss",
			"poop",
			"prick",
			"pube",
			"pussy",
			"queer",
			"scrotum",
			"sex",
			"shit",
			"s hit",
			"sh1t",
			"slut",
			"smegma",
			"spunk",
			"tit",
			"tosser",
			"turd",
			"twat",
			"vagina",
			"wank",
			"whore",
			"wtf"
			};
	
	public void execute(UserModel acc){ //checks to see if pass or username = to offensiveword
		
		String username = acc.getUsername();
		
		for(int i = 0; i < offensiveList.length; i++){
			if(username.equalsIgnoreCase(offensiveList[i])){
				System.out.println("username is Offensive");
				boolean check = true;
				acc.setOffensive(check);
				return;
			} else{
				boolean check = false;
				acc.setOffensive(check);
			}	
		}
		System.out.println("username is not Offensive");
	}

}
