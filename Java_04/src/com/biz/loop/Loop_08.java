package com.biz.loop;

public class Loop_08 {

	public static void main(String[] args) {

		// nCount 변수를 선언하고
		// for 반복문 시작할 때 reset을 수행한 후 count 수행
		int nCount = 0;
		for(nCount = 0 ; nCount < 10 ; nCount++) {
		
		}
		// for 반복문이 끝나도 nCount 값은 읽거나, 쓰기가 가능
		// 반복문이 몇번 실행 되었나를 확인하고 싶을때는
		// nCount 값을 읽어 보면 알 수 있다.
		System.out.println("nCount : " + nCount);
		
		// i 변수를 for 반복문이 시작한 후
		// 선언과 초기화를 한 후 count 수행
		for(int i = 0 ; i < 10 ; i++) {
		
		}
		// i 변수는 for 반복문이 종료되면
		// 메모리에서 삭제(해제) ehldj
		// 읽거나 쓰기가 불가능
		// 반복문이 몇번 실행되었나에는 관심 없을때 사용하는
		// 일반적 for 반복문
		
		
		
		// nCount 변수값 읽기 가능
		System.out.println("nCount : " + nCount);
		
		
		
		
		// [i 변수값 읽기 오류]
		// System.out.println("i : " + i); 
		//for 이 이미 시작된 후에 변수가 선언돼서
		// 포문이 끝남과 동시에 변수 i 가 삭제됨
		// for ()안에서 시작된 변수는 포문이 끝나면(포문 밖에서는) 더이상 읽기 불가능
	}

}