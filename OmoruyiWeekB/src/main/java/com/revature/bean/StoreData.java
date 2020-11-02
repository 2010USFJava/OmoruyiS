package com.revature.bean;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;



public class StoreData {
	
	public static final String leagueFile = "league.txt";
	
	
	
	
	
	//public static List<League> leagueList = new ArrayList<League>();
	
	
	public static void writeLeagueFile(List<League> leagueList) {
		
		try {
			ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream(leagueFile));
			objOut.writeObject(leagueList);
			objOut.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	@SuppressWarnings("unchecked")
	public static void writeLeagueFile() {
		try {
			ObjectInputStream objIn = new ObjectInputStream(new FileInputStream(leagueFile));
			Player.leagueList = (ArrayList<League>)objIn.readObject();
			objIn.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
		
		
}
