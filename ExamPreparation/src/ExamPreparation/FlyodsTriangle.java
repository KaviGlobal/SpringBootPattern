package ExamPreparation;

public class FlyodsTriangle {

	public static void main(String args[]) {

		int triangleSize=6;
		int counter=0;
		for(int iterate=1;iterate<=triangleSize;iterate++) {
			
			for(int j=1;j<=iterate;j++) {
				counter=counter+1;
				System.out.print(counter+" ");
			}
			System.out.println(" ");
		}
	}

}
