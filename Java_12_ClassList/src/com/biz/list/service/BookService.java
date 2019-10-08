package com.biz.list.service;

/*
 * 도서의 정보를 관리하기 위해서
 * Service class만들 예정인데
 * Service class의 설계도를 작성해보자
 */

/**
 * 
 * @author 505-5
 *@version 2
 * 처음 설계당시에 없던 input(int count)를 추가한다.
 * input(int count) method는 다수의 도서정보를 입력받을때
 * 사용할 method로 설정한다. 
 */
public interface BookService {

	// 몇개의 도서정보를 입력할 것인지(도서정보 여러개 만들꺼니까 반복문 사용)
	// 매개변수를 보내서 호출하는 method
	public void input(int count);
	
	
	// 도서정보를 입력받아서 리스트로 생성할 method
	public void input();
	
	// 입력된 도서 리스트를 console에 보일 method
	public void list();
	
	// 도서 1권의 정보를 확인할 method
	// 몇번째 인가를 알려주고 해당하는 index의 위치에 있는
	// 도서정보를 검색
	public void view(int index);
	
	// 도서이름으로 검색해서 
	// 해당하는 이름이 있으면 
	// 도서정보를 보여주는 method
	// 1개의 도서만 보여주는 조건
	public void view(String strName);
	
}
