package package1;

import java.util.Random;

//The Tier2Rune class is a subclass of the Runes class and it holds a description and a name
public class Tier2Rune extends Runes implements TheInterface {

	private String name;
	private String description;
	
	
	// When a Tier 2 Rune is instantiated, the generate function generates the rune
	public Tier2Rune() {
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
	
	// String used to print Tier 2 Runes in a nice format
	public String toString() {
		String str;
		
		str = "\n\nTier 2 Rune Name: " + getName() +
			  "\nTier 2 Rune Description: " + getDescription();
		
		return str;
	}
	
	// Generates a new Tier 2 rune randomly from a selection
	public void generate() {
		
		String[] names = {"Taste of Blood", 
						  "Legend: Alacrity", 
						  "Biscuit Delivery", 
						  "Celerity", 
						  "Conditioning"
		};
		
		String[] desc = {"Damaging an enemy champion heals you for 25(+10% Attack Damage)(+20% Magic Damage) Health (20 second Cooldown)",
						 "Gain 3% (+1.5% per Legend stack) bonus Attack Speed up to 18% with 10 stacks (Gain 2 stacks per Unique Champion kill)",
						 "At 2, 4 and 6 Minutes gain a biscuit in your inventory that when used will restore 10% of your missing health over 5 seconds",
						 "All Movement Speed Bonuses are 7% more effective on you. Also gain +1% bonus Movement Speed",
						 "After 10 Minutes, gain 10 bonus Physical Armor and 10 Bonus Magic Resist, and increase your total Physical Armor and Magic Resistance by 5%"
		};
		
		Random rand = new Random();
		int i = Math.abs(rand.nextInt() % names.length);
		setName(names[i]);
		setDescription(desc[i]);
		
	}
	
}
