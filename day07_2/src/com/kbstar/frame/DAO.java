package com.kbstar.frame;

public interface  DAO<K, V> {   // <key값, value값> -> K나 V 대신 다른게 들어가도 상관없음 
	// 아직 dao에 어떤 게 들어올지는 모르겠다~
	public void insert(V v);
	public void delete(K k);
	public void update(V v);
}

