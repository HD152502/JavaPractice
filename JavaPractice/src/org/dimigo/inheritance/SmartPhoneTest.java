/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ SmartPhoneTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 12.
 * </pre>
 *
 * @author	    : 구윤태
 * @vresion     : 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SmartPhone[] smartphones = {
				new IPhone("iPhone 7","애플",900000),
				new Galaxy("갤럭시 S8","삼성",800000)
		};
		for(SmartPhone smartphone:smartphones){
			System.out.println(smartphone.toString());
			smartphone.turnOn();
			smartphone.pay();
			smartphone.useSpecialFunction(smartphone);
			smartphone.turnOff();
			System.out.println();
		}

	}

}
