package project2;

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
		//System.out.println(numOfParcels);
		numOfParcels++;
		//System.out.println(numOfParcels);
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
public String allParcels() {
	String msg = "";
	int numOfParcels = 0;
	for(int i=1;i<=getNumOfParcels();i++)
	{
		msg += i + "." + newParcel[numOfParcels].toString();
	}
	return msg;
}
public void test() {
	for (int i=0;i<newParcel.length;i++)
	{
		if (newParcel[i] == null)
		{
			System.out.println("null");
		}
		else
		{
			System.out.println(i + "." + newParcel[i].toString());
		}
	}
	System.out.println(newParcel[1].getCost());
}
public double totalCost() {
	double tcost = 0;
	for (int i = 0;i<newParcel.length;i++)
	{
		tcost = tcost + newParcel[i].getCost();
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