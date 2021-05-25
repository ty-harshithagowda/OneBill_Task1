package com.onebill.excel;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;

public class RemoveDuplicates {
	public static void main(String[] args) {

		Map<String, String> mapping = new HashMap<String, String>(); // Hashmap to map CSV data to
		mapping.put("subscriber_Account_Number", "Subscriber_Account_Number"); // Bean attributes.
		mapping.put("bundle_Name", "Bundle_Name");
		mapping.put("price_Plan_Name", "Price_Plan_Name");
		mapping.put("subscription_Identifier", "Subscription_Identifier");
		mapping.put("subscription_Quantity", "Subscription_Quantity");
		mapping.put("coupon_Code", "Coupon_Code");
		mapping.put("activation_Date", "Activation_Date");
		mapping.put("address_Line1", "Address_Line1");
		mapping.put("address_Line2", "Address_Line2");
		mapping.put("city", "City");
		mapping.put("country", "Country");
		mapping.put("state", "State");
		mapping.put("zip", "Zip");
		mapping.put("zip_Extention", "Zip_Extention");
		mapping.put("address_Attribute_Key", "Address_Attribute_Key");
		mapping.put("address_Attribute_Value", "Address_Attribute_Value");
		mapping.put("address_Block_Start", "Address_Block_Start");
		mapping.put("attribute", "Attribute");
		mapping.put("attribute_Value", "Attribute_Value");

		HeaderColumnNameTranslateMappingStrategy<Subcription> strategy = new HeaderColumnNameTranslateMappingStrategy<Subcription>();
		strategy.setType(Subcription.class);
		strategy.setColumnMapping(mapping);

		CSVReader csvReader = null;
		try {
			csvReader = new CSVReader(new FileReader("C:\\Users\\Harshitha Gowda\\Desktop\\Subscriptions.csv"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		CsvToBean csvToBean = new CsvToBean(); // to store data

		List<Subcription> list = csvToBean.parse(strategy, csvReader);
		
		for (int i = 0; i < list.size(); i++) {  //To print duplicates
			int count = 0;
			int k = 0;
			Subcription e = list.get(i);
			for (int j = i + 1; j < list.size(); j++) {
				Subcription f = list.get(j);

				if (e.getSubscriber_Account_Number().equals(f.getSubscriber_Account_Number())) {
					count++;
					k = j;
				}
			}
			if (count > 0) {

				System.out.println(e.getSubscriber_Account_Number());
			

				i = k;
			} else {
				System.out.println(e.getSubscriber_Account_Number());
			
			}
		}

	}
}
