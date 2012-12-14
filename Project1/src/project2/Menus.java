package project2;
import java.util.*;
public class Menus {
	Scanner sc1 = new Scanner(System.in);
	Scanner sc2 = new Scanner(System.in);
	parcel parcel1 = new parcel();
	parcelList newParcel = new parcelList();
	public void menu1() {
		boolean valid1, valid2;
		int weight;
		char dest;
		System.out.print("\nInput the parcel weight in kg :\t");
		weight = sc1.nextInt();
		System.out.print("\nDomestic or International ?\t");
		dest = sc1.next().charAt(0);
		parcel parcelInput = new parcel(weight,dest);
		valid1 = parcel1.validator(weight, dest);
		if (valid1 == true)
		{
		valid2 = newParcel.addParcel(parcelInput);
		if (valid2 == true)
		{
			System.out.print("\nAddition Success!");
		}
		else
		{
			System.out.print("\nAddition Failed");
		}
		}
		}
	public void menu2() {
		for (int i = 0;i<=9;i++)
		{
		System.out.print(newParcel.allParcels()[i]);
		}
	}
	public void menu3() {
		System.out.print("\n" + newParcel.getMaxCostParcel());
		System.out.print("\n" + newParcel.getMinCostParcel());
	}
	public void menu4() {

		for (int i = 0;i<=9;i++)
		{
		System.out.print(newParcel.summaryParcels()[i]);
		}
	}
	
}
