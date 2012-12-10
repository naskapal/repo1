package project2;

import java.util.*;
public class DSAd {
static Scanner sc1 = new Scanner(System.in);
static String input;
static int numOfParcels;
static double tcost;
public static void main (String [] args){
	parcel parcel0 = new parcel (2,'d');
	parcel parcel1 = new parcel (3,'i');
	parcel parcel2 = new parcel (1,'d');
	parcel parcel3 = new parcel (3,'i');
	parcelList asd = new parcelList();
	//parcelList dsa = new parcelList(2);
	asd.addParcel(parcel0);
	asd.addParcel(parcel1);
	asd.addParcel(parcel2);
	asd.addParcel(parcel3);
	//asd.allParcels();
	//dsa.test();
	//System.out.println(asd.getNumOfParcels());
	tcost = asd.totalCost();
	//System.out.print("\n" + tcost);
	//for (int i = 0;i<9;i++)
	//{
	//System.out.println(asd.test()[i]);
	//}
	//System.out.print("\n" + asd.getMaxCostParcel());
	asd.getParcelByCost(1.0, 98.4);
}
}