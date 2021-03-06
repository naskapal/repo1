package project2;
import java.util.Arrays;
public class parcelList {
	parcel[] newParcel;
	private int numOfParcels;
	private final int SIZE = 10;
	
public parcelList() {
	newParcel = new parcel[SIZE];
	numOfParcels = 0;
}
public parcelList (int a) {
	if (a <= 0)
	{
	newParcel = new parcel[SIZE];
	}
	else
	{
		newParcel = new parcel[a];
	}
	numOfParcels = 0;
}
public boolean addParcel (parcel x) {
	if (numOfParcels != newParcel.length)
	{
		newParcel[numOfParcels] = x;
		numOfParcels++;
		return true;
	}
	else
	{
		return false;
	}
}
public int getNumOfParcels () {
	return numOfParcels;
}
public String[] summaryParcels() {
	String[] msg = new String [newParcel.length];
	for (int i = 0;i<newParcel.length;i++)
	{
		if (newParcel[i] == null)
		{
			msg[i] = "\n" + (i+1) + ".Empty";
		}
		else
		{
			msg[i] = "\n" + (i+1) + "." + newParcel[i].getCost();
		}
	}
	return msg;
}
public String[] allParcels() {
	String[] parcels = new String [newParcel.length];
	for (int i=0;i<newParcel.length;i++)
	{
		if (newParcel[i] == null)
		{
			parcels[i] = "\n" + (i+1) + ".Empty";
		}
		else
		{
			parcels[i] ="\n" + (i+1) + "." + newParcel[i].toString();
		}
	}
	return parcels;
}
public double totalCost() {
	double tcost = 0;
	for (int i = 0;i<newParcel.length;i++)
	{
		if (newParcel[i] == null)
		{
			tcost = tcost + 0;
		}
		else
		{
			tcost = tcost + newParcel[i].getCost();
		}
	}
	return tcost;
}
public String getMaxCostParcel() {
	double maxCost = newParcel[0].getCost();
	String msg = "";
	for (int i=1;i<newParcel.length;i++)
	{
		if (newParcel[i] != null)
		{
			if(newParcel[i].getCost() > maxCost)
			{
				maxCost = newParcel[i].getCost();
			}	
		}msg = "Found the max cost parcel " + "with price " + maxCost; // not 100% correct, need more think
	}
	return msg;
}
public String getMinCostParcel() {
	double minCost = newParcel[0].getCost();
	String msg = "";
	for (int i=1;i<newParcel.length;i++)
	{
		if (newParcel[i] != null)
		{
		if(newParcel[i].getCost() < minCost)
		{
			minCost = newParcel[i].getCost();
		}
		}msg = "Found the min cost parcel " + "with price " + minCost; //index numbering is still incorrect, like in maxcost, need more think
	}
	return msg;
}
public double[] getParcelByCost(double cost1, double cost2) {
	double[] msg = new double[newParcel.length+2];
	for (int i = 0;i<newParcel.length;i++)
	{
		if (newParcel[i] != null)
		{
		if (newParcel[i].getCost() > cost1 && newParcel[i].getCost() < cost2)
		{
			msg[i] = (i+1) + newParcel[i].getCost();
		}
		}
	}
	return msg;
}
public String[] getParcelsByDestination (char a) {
	String[] msg = new String [newParcel.length];
	for (int i =0;i<newParcel.length;i++)
	{
		if (newParcel[i] != null)
		{
		if (newParcel[i].getDestination() == a)
		{
			msg[i] = (i+1) + "." + newParcel[i].toString();
		}
		else
		{
			msg[i] = "";
		}
		}
	}
	return msg;
}
public String[] sortedBy() {
	String[] asd = new String[newParcel.length];
	double[] dsa = new double[newParcel.length];
	parcel[] copy = new parcel[newParcel.length];
	copy = newParcel;
	for (int i = 0;i<newParcel.length;i++)
	{
		dsa[i] = copy[i].getCost();
	}
	Arrays.sort(dsa);
	for (int i = 0;i<newParcel.length;i++)
	{
		//asd[i] = dsa[i] + ;
	}
	return asd;
}
	}