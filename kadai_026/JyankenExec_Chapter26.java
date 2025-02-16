package kadai_026;

public class JyankenExec_Chapter26 {

	 public static void main(String[] args) {
	        Jyanken_Chapter26 game = new Jyanken_Chapter26();
	        String myChoice = game.getMyChoice();
	        String random = game.getRandom();
	        game.playGame(myChoice, random);
	    }
	}


