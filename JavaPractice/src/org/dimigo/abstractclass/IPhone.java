/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ IPhone
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 12.
 * </pre>
 *
 * @author	    : 구윤태
 * @vresion     : 1.0
 */
public class IPhone extends SmartPhone {
	IPhone(){
		
	}
	
	IPhone(String model, String company, int price){
		super(model,company,price);
	}
	
	public void pay(){
		System.out.println("애플 페이로 결제합니다.");
	}
	
	public void useAirDrop(){
		System.out.println("AirDrop 기능을 사용합니다.");
	}
}
