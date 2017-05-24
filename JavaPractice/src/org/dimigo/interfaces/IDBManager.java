/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_ IDBManager
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 24.
 * </pre>
 *
 * @author : 구윤태
 * @vresion : 1.0
 */
public interface IDBManager {
	public static final String ORACLE_DATABASE = "ORACLE";
	public static final String SYBASE_DATABASE = "SYBASE";

	public void insert();

	public void search();

	public void update();

	public void delete();

	public static IDBManager getDBObject(String database) {
		if (database == null) return null;
		else if (ORACLE_DATABASE.equals(database)) {
			IDBManager db = new OracleDB();
			return db;
		} else if (SYBASE_DATABASE.equals(database)) {
			IDBManager db = new SybaseDB();
			return db;
		}
		else return null;

	}
}
