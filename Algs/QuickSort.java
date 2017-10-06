package Algs;

public class QuickSort {

	private static int[] test = new int[] { 9, 7, 5, 11, 12, 2, 14, 3, 10, 6};
	private int[] nums;
		
	public int[] Sort(int[] arr) {
		
		if (arr == null || arr.length ==0)
			return null;
		
		this.nums = arr;
		qSort(0, nums.length - 1);
		return nums;
	}
	
	private void qSort(int low, int high) {
		int i = low, j = high;
		
		int pivot = nums[low + (high - low)/2];
		
		while (i <= j) {
			
			while(nums[i] < pivot)
				i++;
			
			while(nums[j] > pivot)
				j--;
		
			if (i <= j) {
				swap(i, j);
				i++;
				j--;
			}
		
		}
		
		if (low < j)
			qSort(low, j);
		
		if(i < high)
			qSort(i, high);
		
	}
	
	private void swap( int i, int j){
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	}
	
}
