package LambdaPreparation;

public class HelloWorldFunctionLambda {

	
	interface FunInterface1 {
		String sayMessage(String message);
	}
	
	interface ReverseFunction{	
		StringBuilder reverseString(StringBuilder  msg);
	}
	
	
	public static void main(String args[]) {
		
		FunInterface1 fobject1=message->message+" welcome";
		System.out.println(fobject1.sayMessage("hi"));
		ReverseFunction rfunction=message->message.reverse();
		StringBuilder sb=new StringBuilder();
		sb.append("welcome");
		System.out.println(rfunction.reverseString(sb));
		
		
		
	}
}
