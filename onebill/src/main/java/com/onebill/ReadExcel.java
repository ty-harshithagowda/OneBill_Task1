package com.onebill;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class ReadExcel {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter Subscriber_Account_Number");

		String userInputs = myObj.nextLine(); // Read user input

		try {
			FileReader file = new FileReader("C:\\Users\\Harshitha Gowda\\Desktop\\Subscriptions.csv");
			BufferedReader csvReader = new BufferedReader(file);
			String row;

			while ((row = csvReader.readLine()) != null) {
				if (userInputs.equals(row.substring(0, 6))) {
					String[] data = row.split(",");      //array of string
					for(String index:data) {
						System.out.printf("%-15s", index);   //printf for printing table
					}
					System.out.println();
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
//CSV- is s comma sapertator value