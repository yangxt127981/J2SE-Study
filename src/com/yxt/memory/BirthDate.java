package com.yxt.memory;

public class BirthDate {
   private int day;
   private int month;
   private int year;
   
	public BirthDate(int d,int m, int y)   {
		day=d;
		month=m;
		year=y;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void display(){
		System.out.println(day+"-"+month+"-"+year);
	}
  
}
