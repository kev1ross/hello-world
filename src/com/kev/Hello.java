/**
 * 
 */
package com.kev;

/**
 * @author kevin
 *
 */
public class Hello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Process started");

		// Initialise parameters
		String param_1 = "";
		String param_2 = "";
		String param_3 = "";

		//
		if (args.length == 0) {
			System.out.println("Arguments required");
			System.out.println("   1: Filename");
			System.out.println("   2: Left or Right");
			System.out.println("   3: Up or Down");
			System.out.println("Going to exit");
			System.exit(0);
		} else {
			if (args.length > 2) {
				param_3 = args[2];
			}
			if (args.length > 1) {
				param_2 = args[1];
			}
			if (args.length > 0) {
				param_1 = args[0];
			}
		}
		System.out.println("param_1 = " + param_1);
		System.out.println("param_2 = " + param_2);
		System.out.println("param_3 = " + param_3);

		if (param_1.equals("Fish")) {
			System.out.println("You are fishing!");
		}

		System.out.println("Process ended");
	}

}
