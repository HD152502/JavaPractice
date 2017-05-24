/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_ OracleDB
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 24.
 * </pre>
 *
 * @author	    : 구윤태
 * @vresion     : 1.0
 */
public class OracleDB implements IDBManager {


	@Override
	public void insert() {
		System.out.println("Oracle DB저장");
		
	}


	@Override
	public void search() {
		System.out.println("Oracle DB조회");
		
	}

	
	@Override
	public void update() {
		System.out.println("Oracle DB변겅");
		
	}


	@Override
	public void delete() {
		System.out.println("Oracle DB삭제");
		
	}
	
}
