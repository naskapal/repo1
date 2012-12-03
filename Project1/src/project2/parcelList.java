package project2;
public class parcelList {
	parcel[] newParcel;
	private int numOfParcels, SIZE = 10;

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
private String allParcels() {
	int i = 0;
	for(i=0;i<=10;i++)
	{
		return i++ +"." + newParcel[numOfParcels].toString();
	}
}
}