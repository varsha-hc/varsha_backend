package com.excel.spring.autowire.annotation;

public class Address {
	
private String place;

@Override
public String toString() {
	return "Address [place=" + place + "]";
}

public String getPlace() {
	return place;
}

public void setPlace(String place) {
	this.place = place;
  }
}
