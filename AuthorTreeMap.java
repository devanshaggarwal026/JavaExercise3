package com.robomq.assignment3;
import java.util.*;
public class AuthorTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String, Author> author = new TreeMap<String, Author>();
		
		author.put("c", new Author(2 , "devansh"  , "a"));
		//author.put("java", new Author(4 , "divya"  , "x"));
		//author.put("python", new Author(7 , "roshan"  , "p"));
		//author.put("c++", new Author(3 , "astha"  , "r"));
		author.put("swift", new Author(5 , "tushar"  , "m"));
		author.put("ruby", new Author(2 , "devansh"  , "a"));
		author.put("scala", new Author(2 , "devansh"  , "a"));
		author.put("hive", new Author(7 , "roshan"  , "p"));
		author.put("docker", new Author(7 , "roshan"  , "p"));
		//author.put("pig", new Author(3 , "astha"  , "r"));
		
		
		Set<String> keys = author.keySet();
		
		for(String s:keys) {
			
			Author a = author.get(s);
			
			System.out.println(s + "  written by " + a.getName() + " residing at " + a.getAddress());
			//String keey = s;
			Author ar = a;
			author.remove(a);
			
			boolean b = author.containsValue(a.getName());
			System.out.println(b);
		}
		
		//author.containsValue(value);
		
	}

}
