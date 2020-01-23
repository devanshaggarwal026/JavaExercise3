package com.robomq.assignment3;

import java.util.HashSet;
import java.util.*;
public class ElectionMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Election> election = new HashSet<Election>();
		
		election.add(new Election(101 , "bjp" , 12 , "assam" ,"shdg" , "sgfisu"));
		election.add(new Election(102 , "bsp" ,13, "bihar" ,"dsgf" , "ksdgks"));
		election.add(new Election(103 , "cong" , 14, "jaipur" , "dsk" , "jhds"));
		election.add(new Election(104 , "swp" , 15,"alwar" , "jdfs" , "skdj"));
		election.add(new Election(101 , "bjp" , 12 , "assam" ,"shdg" , "sgfisu"));
		
		//System.out.println(election);
		
		
		//double total=0.0;
		//for(Election d:election)// from 1.5
		//{
			//System.out.println(d);		
	//}
		
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		ArrayList<Integer> commonDate=new ArrayList<Integer>();
		
		
		for(Election e :election)
			{
				
			
			if(arrlist.contains(e.getDate())) {
				System.out.println("These are the parties that have same date");
				//System.out.println("\n " +e);
				commonDate.add(e.getDate());
				//System.out.println("heyy"+e.getDate());
				System.out.println("byyy"+commonDate);
				}
			arrlist.add(e.getDate());
			
				
			}
		
	
	for(Election e1 :election)
	{
		if(commonDate.contains(e1.getDate()))
		{
			System.out.println(e1);
		}
	}	
		
	}
	
}
