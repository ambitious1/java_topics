package com.java_topics.scope.privte;

public class A {
	String msg;
	
	private String addFormatting(String x, char gender) {
		return gender == 'm' ? x.toUpperCase()+ " Bredren!!!!" : x.toUpperCase()+ " Baby!!!!";
	}
	
	public void setDisplayMsg(String v, char g)
    {
        this.msg = addFormatting(v, g);
    }
	
	public String getDisplayMsg() {
		return msg;
	}
	
}
