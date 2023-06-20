package Sorting;

public class ArraySortZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]= {0,2,1,2,0};
		//int a[] = { 0, 1, 0, 0, 2 };
		int j = a.length - 1;
		for (int i = 0; i < a.length; i++) {
			if (i != 0) {
				if (a[i] > a[j] ) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
				if(a[i-1]> a[i]) {
					int temp = a[i-1];
					a[i-1] = a[i];
					a[i] = temp;
				}
			} else {
				if (a[i] > a[j]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;

				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
