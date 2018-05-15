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

		//
		if (args.length == 0) {
			System.out.println("Arguments required");
			System.out.println("   1: Filename");
			System.out.println("   2: Left or Right");
			System.out.println("Going to exit");
			System.exit(0);
		} else {
			if (args.length > 1) {
				param_2 = args[1];
			}
			if (args.length > 0) {
				param_1 = args[0];
			}
		}
		System.out.println("param_1 = " + param_1);
		System.out.println("param_2 = " + param_2);
		
		System.out.println("Process ended");
	}

}
