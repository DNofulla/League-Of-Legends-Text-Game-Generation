package package1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

// The game class holds 2 GameObjectList<Summoner> type teams, making use of generics in the process and generating a 5v5 game of a blue and red team
public class Game implements TheInterface {
	
	private GameObjectList<Summoner> blueTeam = new GameObjectList<Summoner>();
	private GameObjectList<Summoner> redTeam = new GameObjectList<Summoner>();
	
	// The game constructor generates the game using the generate function
	public Game() {
		generate();
	}
	
	
	/*
	 * The Generate function in the game class takes all the names in the names.txt file (Which could effectively be any txt file) and loading them into
	 * an ArrayList of String type, then taking these names, picking 10 random ones and creating new summoners and adding 5 to each team (Red and Blue) 
	 */
	public void generate() {
		String file = "names.txt";
		FileReader fr = null;
		try {
			fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(fr);
		String currLine;
		ArrayList<String> listOfNames = new ArrayList<String>();
		Random rand = new Random();
		try {
			while ((currLine = br.readLine()) != null) {
				listOfNames.add(currLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int i;
		for (int f = 0; f < 10; f++) {
			i = Math.abs(rand.nextInt() % listOfNames.size());
			if (f < 5 ) {
				blueTeam.add(new Summoner(listOfNames.get(i)));
			} else {
				redTeam.add(new Summoner(listOfNames.get(i)));
			}
		}
	}
	

	// Nicely formatted string of the game
	public String toString() {
		String str;
		
		str = "------------------------------------------------------------\n" +
			  "                       NORMAL GAME 5V5                      \n" +
			  "------------------------------------------------------------\n\n" + 
			  "------------------------------------------------------------\n" + 
			  "                         BLUE TEAM                          \n" + 
			  "------------------------------------------------------------\n" + 
			  blueTeam.toString() + 
			  "\n\n" +
			  "------------------------------------------------------------\n" + 
			  "                         RED TEAM                           \n" + 
			  "------------------------------------------------------------\n" +
			  redTeam.toString();
		return str;
		
	}
	
	// This prints the game we have made
	public void printGame() {
		System.out.println(toString());
	}
	
}
