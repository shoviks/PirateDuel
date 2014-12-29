/*
* PirateDuel.java
* Author: Shovik Shyamsundar
* Submission Date: 2/13/2012
*
* Purpose: Program generates an insult and then presents user with four possible comebacks.  
* User must choose one of the possible comebacks and enter it.  If user chooses the correct comeback to
* the program's insult, the "software pirate" is struck.  An int variable holds the number of times
* the user strikes the "software pirate".  If user chooses incorrect comeback, the number of times
* the user strikes the "software pirate" does not increase.  This process repeats two more times.  If the user
* strikes the "software pirate" 2 or more times then the user wins the duel.  If the user does not do this the
* user loses the duel.  This program is possible with a series of switch and if-else statements.
*  
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance with
* the University of Georgia's Academic Honesty Policy and the
* policies of this course.
*/
import java.util.Scanner;
public class PirateDuel 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		PirateDuelInsults pdi = new PirateDuelInsults();		
		int swordStrike = 0;
		String insult = pdi.getInsult();
		System.out.println("A software pirate challenges you to a sword duel.");
		System.out.println("Only wits as sharp as Occam's razor will prevail.");
		System.out.println("En Garde!");
		System.out.println("");		
		/*Prints opening statements of program*/
		System.out.println("The software pirate yells, " + insult);/*Insult is presented*/
		System.out.println("You ponder some clever comebacks...");
		String comeback1 = pdi.getFirstComeback();
		String comeback2 = pdi.getSecondComeback();
		String comeback3 = pdi.getThirdComeback();
		String comeback4 = pdi.getFourthComeback();
		/*Assigns comebacks from PirateDuelInsults.java for 4 different String variables*/
		System.out.println("  1)  " + comeback1);
		System.out.println("  2)  " + comeback2);
		System.out.println("  3)  " + comeback3);
		System.out.println("  4)  " + comeback4);
		/*Presents comebacks*/
		System.out.println("Enter your clever comeback:");/*Prompts user for which comeback they choose*/
		int userComebackVal = keyboard.nextInt();/*Assigns the number of the comeback to variable*/
		String correctComeback = pdi.getCorrectComeback(insult);/*Assigns correct comeback to the insult by getting it from
		PirateDuelInsults.java*/
		switch (userComebackVal)
		{
		case 1:
			if (comeback1.equals(correctComeback))
			{
				swordStrike++;
				System.out.println("The software pirate looks stunned.");
				System.out.println("Your sword strikes the software pirate.");
			}
			/*If the user chooses the first comeback and it's correct, swordStrike increases by 1*/
			else
			{
				System.out.println("You got served, laughs the software pirate.");
				System.out.println("The software pirate's sword strikes you.");
			}	
			/*If user chooses first comeback it's incorrect, swordStrike does not change*/
			break;	
		case 2:
			if (comeback2.equals(correctComeback))
			{
				swordStrike++;
				System.out.println("The software pirate looks stunned.");
				System.out.println("Your sword strikes the software pirate.");
			}
			else
			{
				System.out.println("You got served, laughs the software pirate.");
				System.out.println("The software pirate's sword strikes you.");
			}	
			break;
		case 3:
			if (comeback3.equals(correctComeback))
			{
				swordStrike++;
				System.out.println("The software pirate looks stunned.");
				System.out.println("Your sword strikes the software pirate.");
			}
			else
			{
				System.out.println("You got served, laughs the software pirate.");
				System.out.println("The software pirate's sword strikes you.");
			}	
			break;
		case 4:
			if (comeback4.equals(correctComeback))
			{
				swordStrike++;
				System.out.println("The software pirate looks stunned.");
				System.out.println("Your sword strikes the software pirate.");
			}
			else
			{
				System.out.println("You got served, laughs the software pirate.");
				System.out.println("The software pirate's sword strikes you.");
			}	
			break;
			/*Same thing applies for option 2, 3 and 4*/
			default:
			{
				System.out.println("Enter a valid comeback of 1, 2, 3, or 4:");
				userComebackVal = keyboard.nextInt();
				/*If user enters an invalid option the program prompts the user one more time for a valid comeback*/
				if (userComebackVal < 0 || userComebackVal > 4)
				{
					System.out.println("Arg! You must follow directions to play the game.");
					System.out.println("Game over.");
					System.exit(0);
				}
				/*Program terminates if user enters an invalid comeback a second time*/
				else
				{
					switch (userComebackVal)
					{
					case 1:
						if (comeback1.equals(correctComeback))
						{
							swordStrike++;
							System.out.println("The software pirate looks stunned.");
							System.out.println("Your sword strikes the software pirate.");
						}
						else
						{
							System.out.println("You got served, laughs the software pirate.");
							System.out.println("The software pirate's sword strikes you.");
						}	
						break;	
					case 2:
						if (comeback2.equals(correctComeback))
						{
							swordStrike++;
							System.out.println("The software pirate looks stunned.");
							System.out.println("Your sword strikes the software pirate.");
						}
						else
						{
							System.out.println("You got served, laughs the software pirate.");
							System.out.println("The software pirate's sword strikes you.");
						}	
						break;
					case 3:
						if (comeback3.equals(correctComeback))
						{
							swordStrike++;
							System.out.println("The software pirate looks stunned.");
							System.out.println("Your sword strikes the software pirate.");
						}
						else
						{
							System.out.println("You got served, laughs the software pirate.");
							System.out.println("The software pirate's sword strikes you.");
						}	
						break;
					case 4:
						if (comeback4.equals(correctComeback))
						{
							swordStrike++;
							System.out.println("The software pirate looks stunned.");
							System.out.println("Your sword strikes the software pirate.");
						}
						else
						{
							System.out.println("You got served, laughs the software pirate.");
							System.out.println("The software pirate's sword strikes you.");
						}	
						break;
											
					}
				}
			}
		}
		/*Process is repeated two more times*/
		insult = pdi.getInsult();
		System.out.println("The software pirate yells, " + insult);/*Insult is presented*/
		System.out.println("You ponder some clever comebacks...");
		comeback1 = pdi.getFirstComeback();
		comeback2 = pdi.getSecondComeback();
		comeback3 = pdi.getThirdComeback();
		comeback4 = pdi.getFourthComeback();
		/*Assigns comebacks from PirateDuelInsults.java for 4 different String variables*/
		System.out.println("  1)  " + comeback1);
		System.out.println("  2)  " + comeback2);
		System.out.println("  3)  " + comeback3);
		System.out.println("  4)  " + comeback4);
		/*Presents comebacks*/
		System.out.println("Enter your clever comeback:");/*Prompts user for which comeback they choose*/
		userComebackVal = keyboard.nextInt();/*Assigns the number of the comeback to variable*/
		correctComeback = pdi.getCorrectComeback(insult);/*Assigns correct comeback to the insult by getting it from
		PirateDuelInsults.java*/
		switch (userComebackVal)
		{
		case 1:
			if (comeback1.equals(correctComeback))
			{
				swordStrike++;
				System.out.println("The software pirate looks stunned.");
				System.out.println("Your sword strikes the software pirate.");
			}
			/*If the user chooses the first comeback and it's correct, swordStrike increases by 1*/
			else
			{
				System.out.println("You got served, laughs the software pirate.");
				System.out.println("The software pirate's sword strikes you.");
			}	
			/*If user chooses first comeback it's incorrect, swordStrike does not change*/
			break;	
		case 2:
			if (comeback2.equals(correctComeback))
			{
				swordStrike++;
				System.out.println("The software pirate looks stunned.");
				System.out.println("Your sword strikes the software pirate.");
			}
			else
			{
				System.out.println("You got served, laughs the software pirate.");
				System.out.println("The software pirate's sword strikes you.");
			}	
			break;
		case 3:
			if (comeback3.equals(correctComeback))
			{
				swordStrike++;
				System.out.println("The software pirate looks stunned.");
				System.out.println("Your sword strikes the software pirate.");
			}
			else
			{
				System.out.println("You got served, laughs the software pirate.");
				System.out.println("The software pirate's sword strikes you.");
			}	
			break;
		case 4:
			if (comeback4.equals(correctComeback))
			{
				swordStrike++;
				System.out.println("The software pirate looks stunned.");
				System.out.println("Your sword strikes the software pirate.");
			}
			else
			{
				System.out.println("You got served, laughs the software pirate.");
				System.out.println("The software pirate's sword strikes you.");
			}	
			break;
			/*Same thing applies for option 2, 3 and 4*/
			default:
			{
				System.out.println("Enter a valid comeback of 1, 2, 3, or 4:");
				userComebackVal = keyboard.nextInt();
				/*If user enters an invalid option the program prompts the user one more time for a valid comeback*/
				if (userComebackVal < 0 || userComebackVal > 4)
				{
					System.out.println("Arg! You must follow directions to play the game.");
					System.out.println("Game over.");
					System.exit(0);
				}
				/*Program terminates if user enters an invalid comeback a second time*/
				else
				{
					switch (userComebackVal)
					{
					case 1:
						if (comeback1.equals(correctComeback))
						{
							swordStrike++;
							System.out.println("The software pirate looks stunned.");
							System.out.println("Your sword strikes the software pirate.");
						}
						else
						{
							System.out.println("You got served, laughs the software pirate.");
							System.out.println("The software pirate's sword strikes you.");
						}	
						break;	
					case 2:
						if (comeback2.equals(correctComeback))
						{
							swordStrike++;
							System.out.println("The software pirate looks stunned.");
							System.out.println("Your sword strikes the software pirate.");
						}
						else
						{
							System.out.println("You got served, laughs the software pirate.");
							System.out.println("The software pirate's sword strikes you.");
						}	
						break;
					case 3:
						if (comeback3.equals(correctComeback))
						{
							swordStrike++;
							System.out.println("The software pirate looks stunned.");
							System.out.println("Your sword strikes the software pirate.");
						}
						else
						{
							System.out.println("You got served, laughs the software pirate.");
							System.out.println("The software pirate's sword strikes you.");
						}	
						break;
					case 4:
						if (comeback4.equals(correctComeback))
						{
							swordStrike++;
							System.out.println("The software pirate looks stunned.");
							System.out.println("Your sword strikes the software pirate.");
						}
						else
						{
							System.out.println("You got served, laughs the software pirate.");
							System.out.println("The software pirate's sword strikes you.");
						}	
						break;
											
					}
				}
			}
		}
		insult = pdi.getInsult();
		System.out.println("The software pirate yells, " + insult);/*Insult is presented*/
		System.out.println("You ponder some clever comebacks...");
		comeback1 = pdi.getFirstComeback();
		comeback2 = pdi.getSecondComeback();
		comeback3 = pdi.getThirdComeback();
		comeback4 = pdi.getFourthComeback();
		/*Assigns comebacks from PirateDuelInsults.java for 4 different String variables*/
		System.out.println("  1)  " + comeback1);
		System.out.println("  2)  " + comeback2);
		System.out.println("  3)  " + comeback3);
		System.out.println("  4)  " + comeback4);
		/*Presents comebacks*/
		System.out.println("Enter your clever comeback:");/*Prompts user for which comeback they choose*/
		userComebackVal = keyboard.nextInt();/*Assigns the number of the comeback to variable*/
		correctComeback = pdi.getCorrectComeback(insult);/*Assigns correct comeback to the insult by getting it from
		PirateDuelInsults.java*/
		switch (userComebackVal)
		{
		case 1:
			if (comeback1.equals(correctComeback))
			{
				swordStrike++;
				System.out.println("The software pirate looks stunned.");
				System.out.println("Your sword strikes the software pirate.");
			}
			/*If the user chooses the first comeback and it's correct, swordStrike increases by 1*/
			else
			{
				System.out.println("You got served, laughs the software pirate.");
				System.out.println("The software pirate's sword strikes you.");
			}	
			/*If user chooses first comeback it's incorrect, swordStrike does not change*/
			break;	
		case 2:
			if (comeback2.equals(correctComeback))
			{
				swordStrike++;
				System.out.println("The software pirate looks stunned.");
				System.out.println("Your sword strikes the software pirate.");
			}
			else
			{
				System.out.println("You got served, laughs the software pirate.");
				System.out.println("The software pirate's sword strikes you.");
			}	
			break;
		case 3:
			if (comeback3.equals(correctComeback))
			{
				swordStrike++;
				System.out.println("The software pirate looks stunned.");
				System.out.println("Your sword strikes the software pirate.");
			}
			else
			{
				System.out.println("You got served, laughs the software pirate.");
				System.out.println("The software pirate's sword strikes you.");
			}	
			break;
		case 4:
			if (comeback4.equals(correctComeback))
			{
				swordStrike++;
				System.out.println("The software pirate looks stunned.");
				System.out.println("Your sword strikes the software pirate.");
			}
			else
			{
				System.out.println("You got served, laughs the software pirate.");
				System.out.println("The software pirate's sword strikes you.");
			}	
			break;
			/*Same thing applies for option 2, 3 and 4*/
			default:
			{
				System.out.println("Enter a valid comeback of 1, 2, 3, or 4:");
				userComebackVal = keyboard.nextInt();
				/*If user enters an invalid option the program prompts the user one more time for a valid comeback*/
				if (userComebackVal < 0 || userComebackVal > 4)
				{
					System.out.println("Arg! You must follow directions to play the game.");
					System.out.println("Game over.");
					System.exit(0);
				}
				/*Program terminates if user enters an invalid comeback a second time*/
				else
				{
					switch (userComebackVal)
					{
					case 1:
						if (comeback1.equals(correctComeback))
						{
							swordStrike++;
							System.out.println("The software pirate looks stunned.");
							System.out.println("Your sword strikes the software pirate.");
						}
						else
						{
							System.out.println("You got served, laughs the software pirate.");
							System.out.println("The software pirate's sword strikes you.");
						}	
						break;	
					case 2:
						if (comeback2.equals(correctComeback))
						{
							swordStrike++;
							System.out.println("The software pirate looks stunned.");
							System.out.println("Your sword strikes the software pirate.");
						}
						else
						{
							System.out.println("You got served, laughs the software pirate.");
							System.out.println("The software pirate's sword strikes you.");
						}	
						break;
					case 3:
						if (comeback3.equals(correctComeback))
						{
							swordStrike++;
							System.out.println("The software pirate looks stunned.");
							System.out.println("Your sword strikes the software pirate.");
						}
						else
						{
							System.out.println("You got served, laughs the software pirate.");
							System.out.println("The software pirate's sword strikes you.");
						}	
						break;
					case 4:
						if (comeback4.equals(correctComeback))
						{
							swordStrike++;
							System.out.println("The software pirate looks stunned.");
							System.out.println("Your sword strikes the software pirate.");
						}
						else
						{
							System.out.println("You got served, laughs the software pirate.");
							System.out.println("The software pirate's sword strikes you.");
						}	
						break;
											
					}
				}
			}
		}
		/*Program runs as it should if user enters a valid comeback for the second time*/
		
		
		System.out.println("");
		System.out.println("The duel ends.");
		System.out.println("You struck the software pirate " + swordStrike + " out of 3 times.");
		/*Program indicates duel's end and tells user how many times they struck the pirate out of 3 times*/
		if (swordStrike >=2)
		{
			System.out.println("You won the duel.");
		}
		else
		{
			System.out.println("You lose the duel.");
		}
		if (swordStrike==0)	
				System.out.println("Your pirate rank is NOOB!");
		else if (swordStrike==1)
				System.out.println("Your pirate rank is MEDIOCRE MARAUDER!");
		else if (swordStrike==2)
				System.out.println("Your pirate rank is CUNNING COURAGEOUS CORSAIR!");
		else
				System.out.println("Your pirate rank is BOLD BELLIGERENT BARNACLED BUCCANEER!");
		System.out.println("Game Over.");
		/*Program gives user a rank based on the number of times they struck the pirate and then declares
		 * that the game is over*/
	}
}	
				