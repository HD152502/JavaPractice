/**
 * 
 */
package org.dimigo.collection;

/**
 * <pre>
 * dimigo.org.collection
 *   |_ Music
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 6. 2.
 * </pre>
 *
 * @author	    : 구윤태
 * @vresion     : 1.0
 */
public class Music {
	private String title;
	private String singer;
	
	Music(String title, String singer){
		this.title = title;
		this.singer = singer;
	}


	public String getTitle() {
		return title;
	}

	
	public void setTitle(String title) {
		this.title = title;
	}


	public String getSinger() {
		return singer;
	}


	public void setSinger(String singer) {
		this.singer = singer;
	}



	public String toString() {
		return title + " ("+singer+")";
	}
	
	
	
}
