package com.robomq.assignment3;

import java.util.HashSet;

public class ElectionMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Election> election = new HashSet<Election>();
		
		election.add(new Election(101 , "bjp" , "12" , "assam" ,"shdg" , "sgfisu"));
		election.add(new Election(102 , "bsp" ,"13", "bihar" ,"dsgf" , "ksdgks"));
		election.add(new Election(103 , "cong" , "14", "jaipur" , "dsk" , "jhds"));
		election.add(new Election(104 , "swp" , "15","alwar" , "jdfs" , "skdj"));
		election.add(new Election(101 , "bjp" , "12" , "assam" ,"shdg" , "sgfisu"));
		
		System.out.println(election);
		
		
		//double total=0.0;
		for(Election d:election)// from 1.5
		{
			System.out.println(d);		
	}
		
	}
	
}
