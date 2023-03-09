package com.kbstar.frame;

import java.util.List;

public interface DAO<K,V> {  //여기는 생성된 정보를 db에 넣는 것에 관련된 기능 정의 
	public void insert(V v) throws Exception;
	public void delete(K k) throws Exception;
	public void update(V v) throws Exception;
	public V select(K k) throws Exception;
	public List<V> select() throws Exception;
}
