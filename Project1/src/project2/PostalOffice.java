package project2;
import java.util.*;
public class PostalOffice {
public static void main(String[] args){
	Scanner sc1 = new Scanner(System.in),sc2 = new Scanner(System.in);
	Menus asd = new Menus();
	int input = 8;
	do
	{
	System.out.print("\n1.\tAdd a parcel");
	System.out.print("\n2.\tDisplay all parcel details");
	System.out.print("\n3.\tDisplay the highest and lowest parcel");
	System.out.print("\n4.\tDisplay the summary information about all parcels");
	System.out.print("\n5.\tDisplay parcels of specific paymode");
	System.out.print("\n6.\tDisplay parcels attended by a specific parcels person");
	System.out.print("\n7.\tDisplay all parcels, sorted by amount");
	System.out.print("\n\n0.\tQuit");
	System.out.print("\n----------------------------------------------------");
	System.out.print("\nYour choice?");
	System.out.print("\n");
	input = sc1.nextInt();
	switch (input)
	{
	case 1:
		char selection = 'y';
		do
		{
			asd.menu1();
			System.out.print("\nDo you want to add another parcel? (y/n) :\t");
			selection = sc2.next().charAt(0);
		}
		while (selection == 'y' || selection == 'Y');
	break;
	case 2:
		int enter = 0;
		do
		{
		asd.menu2();
		System.out.print("\n----------------------------------------------------");
		System.out.print("\n0.\tBack\t");
		enter = sc2.next().charAt(0);
		}
		while (enter == 0);
	break;
	case 3:
		do
		{
		asd.menu3();
		System.out.print("\n\n0.\tBack\t");
		enter = sc2.next().charAt(0);
		}
		while (enter == 0);
	break;
	case 4:
		do
		{
		asd.menu4();
		System.out.print("\n\n0.\tBack\t");
		enter = sc2.next().charAt(0);
		}
		while (enter == 0);
	break;
	default:
		if(input != 0)
		{
		System.out.print("\nThere is no such menu, please try again\n\n");
		}
		break;
	} 
	}
	while (input != 0);
	System.out.print("Thank you for using this program");
}
}