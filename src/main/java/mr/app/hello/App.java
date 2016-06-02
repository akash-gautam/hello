package mr.app.hello;

public class App {

	public static String reverse(String msg) {
		return new StringBuilder(msg).reverse().toString();
	}
	
	public static void main(String[] args) {
		System.out.println(reverse(args.length>0 ? args[0] : "HELLO!"));
	}

}
