package evaluation;

public class DuplicateNumbers {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] b = { 5, 2, 3, 9, 5, 6, 8, 7, 4 };
		int lim = (a.length < b.length) ? a.length : b.length;
		for (int i = 0; i < lim; i++) {
			if (a[i] == b[i]) {
				System.out.print(a[i] + " ");
			}
		}
	}
}
