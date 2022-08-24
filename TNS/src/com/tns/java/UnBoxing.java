package com.tns.java;

import java.util.ArrayList;
public class UnBoxing 
{
	public static void main(String[] args)
    {
        Character ch = 'a';
  
        // UnBoxing - Character object to primitive conversion
        char a = ch;
  
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(24);
  
        // UnBoxing because get method returns an Integer object
        int num = arrayList.get(0);
  
        // printing the values from primitive data types
        System.out.println(num);
    }
}