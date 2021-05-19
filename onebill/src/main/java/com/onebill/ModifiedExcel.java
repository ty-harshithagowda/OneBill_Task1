package com.onebill;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class ModifiedExcel {

        public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		
		System.out.println("Enter Subscriber_Account_Number");
        String userInputs = myObj.nextLine(); // Read user input

		try {
			FileReader file = new FileReader("C:\\Users\\Harshitha Gowda\\Desktop\\Subscriptions.csv");
			BufferedReader br = new BufferedReader(file);
		
	        String line="";
	        while ((line = br.readLine()) != null) { 
	     
	        String[] cols = line.split(","); 
	        if(userInputs.equals(cols[0]))
	        {
	        System.out.println(cols[5]); 
	        }
	        } 
		} catch (Exception e) {
			e.printStackTrace();
		}
}
}