package com.deloitte;

public class Computer {
String brandname;
Cpu c;
// for constructor level DI
//Computer (Cpu cpu){
//	this.cpu=cpu;
//}

public String getBrandname() {
	return brandname;
}
public Cpu getC() {
	return c;
}
public void setC(Cpu c) {
	this.c = c;
}
//for setter level DI
public void setBrandname(String brandname) {
	this.brandname = brandname;
}

}
