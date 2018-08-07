package com.deloitte;

public class Smartphone {
String name;
double price;
Applications appl1;
Smartphone(Applications appl1){
	this.appl1=appl1;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

}
