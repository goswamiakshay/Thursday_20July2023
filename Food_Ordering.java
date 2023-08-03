package Akshay;

import java.util.Scanner;

public class Food_Ordering{
	int choice;
	static String A,B,C,D;									//Item declaration
	static int pr1,pr2,pr3,pr4,sum=0;						//Price variables and initialization of sum=0
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 					//Main Function
	{
		
		System.out.println("Welcome to Our Hotel");
		Food_Ordering obj1=new Food_Ordering();				//Creating the object of main class
		obj1.select_menu();									//obj1 is the object of the Food_Ordering class
	
	}
	public void select_menu()								//Menu Selection Function
	{
		System.out.println("\nTHE MENU");
		System.out.println("\n1:Starter\n2:Main Course\n3:Deserts\n4:Drinks");
		System.out.println("\nChoose: ");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:												//For Starters
				starter st=new starter();						//Object creation of starter class
				st.starter();									//calling the function of starters class 
				break;
			case 2:												//For Main Course
				main_course mc = new main_course ();			//Creating the object of main_course class
				mc.main_course();								//calling the function
				break;
			case 3:												//For Dessert
				dessert des = new dessert();					//Object Creation
				des.dessert();									//Calling function
				break;
			case 4:												//For Drinks class
				drinks dri = new drinks();						//object 
				dri.drinks();									//function calling from drinks class
				break;
			default:											//default case
				System.out.println("Enter Correct Choice\n");
				select_menu();
		}
	}
	public static void select_menu_item()						//function for item selection
	{
		int items;
		char select;
		System.out.println("\nSelect the number of items: ");
		items = sc.nextInt();
		System.out.println("\nSelect Items (A,B,C,D): ");
		while(items>0) 											//checking the condition till item is not zero and adding the amount and item in the cart.
		{
			select=sc.next().charAt(0);
			if(select=='A'||select=='a'){
				System.out.println("Item A: "+A);
				 sum+=pr1;										//sum=sum+pr1 operator
			}
			else if(select=='B'||select=='b') {
				System.out.println("Item B: "+B);
				sum+=pr2;
			}
			else if(select=='C'||select=='c') {
				System.out.println("Item C: "+C);
				sum+=pr3;
			}
			else if(select=='D'||select=='d') {
				System.out.println("Item D: "+D);
				sum+=pr4;
			}
			else {
				System.out.println("This Item not in the list.");
			}
			items--;
		}
		System.out.println("Items Added.\n");
		System.out.println("Amount is: "+sum);
		repeat();												//repeating the process till customer says no
	}
	public static void repeat()
	{
		System.out.println("Do you want to add anything (Yes/No): ");
		char repeat=sc.next().charAt(0);
		if(repeat=='y'||repeat=='Y') 
		{
			Food_Ordering obj1=new Food_Ordering();
			obj1.select_menu();									//selecting the menu till customer says yes
		}
		else 
		{
			System.out.println("\nThank You For Coming.");					
			System.out.println("Your Bill is: Rs."+sum+"/-");			//Final Billing 
		}


	}
}
