package package1;

// SpellsList holds 2 summoner spells
public class SpellsList implements TheInterface {
	
	// Two summoner spells
	private Spells spell1;
	private Spells spell2;
	
	// We generate two random spells using generate() function
	public SpellsList() {
		generate();
	}
	
	// Getters and Setters for summoner spells
	public Spells getSpell1() {
		return this.spell1;
	}
	
	public void setSpell1(Spells spell) {
		this.spell1 = spell;
	}
	
	public Spells getSpell2() {
		return this.spell2;
	}
	
	public void setSpell2(Spells spell) {
		this.spell2 = spell;
	}
	
	// Generating new spells. Must make sure the spells are unique and not duplicates of each other
	public void generate() {
		spell1 = new Spells();
		spell2 = new Spells();
		if (spell2.getSpellName().equals(spell1.getSpellName())) {
			while(spell2.getSpellName().equals(spell1.getSpellName())) {
				spell2 = new Spells();
			}
		}
	}
	
	// Nice format for printing out the spells as a string
	public String toString() {
		String str;
		str = "\n\nSPELLS" + 
			  "\n------------------------------------------" +
			  "\nSpell 1: " + spell1.toString() + 
			  "\n\nSpell 2: " + spell2.toString();
		return str;
	}
	
	
}
