package sort;


public class QuickSort implements Sortable {

	@Override
	public void sort(int[] nums) {
		quickSort(nums, 0, nums.length-1);
	}

	private void quickSort(int[] nums, int start, int end) {
		if (start < end) {
			int pivot = partition(nums, start, end);
			quickSort(nums, start, pivot-1);
			quickSort(nums, pivot + 1, end);
		}
	}

	private int partition(int[] nums, int start, int end) {
		int pivot = nums[end];
		int i = start-1;
		for(int j = start;j<end;j++) {
			if(nums[j]<pivot) {
				i++;
				swap(nums,i,j);
			}
		}
		swap(nums, i+1, end);
		return i+1;
	}

	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
