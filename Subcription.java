package com.onebill.excel;

public class Subcription {

	
	private String Subscriber_Account_Number;
	private String Bundle_Name;
	private String Product_Name;
	private String Price_Plan_Name;
	private String Subscription_Identifier;
	private String Subscription_Quantity;
	private String Coupon_Code;
    private String Activation_Date;
	private String Address_Line1;
	private String Address_Line2;
	private String City;
	private String Country;
	private String State;
	private String Zip;
	private String Zip_Extention;
	private String Address_Attribute_Key;
	private String Address_Attribute_Value;
	private String Address_Block_Start;
	private String Attribute;
	private String Attribute_Value;
	
	@Override
	public String toString() {
		return "Subcription [Subscriber_Account_Number=" + Subscriber_Account_Number + ", Bundle_Name=" + Bundle_Name
				+ ", Product_Name=" + Product_Name + ", Price_Plan_Name=" + Price_Plan_Name
				+ ", Subscription_Identifier=" + Subscription_Identifier + ", Subscription_Quantity="
				+ Subscription_Quantity + ", Coupon_Code=" + Coupon_Code + ", Activation_Date=" + Activation_Date
				+ ", Address_Line1=" + Address_Line1 + ", Address_Line2=" + Address_Line2 + ", City=" + City
				+ ", Country=" + Country + ", State=" + State + ", Zip=" + Zip + ", Zip_Extention=" + Zip_Extention
				+ ", Address_Attribute_Key=" + Address_Attribute_Key + ", Address_Attribute_Value="
				+ Address_Attribute_Value + ", Address_Block_Start=" + Address_Block_Start + ", Attribute=" + Attribute
				+ ", Attribute_Value=" + Attribute_Value + "]";
	}

	public String getSubscriber_Account_Number() {
		return Subscriber_Account_Number;
	}
	public void setSubscriber_Account_Number(String subscriber_Account_Number) {
		Subscriber_Account_Number = subscriber_Account_Number;
	}
	public String getBundle_Name() {
		return Bundle_Name;
	}
	public void setBundle_Name(String bundle_Name) {
		Bundle_Name = bundle_Name;
	}
	public String getProduct_Name() {
		return Product_Name;
	}
	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}
	public String getPrice_Plan_Name() {
		return Price_Plan_Name;
	}
	public void setPrice_Plan_Name(String price_Plan_Name) {
		Price_Plan_Name = price_Plan_Name;
	}
	public String getSubscription_Identifier() {
		return Subscription_Identifier;
	}
	public void setSubscription_Identifier(String subscription_Identifier) {
		Subscription_Identifier = subscription_Identifier;
	}
	public String getSubscription_Quantity() {
		return Subscription_Quantity;
	}
	public void setSubscription_Quantity(String subscription_Quantity) {
		Subscription_Quantity = subscription_Quantity;
	}
	public String getCoupon_Code() {
		return Coupon_Code;
	}
	public void setCoupon_Code(String coupon_Code) {
		Coupon_Code = coupon_Code;
	}
	public String getActivation_Date() {
		return Activation_Date;
	}
	public void setActivation_Date(String activation_Date) {
		Activation_Date = activation_Date;
	}
	public String getAddress_Line1() {
		return Address_Line1;
	}
	public void setAddress_Line1(String address_Line1) {
		Address_Line1 = address_Line1;
	}
	public String getAddress_Line2() {
		return Address_Line2;
	}
	public void setAddress_Line2(String address_Line2) {
		Address_Line2 = address_Line2;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getZip() {
		return Zip;
	}
	public void setZip(String zip) {
		Zip = zip;
	}
	public String getZip_Extention() {
		return Zip_Extention;
	}
	public void setZip_Extention(String zip_Extention) {
		Zip_Extention = zip_Extention;
	}
	public String getAddress_Attribute_Key() {
		return Address_Attribute_Key;
	}
	public void setAddress_Attribute_Key(String address_Attribute_Key) {
		Address_Attribute_Key = address_Attribute_Key;
	}
	public String getAddress_Attribute_Value() {
		return Address_Attribute_Value;
	}
	public void setAddress_Attribute_Value(String address_Attribute_Value) {
		Address_Attribute_Value = address_Attribute_Value;
	}
	public String getAddress_Block_Start() {
		return Address_Block_Start;
	}
	public void setAddress_Block_Start(String address_Block_Start) {
		Address_Block_Start = address_Block_Start;
	}
	public String getAttribute() {
		return Attribute;
	}
	public void setAttribute(String attribute) {
		Attribute = attribute;
	}
	public String getAttribute_Value() {
		return Attribute_Value;
	}
	public void setAttribute_Value(String attribute_Value) {
		Attribute_Value = attribute_Value;
	}
	
}
