package sort;

public class BubbleSort implements Sortable {

	@Override
	public void sort(int[] nums) {
		bubble(nums);
	}
	
	private void bubble(int[] nums) {
		int n = nums.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(nums[j]>nums[j+1]) {
					swap(nums,j,j+1);
				}
			}
		}
	}
	
	private void swap(int[] nums,int i,int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}


