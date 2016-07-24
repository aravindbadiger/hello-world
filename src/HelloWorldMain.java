import com.ab.trainings.helloworld.classes.SayHelloWorldImpl;

/**
 * 
 */

/**
 * @author Badiger
 *
 */
public class HelloWorldMain {
	

	private static SayHelloWorldImpl shw;
	
	/**
	 * 
	 */
	public HelloWorldMain() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setShw(new SayHelloWorldImpl());
		System.out.println(getShw().sayHelloWorld());
	}

	/**
	 * @return the shw
	 */
	public static SayHelloWorldImpl getShw() {
		return shw;
	}

	/**
	 * @param shw the shw to set
	 */
	public static void setShw(SayHelloWorldImpl shw) {
		HelloWorldMain.shw = shw;
	}

}
