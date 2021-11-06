package de.exxcellent.challenge;

import java.io.IOException;

/**
 * The entry class for your solution. This class is only aimed as starting point
 * and not intended as baseline for your software design. Read: create your own
 * classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

	/**
	 * This is the main entry method of your program.
	 * 
	 * @param args The CLI arguments passed
	 * @throws IOException
	 */
	public static void main(String... args) throws IOException {

		ReadValFromCSV weather = new ReadValFromCSV();
		ReadValFromCSV football = new ReadValFromCSV();

		String dayWithSmallestTempSpread = weather
				.getCSVListMinValue("src/main/resources/de/exxcellent/challenge/weather.csv", 1, 2);
		String teamWithSmallestGoalSpread = football
				.getCSVListMinValue("src/main/resources/de/exxcellent/challenge/football.csv", 5, 6);

		System.out.printf("Day with smallest temperature spread : " + dayWithSmallestTempSpread + "\n");
		System.out.printf("Team with smallest goal spread       : " + teamWithSmallestGoalSpread);

		// Your preparation code …

//        String dayWithSmallestTempSpread = "Someday";     // Your day analysis function call …
//        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);
//
//        String teamWithSmallestGoalSpread = "A good team"; // Your goal analysis function call …
//        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
	}
}
