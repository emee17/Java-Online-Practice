package org.research;

public class TwoArrayExample {

	public static void main(String[] args) {
		
		int [] arr = {-10,-7,-4,-3,0,1,2,4,6,7,9,10}; // -10, -7, -4
		
		int temp = arr.length-1;
		
		int count = 0;
		//System.out.println(arr.length);
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = temp; j >= 0; j--) { //for (int j =i+1; j<arr.length; j++) {//
				count++;
				//System.out.println("Temp "+temp);
				if(arr[i]+arr[j]==0 && arr[i] !=0 && arr[j]!=0) {
					System.out.println(arr[i]);
					
					temp = temp - (arr.length - temp);
					//System.out.println("Temp new "+temp);
				}
				if(arr[i]==4) {
					System.out.println("temp; "+temp);
				}
					
			}
			
		}
		System.out.println(count);
		
	}
}
