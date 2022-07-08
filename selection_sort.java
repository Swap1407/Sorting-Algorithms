package sorting;

public class selection_sort {
	private static void sort(int[] arr) {
		int n = arr.length;
		int min_index = 0;
		for(int i=0;i<n;i++) {
			min_index = i;
			for(int j = i+1;j<n;j++) {
				if(arr[min_index]>arr[j]) {
					min_index = j;
				}
			}
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
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
		System.out.println("After Sorting: ");
		sort(arr);
		printArray(arr);
	}
}
