package com.app;

public class Process3 {
	
	private int pid;
	private String pcode;
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	
	
	@Override
	public String toString() {
		return "Process3 [pid=" + pid + ", pcode=" + pcode + "]";
	}

	


}
