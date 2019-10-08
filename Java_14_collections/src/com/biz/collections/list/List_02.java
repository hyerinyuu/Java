package com.biz.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_02 {

	public static void main(String[] args) {

		// 이렇게 하면 오류가 날 가능성이 있어서 항상 List형으로 사용
		// ArrayList<String> aList = new ArrayList<String>();
		List<String> strList = new ArrayList<String>();
		
		strList.add("홍길동");
		strList.add("이몽룡");
		strList.add("성춘향");
		strList.add("임꺽정");
		strList.add("장길산");
		strList.add("장보고");
		
		
		System.out.println(strList);
		
		// strList 자체를 정렬해서
		// 다시 strList에 저장해준다.
		Collections.sort(strList);
		System.out.println(strList);
		
		// list에 담긴 값을 지 맘대로 뒤섞기
		Collections.shuffle(strList);
		System.out.println(strList);
	}

}
