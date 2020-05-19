package package1;

import java.util.Random;

/* The UltimateAbility class holds a description and cooldown of an UltimateAbility */
public class UltimateAbility implements TheInterface {
	
	// Description and Cooldown
	private String description;
	private int cooldown;
	
	// The UltimateAbility constructor calls the generate function which generates a randomized description and cooldown from a selection
	public UltimateAbility() {
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
	
	// To String function which makes it easier to format the details of an UltimateAbility better
	public String toString() {
		String str;
		
		str = "\nDescription: " + getDescription() +
			  "\nCooldown: " + getCooldown() + " seconds";
		
		return str;
	}
	
	// Sets a description and cooldown of the UltimateAbility from a selection
	public void generate() {
		Random rand = new Random();
		String[] descs = {"Throw a projectile that damages the enemy for 150 to 450 damage based on level and locks them down for 2.5 seconds",
						  "Cast to yourself and an ally, and after 1.5 seconds receive full immunity to all immobilizing effects and damage inflicted on you for 2.5 seconds",
						  "Fire a long range lazer beam in a direction of your choice and deal 300 + (30% of your Ability Power) to everyone caught in the lazer",
						  "Cast an area of effect ability around you and heal all allies in the zone for 45 Health per Second",
						  "Cast an area of effect ability around you and deal 45 damage per second to all enemies in the zone",
						  "Globally cast on an ally shielding them for 300 HP for 5 seconds, and channel a teleport at their location over 4 seconds",
						  "Trap a selected enemy champion of your choice to another realm, isolated in a small circle like area for a duel for 10 seconds while reducing their resistances by 25%",
						  "Go invisible for up to 20 seconds and leap out from up to 700 range onto an enemy champion by right-clicking on them and proceed to do 100 to 300 damage based on level"};
		
		setDescription(descs[Math.abs(rand.nextInt() % 8)]);
		setCooldown(Math.abs((rand.nextInt() % 40) + 70));
	}
	
}
