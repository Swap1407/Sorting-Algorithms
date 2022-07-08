package sorting;

public class quick_sort {
	private static int partition(int[] arr, int l, int r) {
		int pivot = arr[r];
		int i = (l - 1);
		 
	    for(int j = l; j <= r - 1; j++){
	        // If current element is smaller than the pivot
	        if (arr[j] < pivot){
	            // Increment index of smaller element
	            i++;
	            swap(arr, i, j);
	        }
	    }
	    swap(arr, i + 1, r);
	    return (i + 1);
	}
	
	private static void swap(int[] arr, int i, int j) {
		 int temp = arr[i];
		    arr[i] = arr[j];
		    arr[j] = temp;	
	}

	private static void sort(int[] arr, int l, int r) {
		if(l<r) {
			int part = partition(arr,l,r);		
			sort(arr,l,part-1);
			sort(arr,part+1,r);
		}		
	}

	private static void printArray(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[] = {64,25,12,22,11};
		System.out.println("Before Sorting: ");
		printArray(arr);
		System.out.println("After Quick Sorting: ");
		sort(arr,0,arr.length-1);
		printArray(arr);
	}
}