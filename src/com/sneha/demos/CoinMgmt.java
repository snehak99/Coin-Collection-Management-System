package com.sneha.demos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CoinMgmt {
	
	Set <Coin> coinC;
	List <String> countryList;
	List <Integer> yrofmintingList;
	List <Integer> currentValue;
	
	public CoinMgmt() 
	{
		coinC = new HashSet<Coin>();
		countryList = new ArrayList<>();
		yrofmintingList = new ArrayList<>();
		currentValue = new ArrayList<>();
	}
	
////////////////////////////////////////////////////////////////
	
	public void AddCoin() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter Country Name : ");
		String Cntry = sc.next();
		
		System.out.println("Enter Denomination : ");
		String Deno = sc.next();
		
		System.out.println("Enter Year of  minting : ");
		int YrOfMntng = sc.nextInt();
		
		System.out.println("Enter Current Value of Coin : ");
		int CurrVal = sc.nextInt();
		
		System.out.println("Enter Acquired Date (dd/mm/yyyy) : ");
		String AcqDate = sc.next();
		
		Coin obj = new Coin(Cntry, Deno, YrOfMntng, CurrVal, AcqDate);
		coinC.add(obj);
		
		System.out.println("This Information Is Added Successfully...");
		for(Coin ref : coinC)
		{
			ref.Display();
		}
		System.out.println("Size of Collection " + coinC.size()+"\n");
	}
	
///////////////////////////////////////////////////////////////////////
	
	public void DisplayCoin()
	{
		if(coinC.size() == 0)
		{
			System.out.println("\nEmpty Collection. No Coins To Display...\n");
		}
		else
		{
			System.out.println(coinC.size()+" Collections Available.");
			for(Coin c1 : coinC)
			{
				c1.Display();
			}
		}
	}
	
////////////////////////////////////////////////////////////////////////
	
	public void SearchbyCountryAndDenomination()
	{
		boolean flag = false;
		if(coinC.size() == 0)
		{
			System.out.println("\nEmpty Collection. No Coins Available...\n");
		}
		else
		{
			System.out.println("\n"+coinC.size()+" Collections Available.");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("\nEnter Country Name to be Searched : ");
			String cntry = sc.next();
			
			System.out.println("\nEnter Denomination to be Searched : ");
			String deno = sc.next();
			
			for(Coin c1 : coinC)
			{
				if(cntry.equals(c1.getCountry()) && deno.equals(c1.getDenomination()))
				{
					flag = true;
					System.out.println("\nData Found...");
					c1.Display();
					return;
				}
			}
			if(!flag)
			{
				System.out.println("\nData Not Found... Try Again!\n");
			}
		}
	}
	
////////////////////////////////////////////////////////////////////////
	
	public void SearchbyCountryAndYearOfMinting()
	{
		boolean flag = false;
		if(coinC.size() == 0)
		{
			System.out.println("\nEmpty Collection. No Coins Available...\n");
		}
		else
		{
			System.out.println("\n"+coinC.size()+" Collections Available.");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("\nEnter Country Name to be Searched : ");
			String cntry = sc.next();
			
			System.out.println("\nEnter Year Of Minting to be Searched : ");
			int yrofmntng = sc.nextInt();
			
			for(Coin c1 : coinC)
			{
				if(cntry.equals(c1.getCountry()) && yrofmntng == c1.getYearOfMinting())
				{
					flag = true;
					System.out.println("\nData Found...");
					c1.Display();
					return;
				}
			}
			if(!flag)
			{
				System.out.println("\nData Not Found... Try Again!\n");
			}
		}
	}
	
////////////////////////////////////////////////////////////////////////
	
	public void SearchbyCountryDenominationAndYearOfMinting()
	{
		boolean flag = false;
		if(coinC.size() == 0)
		{
			System.out.println("\nEmpty Collection. No Coins Available...\n");
		}
		else
		{
			System.out.println("\n"+coinC.size()+" Collections Available.");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("\nEnter Country Name to be Searched : ");
			String cntry = sc.next();
			
			System.out.println("\nEnter Denomination to be Searched : ");
			String deno = sc.next();
			
			System.out.println("\nEnter Year of Minting to be Searched : ");
			int yrofmntng = sc.nextInt();
			
			for(Coin c1 : coinC)
			{
				if(cntry.equals(c1.getCountry()) && deno.equals(c1.getDenomination()) && yrofmntng == c1.getYearOfMinting())
				{
					flag = true;
					System.out.println("\nData Found...");
					c1.Display();
					return;
				}
			}
			if(!flag)
			{
				System.out.println("\nData Not Found... Try Again!\n");
			}

		}
	}	
	
////////////////////////////////////////////////////////////////////////
	
	public void SearchbyCountryAndAcquiredDate()
	{
		boolean flag = false;
		if(coinC.size() == 0)
		{
			System.out.println("\nEmpty Collection. No Coins Available...\n");
		}
		else
		{
			System.out.println("\n"+coinC.size()+" Collections Available.");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("\nEnter Country Name to be Searched : ");
			String cntry = sc.next();
			
			System.out.println("\nEnter Acquired Date to be Searched : ");
			String AcqDate = sc.next();
			
			for(Coin c1 : coinC)
			{
				if(cntry.equals(c1.getCountry()) && AcqDate.equals(c1.getAcquiredDate()))
				{
					flag = true;
					System.out.println("\nData Found...");
					c1.Display();
					return;
				}
			}
			if(!flag)
			{
				System.out.println("\nData Not Found... Try Again!\n");
			}
		}
	}

////////////////////////////////////////////////////////////////////////
	
	public void UpdateCoinbyCountryandDenomination() 
	{
		boolean flag = false;
		if(coinC.size() == 0)
		{
			System.out.println("\nEmpty Collection. No Coins Available...\n");
		}
		else
		{
			System.out.println("\n"+coinC.size()+" Collections Available.");
			String choice;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("\nEnter Country Name to Update Data : ");
			String cntry = sc.next();
			
			System.out.println("\nEnter Denomination to Update Data : ");
			String deno = sc.next();
			
			for(Coin c1 : coinC)
			{
				if(cntry.equals(c1.getCountry()) && deno.equals(c1.getDenomination()))
				{
					flag = true;
					System.out.println("\nData Found...\n");
					c1.Display();
					//////////////////////////////////////////////////
					System.out.println("Do you wish to change Country Name (yes/no) : ");
					choice = sc.next();
					if(choice.equals("yes"))
					{
						System.out.println("Enter new country name : ");
						String newcountry = sc.next();
						c1.setCountry(newcountry);
					}
					//////////////////////////////////////////////////
					System.out.println("Do you wish to change Denomination (yes/no) : ");
					choice = sc.next();
					if(choice.equals("yes"))
					{
						System.out.println("Enter new value for Denomination : ");
						String denom = sc.next();
						c1.setDenomination(denom);
					}
					//////////////////////////////////////////////////
					System.out.println("Do you wish to change Year of Minting (yes/no) : ");
					choice = sc.next();
					if(choice.equals("yes"))
					{
						System.out.println("Enter new value for year of minting");
						int yom = sc.nextInt();
						c1.setYearOfMinting(yom);
					}
					//////////////////////////////////////////////////
					System.out.println("Do you wish to change Current Value (yes/no) : ");
					choice = sc.next();
					if(choice.equals("yes"))
					{
						System.out.println("Enter new current value of coin");
						int currval = sc.nextInt();
						c1.setCurrentValue(currval);
					}
					//////////////////////////////////////////////////
					System.out.println("Do you wish to change Acquired Date (yes/no) : ");
					choice = sc.next();
					if(choice.equals("yes"))
					{
						System.out.println("Enter new acquired date : ");
						String acqdate = sc.next();
						c1.setAcquiredDate(acqdate);
					}
					//////////////////////////////////////////////////
					System.out.println("\nData Updated Successfully...\n");
					return;
				}
			}
			if(!flag)
			{
				System.out.println("\nData Not Found... Try Again!\n");
			}
		}
	}

////////////////////////////////////////////////////////////////////////
	
	public void DeleteCoinbyCountryandDenomination() 
	{
		boolean flag = false;
		if(coinC.size() == 0)
		{
			System.out.println("\nEmpty Collection. No Coins Available...\n");
		}
		else
		{
			System.out.println("\n"+coinC.size()+" Collections Available.");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("\nEnter Country Name to be Searched : ");
			String cntry = sc.next();
			
			System.out.println("\nEnter Denomination to be Searched : ");
			String deno = sc.next();
			
			for(Coin c1 : coinC)
			{
				if(cntry.equals(c1.getCountry()) && deno.equals(c1.getDenomination()))
				{
					flag = true;
					System.out.println("\nData Found...");
					
					c1.Display();
					
					System.out.println("Do You Want To Delete This Coin? (yes/no) : ");
					String choice = sc.next();
					if(choice.equals("yes"))
					{
						coinC.remove(c1);
						System.out.println("\nCoin Deleted Successfully...\n");
					}
					return;
				}
			}
			if(!flag)
			{
				System.out.println("\nData Not Found... Try Again!\n");
			}
		}
	}

////////////////////////////////////////////////////////////////////////
	
	public void AddFromFile() 
	{
		String File = "data.csv"; 
		
		Scanner sc;
		try {
			sc = new Scanner(new File(File));
			
			while(sc.hasNext())
			{
				String[] coinData = sc.next().toString().split(",");
				coinC.add(new Coin(coinData[0], coinData[1], Integer.valueOf(coinData[2]), Integer.valueOf(coinData[3]), coinData[4]));
			}
			sc.close();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

////////////////////////////////////////////////////////////////////////
	public void createlists()
	{
		System.out.println("1.Create List - Country");
		System.out.println("2.Create List - Year Of Minting");
		System.out.println("3.Create List - Current Value");
		
		System.out.println("\nEnter Your Choice : ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1: createListCountry();
			break;
			
		case 2: createListYearOfMinting();
			break;
			
		case 3: createListCurrentValue();
			break;
		}
	}
	
////////////////////////////////////////////////////////////////////////

	private void createListCurrentValue() 
	{
		if(coinC.size() == 0)
		{
			System.out.println("\nEmpty Collection. No Coins Available...\n");
		}
		else
		{
			System.out.println("\n"+coinC.size()+" Collections Available.");
			
			for(Coin c1 : coinC)
			{
				currentValue.add(c1.getCurrentValue());
			}
		}
		Collections.sort(currentValue);
		
		for(int ctr=0; ctr<currentValue.size(); ctr++)
		{
			System.out.println(currentValue.get(ctr));
		}
	}
	
////////////////////////////////////////////////////////////////////////

	private void createListYearOfMinting() 
	{
		if(coinC.size() == 0)
		{
			System.out.println("\nEmpty Collection. No Coins Available...\n");
		}
		else
		{
			System.out.println("\n"+coinC.size()+" Collections Available.");
			
			for(Coin c1 : coinC)
			{
				yrofmintingList.add(c1.getYearOfMinting());
			}
		}
		
		for(int ctr=0; ctr<yrofmintingList.size(); ctr++)
		{
			System.out.println(yrofmintingList.get(ctr));
		}
	}

////////////////////////////////////////////////////////////////////////
	
	private void createListCountry() 
	{
		if(coinC.size() == 0)
		{
			System.out.println("\nEmpty Collection. No Coins Available...\n");
		}
		else
		{
			System.out.println("\n"+coinC.size()+" Collections Available.");
			
			for(Coin c1 : coinC)
			{
				countryList.add(c1.getCountry());
			}
		}
		
		for(int ctr=0; ctr<countryList.size(); ctr++)
		{
			System.out.println(countryList.get(ctr));
		}
	}
	
////////////////////////////////////////////////////////////////////////
}