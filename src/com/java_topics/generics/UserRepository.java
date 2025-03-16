package com.java_topics.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserRepository<T>{
	private List<T> items = new ArrayList<>();
	
	public void add(T item) {
		items.add(item);
	}
	
	public void remove(int index) {
		if(index >= 0 && index < items.size()) {
			items.remove(index);
		}
	}
	
	public List<T> getAll(){
		return new ArrayList<>(items);
	}
	
	public T findBy(Predicate<T> condition) {
		for(T item: items) {
			if(condition.test(item)) {
				return item;
			}
		}
		return null;
	}
	
}
