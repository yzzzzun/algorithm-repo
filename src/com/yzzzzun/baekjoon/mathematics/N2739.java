package com.yzzzzun.baekjoon.mathematics;

import java.util.Scanner;

import com.yzzzzun.Problem;

/**
 * 2739번 : N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
 */
public class N2739 implements Problem {

	@Override
	public void solve() {

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(String.format("%d * %d = %d", number, i, number * i));
		}

		scanner.close();
	}
}
