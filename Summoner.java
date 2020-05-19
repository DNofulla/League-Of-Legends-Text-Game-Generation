package package1;

/* Summoner class contains a name, a champion, a runepage and a spell list */
public class Summoner implements TheInterface {
	
	// Name, champion, rune page and spell list
	private String name;
	private Champion champ;
	private RunePage runes;
	private SpellsList spellList;
	
	// When a summoner is instantiated, the name
	public Summoner(String name) {
		this.name = name;
		generate();	
	}

	// Getters and Setters for all fields
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RunePage getRunes() {
		return runes;
	}

	public void setRunes(RunePage runes) {
		this.runes = runes;
	}

	public SpellsList getSpellList() {
		return spellList;
	}

	public void setSpellList(SpellsList spellList) {
		this.spellList = spellList;
	}
	
	public Champion getChamp() {
		return champ;
	}

	public void setChamp(Champion champ) {
		this.champ = champ;
	}
	
	// String to be used to print a summoner's fields in a nice format
	public String toString() {
		String str;
		
		str = getChamp().toString() + "\n" +
			  getRunes().toString() + "\n" +
			  getSpellList().toString() + "\n";
		
		return str;
	}
	
	
	// Generates the summoner's fields by creating a new champion and using the summoner name as the field, then instantiates a new rune page and spell list
	public void generate() {
		setChamp(new Champion(getName()));
		setRunes(new RunePage());
		setSpellList(new SpellsList());
	}
	
}
