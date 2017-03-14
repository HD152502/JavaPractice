/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ Operator
 *
 * 1. 개요 : 디미베네
 * 2. 작성일 : 2017. 3. 14.
 * </pre>
 *
 * @author	    : 구윤태
 * @vresion     : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int money = 1700000;
		short employee = 3;
		int store = 1500;
		long allmoney=((long)money*employee*store*12);
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.format("월 평균 급여 : %,d원\n",money);
		System.out.println("점포 내 직원 수 : "+employee+"명");
		System.out.format("점포 수 : %d개",store);
		System.out.println("");
		System.out.println("");
		System.out.format("연간 인건비 : %,d원", allmoney);
	}

}
