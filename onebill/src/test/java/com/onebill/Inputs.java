package com.onebill;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Inputs {

	public static void main(String[] args) throws IOException {
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter Subscriber_Account_Number");
		
		try {

			String userInputs = myObj.nextLine(); // Read user input
			FileReader file = new FileReader("C:\\Users\\Harshitha Gowda\\Desktop\\Subscriptions.csv");
			BufferedReader br = new BufferedReader(file);
			String line;
			while ((line = br.readLine()) != null) {
				String[] cols = line.split("|");
				System.out.println("Product_Name");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}