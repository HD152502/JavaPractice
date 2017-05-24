/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_ DBTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 24.
 * </pre>
 *
 * @author	    : 구윤태
 * @vresion     : 1.0
 */
public class DBTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("<< 변경 전 >>");
		IDBManager oldDB = IDBManager.getDBObject(IDBManager.SYBASE_DATABASE);
		IDBManager newDB = IDBManager.getDBObject(IDBManager.ORACLE_DATABASE);
		crud(oldDB);
		System.out.println("<< 변경 후 >>");
		crud(newDB);
	}
	
	private static void crud(IDBManager db){
		db.insert();
		db.search();
		db.update();
		db.delete();
		System.out.println();
	}

}
