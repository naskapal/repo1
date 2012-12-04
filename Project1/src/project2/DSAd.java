package project2;
import java.util.*;
public class DSAd {
static Scanner sc1 = new Scanner(System.in);
static String input;
static int numOfParcels;
static double tcost;
public static void main (String [] args){
	//parcel parcel1 = new parcel (1,'i');
	parcel parcel2 = new parcel (1,'d');
	parcelList asd = new parcelList(2);
	//asd.addParcel(parcel1);
	asd.addParcel(parcel2);
	asd.allParcels();
	numOfParcels = asd.getNumOfParcels();
	tcost = asd.totalCost();
	System.out.print(tcost);
}
}