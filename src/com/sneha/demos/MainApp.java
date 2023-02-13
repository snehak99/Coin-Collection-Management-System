package com.sneha.demos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) 
	{
		MainApp app = new MainApp();

		app.execution();
	}
	
	private void execution()
	{
		CoinMgmt obj = new CoinMgmt();
		int ch = 0;
		
		while(ch != 11)
		{
			ch = acceptChoice();
			System.out.println("Your Choice is - " + ch);
			mainMenu(ch,obj);
		}
	}

	private int acceptChoice()
	{
		int ch = 0;
		
		boolean choice = false;
		while(choice == false)
		{
			try 
			{
				System.out.println("-------------------------------------------------------");
				System.out.println("1.Add Coin Information");
				System.out.println("2.Display All Coins");
				System.out.println("3.Search By Country & Denomination");
				System.out.println("4.Search By Country & Year Of Minting");
				System.out.println("5.Search By Country, Denomination & Year Of Minting");
				System.out.println("6.Search By Country & Acquired Date");
				System.out.println("7.Update Coin By Country & Denomination");
				System.out.println("8.Delete Coin By Country & Denomination");
				System.out.println("9.Add From File To Collection");
				System.out.println("10.Create Lists");
				System.out.println("11.Exit");
				System.out.println("-------------------------------------------------------");
				System.out.println("\nEnter Your Choice : ");
				
				Scanner sc = new Scanner(System.in);
				ch = sc.nextInt();
				if(ch < 1 || ch > 11)
				{
					throw new InvalidChoiceException("Invalid Choice...Try again!\n");
				}
				choice = true;
			}
			catch (InputMismatchException ime)
			{
				System.out.println("Wrong DataType...Try again!\n");
			}
			catch (InvalidChoiceException ice) 
			{
				System.out.println(ice.getMessage());
			}
		}
		return ch;
	}
	
	private void mainMenu(int ch,CoinMgmt obj) 
	{	
		switch(ch)
		{
		case 1: obj.AddCoin();
			break;
		
		case 2: obj.DisplayCoin();
			break;
			
		case 3: obj.SearchbyCountryAndDenomination();
			break;
		
		case 4: obj.SearchbyCountryAndYearOfMinting();
			break;
			
		case 5: obj.SearchbyCountryDenominationAndYearOfMinting();
			break;
		
		case 6: obj.SearchbyCountryAndAcquiredDate();
			break;
			
		case 7: obj.UpdateCoinbyCountryandDenomination();
			break;
			
		case 8: obj.DeleteCoinbyCountryandDenomination();
			break;
			
		case 9: obj.AddFromFile();
			break;
			
		case 10: obj.createlists();
			break;
			
		case 11: 
			break;
		}	
	}
}
