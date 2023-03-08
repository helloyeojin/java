package com.kbstar.frame;

public interface  DAO<K, V> {
	public static final String IP = "127.0.0.1";  
	//변경할 수 없는 변수 선언 가능! public static final은 생략도 가능함
	public void insert(V v) throws Exception;
	public void delete(K k) throws Exception;
	public abstract void update(V v) throws Exception;  // abstract 생략가능
	
	default void connect() {
		System.out.println(IP+" 에 접속하였습니다");
	}
	default void close() {
		System.out.println(IP+" 에 접속을 해제하였습니다");
	}
}

