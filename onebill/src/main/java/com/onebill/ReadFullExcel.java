package com.onebill;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFullExcel {

	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("C:\\Users\\Harshitha Gowda\\Desktop\\Subscriptions.csv");
			BufferedReader csvReader = new BufferedReader(file);
			String row;

			while ((row = csvReader.readLine()) != null) {
				String[] data = row.split(","); // array of string
				for (String index : data) {
					System.out.printf("%-30s", index); // printf for printing table
				}
				System.out.println();
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}