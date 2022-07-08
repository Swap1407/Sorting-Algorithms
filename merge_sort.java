package sorting;

public class merge_sort {
	private static void mrge(int[] arr, int l, int m, int r) {
		int n1 = m-l+1;
		int n2 = r-m;
		
		int left[] = new int[n1];
		int right[] = new int[n2];
		
		for(int i=0;i<n1;i++) {
			left[i] = arr[l+i];
		}
		for(int i=0;i<n2;i++) {
			right[i] = arr[m+1+i];
		}
		
		int k = l,i=0,j=0;
		while(i<n1 && j<n2) {
			if(left[i]<right[j]) {
				arr[k] = left[i];
				i++;
			}
			else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		
		while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
 
        
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
		
	}
	
	private static void sort(int[] arr, int l, int r) {
		if(l<r) {
			int m = (l+r)/2;
			sort(arr,l,m);
			sort(arr,m+1,r);
			
			mrge(arr,l,m,r);
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
		System.out.println("After Merge Sorting: ");
		sort(arr,0,arr.length-1);
		printArray(arr);
	}
}
