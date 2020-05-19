package package1;

import java.util.Random;

// The spells class holds the spell's name, description and cooldown
public class Spells implements TheInterface {
	
	// Name of the spell, its description and cooldown
	private String spellName;
	private String spellDesc;
	private int cooldown;
	
	// The spell is randomly generated from a selection when instantiated using the generate() function 
	public Spells() {
		generate();
	}
	
	// Getters and Setters for all fields
	public String getSpellName() {
		return spellName;
	}
	
	public void setSpellName(String spellName) {
		this.spellName = spellName;
	}
	
	public String getSpellDesc() {
		return spellDesc;
	}
	
	public void setSpellDesc(String spellDesc) {
		this.spellDesc = spellDesc;
	}
	
	public int getCooldown() {
		return cooldown;
	}

	public void setCooldown(int cooldown) {
		this.cooldown = cooldown;
	}
	
	// toString() is here for a nice format to use to print out a spell's details
	public String toString() {
		String str;
		
		str = "\n\nSpell Name: " + getSpellName() + 
			  "\nSpell Description: " + getSpellDesc() + 
			  "\nSpell Cooldown: " + getCooldown();
		return str;
	}
	
	// Generate function generates a name, description and cooldown for each summoner spell using a random number
	public void generate() {
		String[] names = {"Heal", "Ghost", "Barrier", "Exhaust", "Flash", "Teleport", "Cleanse", "Ignite", "Smite"};
		
		String[] descs = {"Heals the caster and the allied champion nearest to the cursor (prioritizes the most wounded allied champion if no allied champions are near the cursor) for 90 - 345 (based on champion level) health, while also granting both targets 30% bonus movement speed for 1 second. Champions affected by Heal within 35 seconds cause subsequent Heal casts on them to heal 50% less. (850 range)", 
						  "Your champion ignores unit collision for 10 seconds, and gains increased movement speed for the duration. Grants a maximum of 28% - 45% (based on champion level) movement speed after accelerating for 2 seconds. (Self range)", 
						  "Shields your champion for 115 - 455 (based on champion level) for 2 seconds. (Self range)", 
						  "Exhausts target enemy champion, slowing them by 30% and reducing their damage dealt by 40% for 3 seconds. (650 range)", 
						  "Blinks your champion a short distance toward the target location. (400 (Smart cast) range)", 
						  "After channeling for 4 seconds, blinks your champion to target allied turret, minion or ward. On arrival, grants 30 / 40 / 50% (based on champion level) bonus movement speed for 3 seconds. (Global range)", 
						  "Removes all disables (excluding Suppression, Nearsight, Airborne) and summoner spell debuffs affecting your champion, as well as granting 65% Tenacity for 3 seconds. (Self range)", 
						  "Ignites an enemy champion, dealing 70 - 410 (based on champion level) true damage over 5 seconds, with the first tick of damage occurring on-cast and subsequent ticks occurring each 1.25 seconds. This also applies Grievous Wounds and reveals them for the duration. (600 range)", 
						  "Deals 390 - 1000 (based on champion level) true damage to the target large or medium monster, enemy minion, or pet. Using Smite against a large monster restores 70 (+ 10% of maximum health). (500 range)"};
		
		int[] cooldowns = {240, 180, 180, 210, 300, 330, 210, 180, 15};
		
		Random rand = new Random();
		
		int i = Math.abs(rand.nextInt() % names.length);
		
		setSpellName(names[i]);
		setSpellDesc(descs[i]);
		setCooldown(cooldowns[i]);
		
	}
	
}
