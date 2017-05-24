/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ SybaseDB
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 24.
 * </pre>
 *
 * @author	    : 구윤태
 * @vresion     : 1.0
 */
public class SybaseDB implements IDBManager {


	@Override
	public void insert() {
		System.out.println("Sybase DB저장");
	}

	@Override
	public void search() {
		System.out.println("Sybase DB조회");
	}
	
	@Override
	public void update() {
		System.out.println("Sybase DB변경");
	}

	@Override
	public void delete() {
		System.out.println("Sybase DB삭제");
	}

}
