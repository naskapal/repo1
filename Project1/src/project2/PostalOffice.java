package project2;
import java.util.*;
public class PostalOffice {
private static Scanner sc1,sc2 = new Scanner(System.in);
public static void main(String[] args){
	Menus asd = new Menus();
	int input;
	System.out.print("\n1.\tAdd a parcel");
	System.out.print("\n2.\tDisplay all parcel details");
	System.out.print("\n3.\tDisplay the highest and lowest parcel");
	System.out.print("\n4.\tDisplay the summary information about all parcels");
	System.out.print("\n5.\tDisplay parcels of specific paymode");
	System.out.print("\n6.\tDisplay parcels attended by a specific parcels person");
	System.out.print("\n7.\tDisplay all parcels, sorted by amount");
	System.out.print("\n\n0.\tQuit");
	System.out.print("\n----------------------------------------------------");
	System.out.print("Your choice?");
	System.out.print("");
	input = sc1.nextInt();
	switch (input)
	{
	case 1:
		asd.menu1();
	break;
	} 
}
}
