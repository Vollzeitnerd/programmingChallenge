package de.exxcellent.challenge;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadValFromCSV {

	String[] columnArray;
	FileReader fileReader;
	BufferedReader bufferedReader;
	String csvColumn;
	int diff;
	int maxValue = Integer.MAX_VALUE;
	//Object is used to ignore types 
	Object result;
	

	// Output: Smallest spread between two columns
	public String getCSVListMinValue(String file, int column1, int column2) throws FileNotFoundException {
		fileReader = new FileReader(file);
		bufferedReader = new BufferedReader(fileReader);

		try {
			// Skip first row. Headlines not needed
			bufferedReader.readLine();

			// Use columns with content
			while ((csvColumn = bufferedReader.readLine()) != null) {
				
				// save the values in an Array split by an ,.
				columnArray = csvColumn.split(",");
				
				// calculate the spread between two columns
				diff = Integer.parseInt(this.columnArray[column1]) - Integer.parseInt(this.columnArray[column2]);

				// Check if spread is bigger than the max value. Save the smallest amount in an Object
				if (diff < maxValue) {
					maxValue = diff;
					result = columnArray[0];

				}

			}

			bufferedReader.close();

		} catch (IOException e) {

			e.printStackTrace();
		}
		return result.toString();
	}

}
