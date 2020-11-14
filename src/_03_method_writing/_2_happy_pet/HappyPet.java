package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	static int happinessLevel = 0;
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		String pet = JOptionPane.showInputDialog("What pet would you like to buy?");
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for( int i = 0; i < 1000; i++) {
			String action = JOptionPane.showInputDialog("Would you like to cuddle, feed, or water your pet?");
				if(action.equalsIgnoreCase("Cuddle")) {
					cuddle(pet);
					if (happinessLevel >= 5) {
						JOptionPane.showMessageDialog(null, "You love your pet");
						break;
					}
				}
					else if (action.equalsIgnoreCase("Feed")) {
						food(pet);
						if (happinessLevel >= 5) {
							JOptionPane.showMessageDialog(null, "You love your pet");
							break;
					}
					}
						else if (action.equalsIgnoreCase("Water")) {
							water(pet);
							if (happinessLevel >= 5) {
								JOptionPane.showMessageDialog(null, "You love your pet");
								break;
						}
				}
				
		}
		}
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			

			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	
	public static void cuddle(String pet) {
		JOptionPane.showMessageDialog(null, "Your" + " " + pet + " " + "purred");
		happinessLevel = happinessLevel +1;
	} 
	public static void food(String pet) {
		JOptionPane.showMessageDialog(null, "Your" + " " + pet + " " +"is no longer hungry");
		happinessLevel = happinessLevel +1;
	} 
	public static void water(String pet) {
		JOptionPane.showMessageDialog(null, "Your" + " " + pet + " " + "is no longer thirsty");
		happinessLevel = happinessLevel +1;
	} 

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}