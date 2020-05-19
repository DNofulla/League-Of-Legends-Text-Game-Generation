package package1;

import java.util.Random;

/* The Ability class holds a description and cooldown of an ability */
public class Ability implements TheInterface {
	
	// Description and Cooldown
	private String description;
	private int cooldown;
	
	// The Ability constructor calls the generate function which generates a randomized description and cooldown from a selection
	public Ability() {
		generate();
	}
	
	// Getters and Setters for Description and Cooldown
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getCooldown() {
		return cooldown;
	}
	
	public void setCooldown(int cooldown) {
		this.cooldown = cooldown;
	}
	
	// To String function which makes it easier to format the details of an ability better
	public String toString() {
		String str;
		
		str = "\nDescription: " + getDescription() +
			  "\nCooldown: " + getCooldown() + " seconds";
		
		return str;
	}
	
	// Sets a description and cooldown of the ability from a selection
	public void generate() {
		Random rand = new Random();
		int i = Math.abs((rand.nextInt() % 30) + 50);
		String[] descs = {"Heal yourself for " + i + " Health",
						  "Heal an ally for " + i + " Health",
						  "Throw a projectile and deal " + i + " Physical Damage", 
						  "Throw a projectile and deal " + i + " Magic Damage",
						  "Empowered Melee attack that does " + i + " True Damage"};
		
		setDescription(descs[Math.abs(rand.nextInt() % 5)]);
		setCooldown(Math.abs((rand.nextInt() % 15) + 12));
	}
	
}
