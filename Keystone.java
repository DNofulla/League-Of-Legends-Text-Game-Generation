package package1;

import java.util.Random;

// The Keystone class is a subclass of the Runes class and it holds a description and a name
public class Keystone extends Runes implements TheInterface {
	
	// The name and description
	private String name;
	private String description;
	
	// When a Keystone is instantiated, the generate function generates the rune
	public Keystone() {
		generate();
	}

	// Getters and Setters for the name and description
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
	
	// This toString() function just set's the Keystone rune's String format to something neat
	public String toString() {
		String str;
		
		str = "\n\nKeystone Name: " + getName() +
			  "\nKeystone Description: " + getDescription();
		
		return str;
	}
	
	
	// The generate functions generates a random rune from a selection
	public void generate() {
		
		String[] names = {"Domination", 
						  "Precision", 
						  "Inspiration", 
						  "Sorcery", 
						  "Resolve"
		};
		
		String[] desc = {"Deal 150-400 True Damage after casting 3 abilities on a specific target within 3 seconds (10 second Cooldown)",
						 "After casting 5 abilities or auto-attacks, start healing for 15% of damage dealt and deal 10% of your damage as true damage",
						 "Every melee autoattack slows a target by 35% (25% for ranged), and heals for 5-20 Health Based on Level, per autoattack",
						 "Whenever your ultimate ability is cast, gain 100 Attack Damage, 150 Ability Power for 5 seconds (90 second Cooldown)",
						 "Permanently gain 150 Health per champion kill and 50 Health per Champion Assist"
		};
		
		Random rand = new Random();
		int i = Math.abs(rand.nextInt() % names.length);
		setName(names[i]);
		setDescription(desc[i]);
		
	}
	
}
