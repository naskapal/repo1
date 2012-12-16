package project2;
import java.util.*;
public class Menus {
	Scanner sc1 = new Scanner(System.in);
	Scanner sc2 = new Scanner(System.in);
	parcel parcel1 = new parcel(1,'d');
	parcelList newParcel = new parcelList();
	public void menu1() {
		boolean valid2;
		int weight;
		char dest;
		do
		{
		System.out.print("\nInput the parcel weight in kg :\t");
		weight = sc1.nextInt();
		if (weight <= 0)
		{
			System.out.print("\nYou must enter non negative value");
		}
		}
		while (weight <= 0);
		do
		{
		System.out.print("\nDomestic or International ?\t");
		dest = sc2.next().charAt(0);
		if ((dest != 'd' || dest != 'D') && (dest != 'i' || dest != 'I'))
		{
			System.out.print("\nYou must enter 'd', 'D', 'i', or 'I' only ");
		}
		}
		while ((dest != 'd' || dest != 'D') && (dest != 'i' || dest != 'I'));
		parcel parcelInput = new parcel(weight,dest);
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
	public void menu5() {
		double[] msg = new double[10];
		System.out.print("\nInput the lowest price :\t");
		double cost1 = sc1.nextDouble();
		System.out.print("\nInput the highest price :\t");
		double cost2 = sc2.nextDouble();
		msg = newParcel.getParcelByCost(cost1, cost2);
		System.out.print("\n" + cost1);
		for (int i = 0;i<10;i++)
		{
			if (msg[i] == 0.0)
			{
				System.out.print("");
			}
			else
			{
			System.out.print("\n" + msg[i]);
			}
		}
		System.out.print("\n" + cost2);
	}
	public void menu6() {
		char dest;
		String[] msg = new String[10];
		System.out.print("\nInput the desired destination :\t");
		dest = sc1.next().charAt(0);
		msg = newParcel.getParcelsByDestination(dest);
		if (msg[0] == "")
		{
			System.out.print("\nCannot found desired destination");
		}
		else
		{
		for (int i = 0;i<10;i++)
		{
			if (msg[i] == "")
			{
				System.out.print("");
			}
			else if (msg[i] == null)
			{
				System.out.print("");
			}
			else
			{
				System.out.print("\n" + msg[i]);
			}
		}

	}
	}
}