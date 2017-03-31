/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Question
 *
 * 1. 개요 : 실습과제
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 *
 * @author : 구윤태
 * @vresion : 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String question[] = { "가장 좋아하는 가수는?", "가장 좋아하는 배우는?", "가장 좋아하는 과목은?" };
		String answer[] = { "빅뱅", "원빈", "응용 프로그래밍" };
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 3; i++) {
			System.out.println((i+1)+". "+question[i]);
			String reply = scanner.nextLine();
			System.out.println(answer[i].equals(reply) ? "정답입니다!" : "틀렸습니다!");
			sb.append(question[i] + " ").append(answer[i]).append("입니다.\n");
		}
		System.out.println("<< 결과 출력 >>");
		System.out.println(sb.toString());
	}

}
