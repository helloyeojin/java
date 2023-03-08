package com.kbstar.frame;

public interface Service<K, V> {
	public void register(V v) throws Exception;  // value값이 들어올거야~ 
	public void remove(K k) throws Exception;  // key값이 들어올거야~ 
	public void modify(V v) throws Exception;
}
