package package1;

import java.util.Random;

//The Tier3Rune class is a subclass of the Runes class and it holds a description and a name
public class Tier3Rune extends Runes implements TheInterface {

	private String name;
	private String description;
	
	
	// When a Tier 3 Rune is instantiated, the generate function generates the rune
	public Tier3Rune() {
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
	
	// String used to print Tier 3 Runes in a nice format
	public String toString() {
		String str;
		
		str = "\n\nTier 3 Rune Name: " + getName() +
			  "\nTier 3 Rune Description: " + getDescription();
		
		return str;
	}
	
	// Generates a new Tier 3 rune randomly from a selection
	public void generate() {
		
		String[] names = {"Ultimate Hunter", 
						  "Coup de Grace", 
						  "Cosmic Insight", 
						  "Scorch", 
						  "Unflinching"
		};
		
		String[] desc = {"Reduce your Ultimate Ability's Cooldown by 5% + 4% per Ultimate Hunter stack (Up to 25% at 5 stacks). Gain 1 stack of Ultimate Hunter per Unique Champion kill.",
						 "Deal 10% extra damage to enemy champions below 40% Health",
						 "Gain 5% increased Cooldown reduction on abilities, item actives and summoner spells. Also extend the Cooldown Reduction cap from 40% to 45%",
						 "On the next Damaging ability, set the enemy on fire dealing 20 damage after 1 second (15 second Cooldown)",
						 "Gain 10% Slow Resist and 10% Tenacity for each Summoner Spell on Cooldown (Up to 20% for 2 summoner spells). Gain 15% Slow Resist and 15% Tenacity for 10 Seconds whenever you case a summoner spell"
		};
		
		Random rand = new Random();
		int i = Math.abs(rand.nextInt() % names.length);
		setName(names[i]);
		setDescription(desc[i]);
		
	}
	
}
