package LambdaPreparation;

public class FunctionalLambdaExample {

	interface FunInterface1 {
		int operation(int a, int b);
	}

	interface FunInterface2 {
		void sayMessage(String message);
	}
	
	interface FunInterface3 {
		String sayMessage(String message);
	}
	
	interface FunInterface4{
		String returnFileName(String filePath);
	}
	
	interface FunInterface5{
		String replace(String content);
	}
	
	private int operate(int a, int b, FunInterface1 fobj) {
		return fobj.operation(a, b);
	}

	public static void main(String args[]) {
		FunInterface1 add = (int x, int y) -> x + y;
		FunInterface1 mul = (int x, int y) -> x * y;
		FunInterface1 div = (int x, int y) -> x / y;
		FunctionalLambdaExample fobj = new FunctionalLambdaExample();
		System.out.println(fobj.operate(3, 4, add));
		System.out.println(fobj.operate(3, 4, mul));
		System.out.println(fobj.operate(24, 4, div));
		FunInterface2 fobject2 = message -> System.out.println("hello " + message);
		fobject2.sayMessage("Geek");
		FunInterface3 fobject3=message->message+" how are you?";
		System.out.println(fobject3.sayMessage("hi"));
		
		FunInterface4 fobject4=filePath->filePath.substring(filePath.indexOf(".")+1);;
		System.out.println(fobject4.returnFileName("c:\\temp.jpg"));
		System.out.println(fobject4.returnFileName("c:\\temp1.png"));
		System.out.println(fobject4.returnFileName("c:\\temp2.bmp"));
		System.out.println(fobject4.returnFileName("c:\\temp3.tiff"));
		
		FunInterface5 fobject5=content->content.replaceAll("sam", "santhosh");
		System.out.println(fobject5.replace("hi sam where are you same it is same on you"));
		
	}
}
