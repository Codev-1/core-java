package com.tns.java;

//Java program to demonstrate AutoBoxing
import java.util.ArrayList;
public class AutoBoxingWrapper 
{
	public static void main(String[] args)
  {
      char ch = 'a';

      // AutoBoxing- primitive to Character object conversion
      Character a = ch;

      ArrayList<Integer> arrayList = new ArrayList<Integer>();

      // AutoBoxing because ArrayList stores only objects
      arrayList.add(25);

      // printing the values from object
      System.out.println(arrayList.get(0));
  }
}