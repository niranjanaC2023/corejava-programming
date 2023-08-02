package com.nit.sisu.collection;

public class A implements Comparable<A>{
	private int x;
	private int y;
	
	@Override
	public int compareTo(A a) {
		return this.x - a.x;
	}
public A(int x, int y) {
		this.x = x;
		this.y = y;
	}
public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public int hashCode()
	{
		return x + y;
	}
	
	//if equals method return true, it means duplicate object don't... store..(Object can be duplicate means: either type same or data same)
	//if equals method returns false, it means unique object..store(Object can be unique means: either type different or data different)
	
	@Override
	public boolean equals(Object obj)		
	{
		System.out.println("class A equals is called for "+ this+" "+obj);
		if(obj instanceof A)
		{
			A a = (A)obj;
			return this.x == a.x && this.y == a.y;
		}
		return false;
	}
	
@Override
	public String toString() {
		return "A ("+ x + ", " + y + ")";
	}
public static void main(String[] args) {	
}
}
