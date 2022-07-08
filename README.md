# Sorting-Algorithms
1)Selection Sort:
The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.

The subarray which is already sorted. 
Remaining subarray which is unsorted.

Initialize minimum value(min_idx) to location 0

Traverse the array to find the minimum element in the array

While traversing if any element smaller than min_idx is found then swap both the values.

Then, increment min_idx to point to next element

Repeat until array is sorted


2)Bubble Sort:
Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in the wrong order. This algorithm is not suitable for large data sets as its average and worst case time complexity is quite high.

3)Insertion Sort:
Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands. The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at the correct position in the sorted part.
This algorithm is one of the simplest algorithm with simple implementation
Basically, Insertion sort is efficient for small data values
Insertion sort is adaptive in nature, i.e. it is appropriate for data sets which are already partially sorted.

To sort an array of size N in ascending order: 

Iterate from arr[1] to arr[N] over the array. 

Compare the current element (key) to its predecessor. 

If the key element is smaller than its predecessor, compare it to the elements before. Move the greater elements one position up to make space for the swapped element.

4)Merge Sort:
The Merge Sort algorithm is a sorting algorithm that is considered as an example of the divide and conquer strategy. So, in this algorithm, the array is initially divided into two equal halves and then they are combined in a sorted manner. We can think of it as a recursive algorithm that continuously splits the array in half until it cannot be further divided. This means that if the array becomes empty or has only one element left, the dividing will stop, i.e. it is the base case to stop the recursion. If the array has multiple elements, we split the array into halves and recursively invoke the merge sort on each of the halves. Finally, when both the halves are sorted, the merge operation is applied. Merge operation is the process of taking two smaller sorted arrays and combining them to eventually make a larger one.

Pseudocode :

•    Declare left variable to 0 and right variable to n-1 
•    Find mid by medium formula. mid = (left+right)/2
•    Call merge sort on (left,mid)
•    Call merge sort on (mid+1,rear)
•    Continue till left is less than right
•    Then call merge function to perform merge sort.
Algorithm:

step 1: start

step 2: declare array and left, right, mid variable 

step 3: perform merge function.
        mergesort(array,left,right)
        mergesort (array, left, right)
        if left > right
        return
        mid= (left+right)/2
        mergesort(array, left, mid)
        mergesort(array, mid+1, right)
        merge(array, left, mid, right)

step 4: Stop

5)Quick Sort:
Like Merge Sort, QuickSort is a Divide and Conquer algorithm. It picks an element as pivot and partitions the given array around the picked pivot. There are many different versions of quickSort that pick pivot in different ways. 

Always pick first element as pivot.
Always pick last element as pivot (implemented below)
Pick a random element as pivot.
Pick median as pivot.
The key process in quickSort is partition(). Target of partitions is, given an array and an element x of array as pivot, put x at its correct position in sorted array and put all smaller elements (smaller than x) before x, and put all greater elements (greater than x) after x. All this should be done in linear time.
Partition Algorithm: 

There can be many ways to do partition, following pseudo code adopts the method given in CLRS book. The logic is simple, we start from the leftmost element and keep track of index of smaller (or equal to) elements as i. While traversing, if we find a smaller element, we swap current element with arr[i]. Otherwise we ignore current element. 

6)Heap Sort:
Heap sort is a comparison-based sorting technique based on Binary Heap data structure. It is similar to selection sort where we first find the minimum element and place the minimum element at the beginning. We repeat the same process for the remaining elements.
How to “heapify” a tree?

The process of reshaping a binary tree into a Heap data structure is known as ‘heapify’. A binary tree is a tree data structure that has two child nodes at max. If a node’s children nodes are ‘heapified’, then only ‘heapify’ process can be applied over that node. A heap should always be a complete binary tree. 

Starting from a complete binary tree, we can modify it to become a Max-Heap by running a function called ‘heapify’ on all the non-leaf elements of the heap. i.e. ‘heapify’ uses recursion.
