/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Snack
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 6.
 * </pre>
 *
 * @author : 구윤태
 * @vresion : 1.0
 */
public class Snack {
	private String name;
	private String company;
	private int price;
	private int number;

	public Snack() {

	}

	public Snack(String name, String company, int price, int number) {
		this.name = name;
		this.company = company;
		this.number = number;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getCompany() {
		return company;
	}

	public int Price() {
		return price;
	}

	public int getNumber() {
		return number;
	}

	public int calcPrice() {
		return price * number;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setNmae(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String toString() {
		return "이름 : " + name + "\n제조사 : " + company + "\n가격 : " + String.format("%,d", price) + "원\n개수 : " + number + "개\n";
	}
}
