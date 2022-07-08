package sorting;

public class bubble_sort {
	private static void sort(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
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
		System.out.println("After Bubble Sorting: ");
		sort(arr);
		printArray(arr);
	}
}
