/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ PersonTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 8.
 * </pre>
 *
 * @author	    : 구윤태
 * @vresion     : 1.0
 */
public class PersonTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person[] persons = {
				new Person("Tom"),
				new Korean("홍길동"),
				new Japanese("다나카"),
				new Chinese("왕밍")
		};
		
		for(Person person:persons){
			greeting(person);
			System.out.println();
		}
		

	}

	private static void greeting(Person person){
		System.out.println(person.toString());
		person.sayHello();
		person.sayBye();
	}
}
