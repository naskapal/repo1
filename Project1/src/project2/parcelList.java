package project2;
import java.util.*;
public class parcelList {
	parcel[] newParcel;
	private int numOfParcels, SIZE = 10;
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
private int getNumOfParcels () {
	return numOfParcels;
}
private void allParcels() {
	int i;
	for(i=0;i<=10;)
	{
		System.out.println(i++ +"." + newParcel[numOfParcels++].toString());
	}
}
private double totalCost() {
	double cost, tcost = 0;
	int i;
	for (i=0;i<=10;)
	{
		cost = newParcel[numOfParcels++].getCost();
		tcost = tcost + cost;
	}
	return tcost;
}
private double getMaxCostParcel() {
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
private double getMinCostParcel() {
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
private String getParcelByCost(double cost1, double cost2) {
	String getWantedParcel;
	boolean found= false;
	int i = 0;
	while (!found && i < newParcel.length)
	{
		newParcel[i].equals(cost1);
		newParcel[i].equals(cost2);
	}
}
}