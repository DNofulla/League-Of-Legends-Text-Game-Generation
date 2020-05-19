package package1;

import java.util.Random;

//The Tier1Rune class is a subclass of the Runes class and it holds a description and a name
public class Tier1Rune extends Runes implements TheInterface {

	private String name;
	private String description;
	
	
	// When a Tier 1 Rune is instantiated, the generate function generates the rune
	public Tier1Rune() {
		super();
		generate();
	}

	// Getters and Setters for all fields
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	// String used to print Tier 1 Runes in a nice format
	public String toString() {
		String str;
		
		str = "\n\nTier 1 Rune Name: " + getName() +
			  "\nTier 1 Rune Description: " + getDescription();
		
		return str;
	}
	
	// Generates a new Tier 1 rune randomly from a selection
	public void generate() {
		
		String[] names = {"Sudden Impact", 
						  "Triumph", 
						  "Magical Footwear", 
						  "Nullifying Orb", 
						  "Font of Life"
		};
		
		String[] desc = {"After casting a leap, dash or blink ability, ignore 10 Physical Armor and 10 Magic Resist for 5 seconds (20 second Cooldown)",
						 "After getting a kill, gain back 20% of your missing health after 1 second",
						 "After 10 minutes in the game, receive boots which will grant 20 extra Movement Speed to your champion",
						 "When your Health is reduced to below 40%, trigger a shield that will block up to 150 incoming Magic Damage for 5 seconds (10 second Cooldown)",
						 "Slowing or immobilizing an enemy champion, marks them. If that champion is hit by allied champions, you heal back 1% of your Health per auto attack"
		};
		
		Random rand = new Random();
		int i = Math.abs(rand.nextInt() % names.length);
		setName(names[i]);
		setDescription(desc[i]);
		
	}
	
}
