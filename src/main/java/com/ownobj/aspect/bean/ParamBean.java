package com.ownobj.aspect.bean;

public class ParamBean {
	public String arg1;
	public String arg2;
	public ParamBean(String arg1, String arg2) {
		super();
		this.arg1 = arg1;
		this.arg2 = arg2;
	}
	public ParamBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getArg1() {
		return arg1;
	}
	public void setArg1(String arg1) {
		this.arg1 = arg1;
	}
	public String getArg2() {
		return arg2;
	}
	public void setArg2(String arg2) {
		this.arg2 = arg2;
	}
	@Override
	public String toString() {
		return "ParamBean [arg1=" + arg1 + ", arg2=" + arg2 + "]";
	}
	
	
}
