package edu.met;

public class Product {
	int pid,price;
	String pname,pdesc;
	public Product(int pid, int price, String pname, String pdesc) {
	super();
	this.pid = pid;
	this.price = price;
	this.pname = pname;
	this.pdesc = pdesc;
	}
	public Product() {
	super();
	
	}
	public int getPid() {
		return pid;
		}
		public void setPid(int pid) {
		this.pid = pid;
		}
		public int getPrice() {
		return price;
		}
		public void setPrice(int price) {
		this.price = price;
		}
		public String getPname() {
		return pname;
		}
		public void setPname(String pname) {
		this.pname = pname;
		}
		public String getPdesc() {
			return pdesc;
			}
			public void setPdesc(String pdesc) {
			this.pdesc = pdesc;
			}


}
