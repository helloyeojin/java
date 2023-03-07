package com.kbstar.frame;

public interface Service<K, V> {
	public void register(V v);  // value값이 들어올거야~ 
	public void remove(K k);  // key값이 들어올거야~ 
	public void modify(V v);
}
