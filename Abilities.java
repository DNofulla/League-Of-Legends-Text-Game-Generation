package package1;

/* Abilities class holds 3 abilities and an Ultimate ability*/
public class Abilities {

	private Ability ability1;
	private Ability ability2;
	private Ability ability3;
	private UltimateAbility ultimateAbility;
	
	/* The Abilities constructor instantiates all 3 abilities and the ultimate ability */
	public Abilities() {
		ability1 = new Ability();
		ability2 = new Ability();
		ability3 = new Ability();
		ultimateAbility = new UltimateAbility();
	}
	
	
	/* Getters and Setters for all the abilities and ultimate ability */
	public Ability getAbility1() {
		return ability1;
	}

	public void setAbility1(Ability ability1) {
		this.ability1 = ability1;
	}

	public Ability getAbility2() {
		return ability2;
	}

	public void setAbility2(Ability ability2) {
		this.ability2 = ability2;
	}

	public Ability getAbility3() {
		return ability3;
	}

	public void setAbility3(Ability ability3) {
		this.ability3 = ability3;
	}

	public UltimateAbility getUltimateAbility() {
		return ultimateAbility;
	}

	public void setUltimateAbility(UltimateAbility ultimateAbility) {
		this.ultimateAbility = ultimateAbility;
	}
	
	
	/* To String method for all the abilities so everything can be printer properly */
	public String toString() {
		String str;
		str = "\n\nABILITIES" + 
			  "\n----------------------------------------" + 
			  "\n\nAbility 1: " + ability1.toString() + 
			  "\n\nAbility 2: " + ability2.toString() +
			  "\n\nAbility 3: " + ability3.toString() +
			  "\n\nUltimate Ability: " + ultimateAbility.toString();
			  
		return str;
	}
	
}
