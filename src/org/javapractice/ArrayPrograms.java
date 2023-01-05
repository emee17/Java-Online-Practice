package org.javapractice;

import java.util.Iterator;

public class ArrayPrograms {

	public static void main(String[] args) {

		// frequencyOfElementsInArray();

		// duplicateInArray();

		// arrayInReverseOrder();

		// printElementAtEvenIndex();
		
		// printElementAtOddIndex();
		
		// maxElementFromArray();
		
		// minElementFromAArray();
		
		// sumOfAllElements();
		
		// sortArray();
		
		

	}

	private static void sortArray() {
		int[] arr = new int[] { 3, 1, 6, 8, 4, 2, 7, 5  };
							//  1, 3	
		for (int i = 0; i < arr.length-1; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				int temp = 0;
				if(arr[i] > arr[j])  {
					
					temp = arr[i];
					arr[i] =  arr[j];
					arr[j] = temp;
					
				}
			}
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
	}

	private static void sumOfAllElements() {
		int[] arr = new int[] { 1, 2, 3, 4, 2, 7, 91, 8, 3 };
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			
			sum+=arr[i];
		}
		System.out.println("Sum is : "+sum);
	}

	private static void minElementFromAArray() {
		int[] arr = new int[] { 1, 2, 3, 4, 2, 7, 91, 8, 3 };
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if( arr[i] < min ) {
				min = arr[i];
			}
		}
		
		System.out.println("Max Eliment is : "+min);
	}

	private static void maxElementFromArray() {
		int[] arr = new int[] { 1, 2, 3, 4, 2, 7, 91, 8, 3 };
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		System.out.println("Max Eliment is : "+max);
	}

	private static void printElementAtOddIndex() {
		int [] arr = new int [] {1, 2, 3, 4, 5};  
        System.out.println("Elements of given array present on odd position: ");  
        //Loop through the array by incrementing value of i by 2  
        for (int i = 0; i < arr.length; i = i+2) {  
            System.out.println(arr[i]);  
        }
	}

	private static void printElementAtEvenIndex() {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };

		System.out.println("Elements of given array present on even position: ");
		// Loop through the array by incrementing value of i by 2
		// Here, i will start from 1 as first even positioned element is present at
		// position 1.
		for (int i = 1; i < arr.length; i = i + 2) {
			System.out.println(arr[i]);
		}
	}

	private static void arrayInReverseOrder() {
		
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("Original array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Array in reverse order: ");
		// Loop through the array in reverse order
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void duplicateInArray() {
		
		int[] arr = new int[] { 1, 2, 3, 4, 2, 7, 8, 8, 3 };
		System.out.println("Duplicate elements in given array: ");
		// Searches for duplicate element
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[j]);
			}
		}
	}

	private static void frequencyOfElementsInArray() {
		
		int[] arr = new int[] { 1, 2, 8, 3, 2, 2, 2, 5, 1 };
		// Array fr will store frequencies of element
		int[] fr = new int[arr.length];
		int visited = -1;

		for (int i = 0; i < arr.length; i++) {

			int count = 1;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {

					fr[j] = visited;
					count++;
				}
			}

			if (fr[i] != visited) {
				fr[i] = count;
			}

		}

		for (int i = 0; i < fr.length; i++) {

			if (fr[i] != visited) {
				System.out.println("    " + arr[i] + "    |    " + fr[i]);
			}
		}
	}
}

//for(int i = 0; i < arr.length; i++){  
//    int count = 1;  
//    
//    for(int j = i+1; j < arr.length; j++){  
//    	//System.out.println(arr[i] +" "+ arr[j]);
//        if(arr[i] == arr[j]){  
//            count++;  
//            //To avoid counting same element again  
//            fr[j] = visited;  
//        }  
//    }  
//    if(fr[i] != visited)  
//        fr[i] = count;  
//}  
//
////Displays the frequency of each element present in array  
//System.out.println("---------------------------------------");  
//System.out.println(" Element | Frequency");  
//System.out.println("---------------------------------------");  
//for(int i = 0; i < fr.length; i++){  
//    if(fr[i] != visited)  
//        System.out.println("    " + arr[i] + "    |    " + fr[i]);  
//}  
//System.out.println("----------------------------------------"); 
