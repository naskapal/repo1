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
	parcelList asd = new parcelList();
	//parcelList dsa = new parcelList(2);
	asd.addParcel(parcel0);
	asd.addParcel(parcel1);
	asd.addParcel(parcel2);
	//asd.allParcels();
	asd.test();
	//dsa.test();
	//System.out.println(asd.getNumOfParcels());
	System.out.print(asd.totalCost());
}
}