import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/***********************************************************
* The PirateDuelInsults class contains the insults, 
* comebacks, and corresponding methods for use in a 
* small pirate duel role playing game (RPG).  
* Many of the pirate quotes are from the game 
* Monkey Island&trade; and were created by LucasArts&copy;.  
* This class is used for educational purposes only.  
* 
* @author Sal LaMarca
* @version 1.0, 01/28/2012
**********************************************************/
public class PirateDuelInsults{

	//The number of insults contained in the insults array
	private int numInsults = 31;
	//Stores the insults
	private String[] insults = new String[numInsults];
	//Stores the correct comebacks
	private String[] correctComebacks = new String[numInsults];
	//The number of random comebacks in the randomComebacks array
	private int numRandomComebacks = 31;
	//Stores the random comebacks
	private String[] randomComebacks = new String[numRandomComebacks];
	//Indexes the insultsUsed array to avoid repeats
	private int insultsUsedIndex = 0;
	//Store the insults used so far to avoid repeats
	private int[] insultsUsed = new int[3];
	//Indexes the randomComebacksUsed array to avoid repeats
	private int randomComebacksUsedIndex = 0;
	//Store the random comebacks used so far to avoid repeats
	private int[] randomCombacksUsed = new int[9];
	//Store the four comebacks after a call to getInsult()
	private String[] comebacks = new String[4];
	
	
	/***********************************************************
	* Initialize the insults, correct comebacks, and 
	* random comebacks for this class.
	**********************************************************/
	public PirateDuelInsults(){
		
		insults[0] = "This is the END for you, you gutter-crawling cur!";
		correctComebacks[0] = "And I've got a little TIP for you, get the POINT?";

		insults[1] = "Soon you'll be wearing my sword like a shish kebab!";
		correctComebacks[1] = "First you better stop waiving it like a feather-duster.";

		insults[2] = "My handkerchief will wipe up your blood!";
		correctComebacks[2] = "So you got that job as janitor, after all.";

		insults[3] = "People fall at my feet when they see me coming.";
		correctComebacks[3] = "Even BEFORE they smell your breath?";

		insults[4] = "I once owned a dog that was smarter then you.";
		correctComebacks[4] = "She must have taught you everything you know.";

		insults[5] = "You make me want to puke.";
		correctComebacks[5] = "You make me think somebody already did.";

		insults[6] = "Nobody's ever drawn blood from me and nobody ever will.";
		correctComebacks[6] = "You run THAT fast?";

		insults[7] = "You fight like a dairy farmer.";
		correctComebacks[7] = "How appropriate.  You fight like a cow.";

		insults[8] = "I got this scar on my face during a mighty struggle!";
		correctComebacks[8] = "I hope now you've learned to stop picking your nose.";

		insults[9] = "Have you stopped wearing diapers yet?";
		correctComebacks[9] = "Why, did you want to borrow one?";

		insults[10] = "I've heard you were a contemptible sneak.";
		correctComebacks[10] = "Too bad no one's ever heard of YOU at all.";

		insults[11] = "You're no match for my brains, you poor fool.";
		correctComebacks[11] = "I'd be in real trouble if you ever used them.";

		insults[12] = "You have the manners of a beggar.";
		correctComebacks[12] = "I wanted to make sure you'd feel comfortable with me.";

		insults[13] = "I'm not going to take your insolence sitting down!";
		correctComebacks[13] = "Your hemorrhoids are flaring up again, eh?";

		insults[14] = "There are no words for how disgusting you are.";
		correctComebacks[14] = "Yes there are.  You just never learned them.";

		insults[15] = "There are no clever moves that can help you now.";
		correctComebacks[15] = "Yes there are.  You just never learned them.";

		insults[16] = "I've got a long, sharp lesson for you to learn today.";
		correctComebacks[16] = "And I've got a little TIP for you, get the POINT?";

		insults[17] = "My tongue is sharper than any sword.";
		correctComebacks[17] = "First you better stop waiving it like a feather-duster.";
		
		insults[18] = "My name is feared in every dirty corner of this island!";
		correctComebacks[18] = "So you got that job as janitor, after all.";

		insults[19] = "My wisest enemies run away at the first sight of me!";
		correctComebacks[19] = "Even BEFORE they smell your breath?";

		insults[20] = "Only once have I met such a coward!";
		correctComebacks[20] = "He must have taught you everything you know.";

		insults[21] = "Time for you to lose.";
		correctComebacks[21] = "You make me think somebody already did.";

		insults[22] = "No one will ever catch ME fighting as badly as you do.";
		correctComebacks[22] = "You run THAT fast?";

		insults[23] = "I will milk every drop of blood from your body!";
		correctComebacks[23] = "How appropriate.  You fight like a cow.";

		insults[24] = "My last fight ended with my hands covered with blood.";
		correctComebacks[24] = "I hope now you've learned to stop picking your nose.";

		insults[25] = "I hope you have a boat ready for a quick escape.";
		correctComebacks[25] = "Why, did you want to borrow one?";

		insults[26] = "My sword is famous all over the Caribbean!";
		correctComebacks[26] = "Too bad no one's ever heard of YOU at all.";

		insults[27] = "I've got the courage and skill of a master duelist!";
		correctComebacks[27] = "I'd be in real trouble if you ever used them.";

		insults[28] = "Every word you say to me is stupid.";
		correctComebacks[28] = "I wanted to make sure you'd feel comfortable with me.";

		insults[29] = "You are a pain in the backside, sir!";
		correctComebacks[29] = "Your hemorrhoids are flaring up again, eh?";
		
		insults[30] = "public static void main";
		correctComebacks[30] = "(String[] argggggggggggggggggggssss)";
		
		
		randomComebacks[0] = "I'm shaking, I'm shaking.";
		randomComebacks[1] = "I'm rubber you're glue, your words bounce off me and stick to you.";
		randomComebacks[2] = "Go Dawgs!  Sic'em!  Woof, woof, woof!";
		randomComebacks[3] = "Ohhh, I'm so scared.";
		randomComebacks[4] = "1 + 1 == 10";
		randomComebacks[5] = "Circle, circle.  Dot, dot.  Now you got your cootie shot.";
		randomComebacks[6] = "M'kay.";
		randomComebacks[7] = "What the frak?";
		randomComebacks[8] = "Did you fail the Turing test?";
		randomComebacks[9] = "Huh?";
		randomComebacks[10] = "Ninjas pwn Pirates!";
		randomComebacks[11] = "I don't know everything. I just know more than you.";
		randomComebacks[12] = "This project is too geeky for me!";
		randomComebacks[13] = "Silence is golden.";
		randomComebacks[14] = "What would Watson do?";
		randomComebacks[15] = "Uber pwnage!";
		randomComebacks[16] = "I'm telling on you.";
		randomComebacks[17] = "There are 10 types of people: those who understand binary, and those who do not understand it.";
		randomComebacks[18] = "If at first you don't succeed, you must be a programmer.";
		randomComebacks[19] = "You had me at Hello World!";
		randomComebacks[20] = "My discontent for you is a monotonically increasing unbounded function.";
		randomComebacks[21] = "Oct 31 == Dec 25";
		randomComebacks[22] = "It's Dr. Evil, I didn't spend six years in Evil Medical School to be called \"mister\", thank you very much.";
		randomComebacks[23] = "Wait.  Let me ask Siri.";
		randomComebacks[24] = "Don't hate the player.  Hate the game.";
		randomComebacks[25] = "D'oh!";
		randomComebacks[26] = "A computer once beat me at chess, but it was no match for me at kick boxing.";
		randomComebacks[27] = "Always remember you're unique, just like everyone else.";
		randomComebacks[28] = "All generalizations are false, including this one.";
		randomComebacks[29] = "Be obscure clearly.";
		randomComebacks[30] = "I rant, therefore I am.";
			
	}

	/***********************************************************
	* Return a random pirate insult, and setup the four comebacks 
	* to be used in subsequent calls to getFirstComeback(), 
	* getSecondComeback(), getThirdComeback(), and
	* getFourthComeback().  One of the four comebacks will 
	* be the correct comeback, and the others will be 
	* random comebacks.
	* This method can only be called three times.  
	* After the third method call, this method returns an error message:
	* "Error:  getInsult() method cannot be called more than 3 times.".  
	* 
	* @return Return a random pirate insult.
	**********************************************************/
	public String getInsult(){
		if(insultsUsedIndex >= 3){
			return "Error:  getInsult() method cannot be called more than 3 times.";
		}
		Random randomObj = new Random(System.currentTimeMillis());
		int randomNum = randomObj.nextInt(numInsults);
		while(contains(randomNum, insultsUsed)){
			randomNum = randomObj.nextInt(numInsults);
		}
		insultsUsed[insultsUsedIndex] = randomNum;
		insultsUsedIndex++;
		String insult = insults[randomNum];
		setFourComebacks(insult);
		return insult;
	}
	
	/***********************************************************
	* Return the correct comeback for a given insult.
	* 
	* @param insult The insult to lookup.
	* @return Return the correct comeback for a given insult if
	* the insult is in this class.  Otherwise return
	* an error:  "Error:  correct comeback not found.".
	**********************************************************/
	public String getCorrectComeback(String insult){
		int insultIndex = -1;
		for(int i = 0; i < numInsults; i++){
			if(insults[i].equalsIgnoreCase(insult)){
				insultIndex = i;
			}
		}
		if(insultIndex == -1){
			return "Error:  correct comeback not found.";
		}
		return correctComebacks[insultIndex];
	}
	
	/***********************************************************
	* Set and shuffle the four comebacks array with three random
	* comebacks and the correct comeback for a given insult.
	*  
	* @param insult The insult to lookup the correct comeback
	* to put into the four comebacks array.
	 **********************************************************/
	private void setFourComebacks(String insult){
		Random randomObj = new Random(System.currentTimeMillis());
		int randomNum = randomObj.nextInt(numRandomComebacks);
		for(int i = 0; i < 3; i++){
			while(contains(randomNum, randomCombacksUsed)){
				randomNum = randomObj.nextInt(numRandomComebacks);
			}
			comebacks[i] = randomComebacks[randomNum];
			randomCombacksUsed[randomComebacksUsedIndex] = randomNum;
			randomComebacksUsedIndex++;
		}
		comebacks[3] = getCorrectComeback(insult);
		//Randomly shuffle the comebacks array
		Collections.shuffle(Arrays.asList(comebacks));
	}
	
	/***********************************************************
	* Return the first comeback after a call to getInsult().
	* This method needs to be called after a getInsult()
	* call.  The first comeback might be a random comeback or
	* the correct comeback.
	*
	* @return Return the first comeback.
	 **********************************************************/
	public String getFirstComeback(){
		return comebacks[0];
	}
	
	/***********************************************************
	* Return the second comeback after a call to getInsult().
	* This method needs to be called after a getInsult()
	* call.  The second comeback might be a random comeback or
	* the correct comeback.
	*
	* @return Return the second comeback.
	**********************************************************/
	public String getSecondComeback(){
		return comebacks[1];
	}
	
	/***********************************************************
	* Return the third comeback after a call to getInsult().
	* This method needs to be called after a getInsult()
	* call.  The third comeback might be a random comeback or
	* the correct comeback.
	*
	* @return Return the third comeback.
	**********************************************************/
	public String getThirdComeback(){
		return comebacks[2];
	}
	
	/***********************************************************
	* Return the fourth comeback after a call to getInsult().
	* This method needs to be called after a getInsult()
	* call.  The fourth comeback might be a random comeback or
	* the correct comeback.
	*
	* @return Return the fourth comeback.
	**********************************************************/
	public String getFourthComeback(){
		return comebacks[3];
	}
	
	/***********************************************************
	* Return true if the element is in the array.  Otherwise,
	* return false.
	*
	* @param element The element to search for
	* @param array The array to search through
	* @return Return true if the element is in the array.
	* Otherwise, return false.
	**********************************************************/
	private boolean contains(int element, int[] array){
		for(int i : array){
			if(i == element)
				return true;
		}
		return false;
	}

	/***********************************************************
	* Print all insults and their correct comebacks 
	* to standard output.
	**********************************************************/
	public void printAllInsultsAndCorrectComebacks(){
		for(int i = 0; i < numInsults; i++){
			System.out.println(insults[i]);
			System.out.println(correctComebacks[i]);
			System.out.println();
		}
	}

	/***********************************************************
	* Print all random comebacks to standard output.
	**********************************************************/
	public void printAllRandomComebacks(){
		for(int i = 0; i < numInsults; i++){
			System.out.println(randomComebacks[i]);
		}
	}		
	
	

}