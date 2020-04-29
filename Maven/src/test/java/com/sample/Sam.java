package com.sample;

public class Sam{
	public Sam() {
		this("bala");
		System.out.println("default constructor");
	}
  public Sam(int id) {
	  System.out.println("customer id is 12");
  }
  public Sam(String name) {
	  this(67);
	  System.out.println("customer id is" +name);
  }
  public static void main(String[] args) {
	Sam s=new Sam();

}
}