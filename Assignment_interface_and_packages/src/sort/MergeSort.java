package sort;

import java.util.Arrays;

public class MergeSort implements Sortable{

	@Override
	public void sort(int[] nums) {
		int start = 0,end = nums.length-1;
		mergeSort(nums, start, end);		
	}
	
	private void mergeSort(int[] nums,int start,int end) {
		if(start<end) {
			int mid = (start+end)/2;
			mergeSort(nums,start,mid);
			mergeSort(nums,mid+1,end);
			merge(nums,start,mid,end);
		}
	}
	
	private void merge(int[] nums,int start,int mid,int end) {
		int[] temp = new int[end-start+1];
		int i,j,k;
		i = start;
		j = mid+1;
		k = 0;
		while(i <= mid && j <= end) {
			if(nums[i] < nums[j]) {
				temp[k++] = nums[i++];
			}else {
				temp[k++] = nums[j++];
			}
		}
		while(i<=mid) {
			temp[k++] = nums[i++];
		}
		while(j<=end) {
			temp[k++] = nums[j++];
		}
		k=0;
		for(i=start;i<=end;i++) {
			nums[i] = temp[k++];
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {34,5,6,3,2,4,6,7};
		new MergeSort().sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
