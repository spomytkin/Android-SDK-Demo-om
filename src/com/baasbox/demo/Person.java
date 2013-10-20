package com.baasbox.demo;

import com.baasbox.android.BAAObject;
import com.baasbox.android.BAASBox;
import com.baasbox.android.BAASBoxResult;

public class Person extends BAAObject<Person> {
/*
	public Person() {
		super.collection = "address-book";
	}
*/
	public String name;
	public String phone;
	public String notes;
	public transient String tempOrSecret;
	public String toString(){
		return name + " "+phone;
	}
	
}
