package com.fma.serverstate;

import java.util.HashMap;

public class Cache {

	private static HashMap<String, Object> cache = new HashMap<String, Object>();


	public static <T> T set(String key, T value) {
		if (cache.containsKey(key))
			cache.replace(key, value);
		else
			cache.put(key, value);
		return get(key);
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T get(String key){
		return (T) cache.get(key);
	}
}
