package package1;

// The Runes class is a superclass. holds the toString() and Generate() functions
public class Runes implements TheInterface {
	
	// Calls the constructor of the subclass (Either Keystone or Tier1 or Tier2 or Tier3 Runes)
	public Runes() {
		super();
	}
	
	// Returns the toString() function of whichever subclass is using it.
	public String toString() {
		return toString();
	}
	
	// uses the generate() function of whichever subclass is using it.
	public void generate() {
		generate();
	}
	
}
