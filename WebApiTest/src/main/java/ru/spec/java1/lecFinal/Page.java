package ru.spec.java1.lecFinal;

import java.util.List;

public class Page <K /*extends Comparable*/>{
	K example;
	List<K> list;
	long total;
	int current;
	int prePage;
	
	static <T> T create(Class<T> clz) throws InstantiationException, IllegalAccessException {
		return clz.newInstance();
	}
	
	static <T> T getNull() {
		return null;
	}
	
	K exmaple() {
//		example.
		return example;
	}
	
	public List<K> getList() {
		return list;
	}
	public void setList(List<K> list) {
		this.list = list;
	}
	@Deprecated
	public int getTotal() {
		return (int)total;
	}
	public long getLongTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getCurrent() {
		return current;
	}
	public void setCurrent(int current) {
		this.current = current;
	}
	public int getPrePage() {
		return prePage;
	}
	public void setPrePage(int prePage) {
		this.prePage = prePage;
	}
	
	
}
