package ExamPreparation;

public class ArrayComparision {

	public static void main(String args[]) {

		int a[]= {100,80,70,60,50};
		boolean comparisionFlag=false;
		for(int iterate=0;iterate<a.length;iterate++) {
			
			for(int j=iterate+1;j<a.length;j++) {
				if(a[j]>a[iterate]){
					System.out.println("position "+(j+1)+ " is greater than position "+(iterate+1));
					comparisionFlag=true;
					break;
				}
			}
		}
		if(comparisionFlag==false) {
			System.out.println("proceed for next steps");
		}
	}

}
