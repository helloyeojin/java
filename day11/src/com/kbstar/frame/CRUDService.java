package com.kbstar.frame;

import java.util.List;

public interface CRUDService<K,V> {   //여기는 사용자가 웹사이트에서 사용하는 기능 정의 
		public void register(V v) throws Exception;
		public void remove(K k) throws Exception;
		public void modify(V v) throws Exception;
		public V get(K k) throws Exception;
		public List<V> get() throws Exception;
	}


