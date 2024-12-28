package com.velocity.hashset;

import java.util.HashSet;

public class HashSetDemo1 {
	public static void main(String[] args) {

		HashSet hs = new HashSet(); //create one hashmap with 16 size
		hs.add(10); //10 as key and PRESENT-dummy value
		hs.add("pune");
		hs.add("mumbai");
		hs.add(20);
		//lets add duplicate elements
		hs.add(10); //return add() method- false-> element not added into HashSet
		System.out.println(hs);
	}

}
