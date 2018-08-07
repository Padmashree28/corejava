package com.deloitte;

import java.util.*;

public class CollectionExample {
	List citylist;
	Set cityset;
	Map citymap;
	Properties cityprop;
	public List getCitylist() {
		System.out.println("List Elements:" +citylist);
		return citylist;
	}
	public void setCitylist(List citylist) {
		this.citylist = citylist;
	}
	public Set getCityset() {
		System.out.println("Set Elements:" +cityset);
		return cityset;
	}
	public void setCityset(Set cityset) {
		this.cityset = cityset;
	}
	public Map getCitymap() {
		System.out.println("Map Elements:" +citymap);
		return citymap;
	}
	public void setCitymap(Map citymap) {
		this.citymap = citymap;
	}
	public Properties getCityprop() {
		System.out.println("Property Elements:" +cityprop);
		return cityprop;
	}
	public void setCityprop(Properties cityprop) {
		this.cityprop = cityprop;
	}
	

}
