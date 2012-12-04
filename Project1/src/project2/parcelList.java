package project2;
import java.util.*;
public class parcelList {
	parcel[] newParcel;
	private static int numOfParcels, SIZE = 10;
	private Scanner sc1, sc2 = new Scanner(System.in);
public parcelList (int a) {
	if (a > 0)
	{
	newParcel = new parcel[SIZE];
	}
	else
	{
		newParcel = new parcel[a];
	}
	numOfParcels = 0;
}
public boolean addParcel (parcel a) {
	if (numOfParcels == newParcel.length)
		return false;
	newParcel[numOfParcels] = a;
	numOfParcels++;
	return true;
}
public int getNumOfParcels () {
	return numOfParcels;
}
public String allParcels() {
	String msg = "";
	for(int i=1;i<=9;i++)
	{
		msg += newParcel[i].toString();
	}
	return msg;
}
public double totalCost() {
	double cost, tcost = 0;
	int numOfParcels = 0;
	for (int i=0;i<=9;i++)
	{
		cost = newParcel[i].getCost();
		tcost = tcost + cost;
	}
	return tcost;
}
public double getMaxCostParcel() {
	double maxCost = newParcel[0].getCost();
	for (int i=1;i<newParcel.length;i++)
	{
		if(newParcel[i].getCost() > maxCost)
		{
			maxCost = newParcel[i].getCost();
		}
	}
	return maxCost;
}
public double getMinCostParcel() {
	double minCost = newParcel[0].getCost();
	for (int i=1;i<newParcel.length;i++)
	{
		if(newParcel[i].getCost() < minCost)
		{
			minCost = newParcel[i].getCost();
		}
	}
	return minCost;
}
public void getParcelByCost(double cost1, double cost2) {
	boolean found1= false, found2 = false;
	int i = 0;
	while (i < newParcel.length)
	{
		if (cost1 == newParcel[i].getCost())
		{
			found1 = true;
		}
		else
		{
			i++;
		}
	}
	while (i < newParcel.length)
	{
		if (cost2 == newParcel[i].getCost())
		{
			found2 = true;
		}
		else
		{
			i++;
		}
	}
	if (found1 == true && found2 == true)
	{
		System.out.print(cost1);
		for (i=0; i < newParcel.length;)
		{
			if (newParcel[i].getCost() >= cost1 && newParcel[i].getCost() <= cost2)
			{
				System.out.print("\n" + newParcel[i]);
			}
			else
			{
				i++;
			}
		}
		System.out.print("\n" + cost2);
	}
	else
	{
		System.out.print("");
	}
}
public void getParcelsByDestination (char a) {
	boolean found = false;
	for (int i=0; i < newParcel.length;)
	{
		if (a == newParcel[i].getDestination())
		{
			found = true;
			System.out.print("\n" + newParcel[i]);
		}
		else
		{
			i++;
		}
	}
	if (found == false)
	{
		System.out.print("\n");
	}
}
public void sortedBy(String sort) {
	//String[] hasil = new parcel[newParcel.length];
	if (sort.equals("weight"))
	{
		for (int i = 0; i < newParcel.length;)
		{
			if (newParcel[i].equals(sort))
			{
				System.out.println(newParcel[i]);
				//return "\n" + newParcel[i];
			}
		}
		/*
		
		for (int i = 0;i<hasil.length;i++)
		{
			hasil[i] = newParcel[i];
		}
		return Arrays.sort(hasil);
		*/
	}
	}
}