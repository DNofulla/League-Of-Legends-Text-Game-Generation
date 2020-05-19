package package1;

import java.util.Random;

// The champion class Holds a bunch of stats, name, and abilities
public class Champion implements TheInterface {
	
	private String name;
	private String resourceType;
	private String rangeType;
	private int health;
	private int armor;
	private int magicResist;
	private int attackDamage;
	private int magicDamage;
	private double attackSpeed;
	private int attackRange;
	private int movementSpeed;
	private Abilities abilities;
	
	// We set the Champion's name to the name we pass as a parameter. We generate the stats and instantiate new abilities that auto-generate their own stats
	public Champion(String name) {
		this.name = name;
		generate();
		this.abilities = new Abilities();
	}
	
	// Getters an Setters for Name, stats, and abilities
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getResourceType() {
		return resourceType;
	}
	
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getArmor() {
		return armor;
	}
	
	public void setArmor(int armor) {
		this.armor = armor;
	}
	
	public int getMagicResist() {
		return magicResist;
	}
	public void setMagicResist(int magicResist) {
		this.magicResist = magicResist;
	}
	
	public int getAttackDamage() {
		return attackDamage;
	}
	
	public void setAttackDamage(int attackDamage) {
		this.attackDamage = attackDamage;
	}
	
	public double getAttackSpeed() {
		return attackSpeed;
	}
	
	public void setAttackSpeed(double attackSpeed) {
		this.attackSpeed = attackSpeed;
	}
	
	public int getAttackRange() {
		return attackRange;
	}
	
	public void setAttackRange(int attackRange) {
		this.attackRange = attackRange;
	}
	
	public int getMovementSpeed() {
		return movementSpeed;
	}
	
	public void setMovementSpeed(int movementSpeed) {
		this.movementSpeed = movementSpeed;
	}
	
	public int getMagicDamage() {
		return magicDamage;
	}

	public void setMagicDamage(int magicDamage) {
		this.magicDamage = magicDamage;
	}
	
	public String getRangeType() {
		return rangeType;
	}

	public void setRangeType(String rangeType) {
		this.rangeType = rangeType;
	}
	
	public Abilities getAbilities() {
		return abilities;
	}

	public void setAbilities(Abilities abilities) {
		this.abilities = abilities;
	}
	
	
	// Well formatted string version of the champion class
	public String toString() {
		String str;
		
		str = "\n\nName: " + getName() + 
			  "\nResource Type: " + getResourceType() + 
			  "\nRange Type: " + getRangeType() +
			  "\nHealth: " + getHealth() + " HP" +
			  "\nArmor: " + getArmor() + " Physical Armor" +
			  "\nMagic Resist: " + getMagicResist() + " Magic Resist" +
			  "\nAttack Damage: " + getAttackDamage() + " Physical Damage" +
			  "\nMagic Damage: " + getMagicDamage() + " Magic Damage" +
			  "\nAttack Speed: " + String.format("%.2f", getAttackSpeed()) + " Attacks per second" +
			  "\nAttack Range: " + getAttackRange() + " Units" + 
			  "\nMovement Speed: " + getMovementSpeed() + " Units per second"
			  + getAbilities().toString();
		
		return str;
	}
	
	// Generating random stats (with a given range for each stat), using the Random Java library
	public void generate() {
		Random r = new Random();
		String[] resourceTypes = {"None", "Mana", "Energy", "Rage"};
		String[] champRange = {"Melee", "Ranged"};
		setResourceType(resourceTypes[r.nextInt(4)]);
		setHealth(Math.abs((r.nextInt() % 500) + 500));
		setArmor(Math.abs((r.nextInt() % 50) + 25));
		setMagicResist(Math.abs((r.nextInt() % 45) + 30));
		setAttackDamage(Math.abs((r.nextInt() % 10) + 60));
		setMagicDamage(Math.abs((r.nextInt() % 30) + 60));
		setAttackSpeed(Math.abs((r.nextDouble() % 0.1) + 0.6));
		
		if (champRange[r.nextInt(2)].equals("Melee")) {
			setRangeType("Melee");
			setAttackRange(Math.abs((r.nextInt() % 125) + 75));
		} else {
			setRangeType("Ranged");
			setAttackRange(Math.abs((r.nextInt() % 350) + 500));
		}
		
		setMovementSpeed(Math.abs((r.nextInt() % 50) + 340));
		
	}
	
}
