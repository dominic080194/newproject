package org.company;

public class CompanyInfo {
	public void companyName(String n,String a,int p) {
System.out.println("company name is:"+n+"\t company add:"+a+"\t pin code:"+62501);
	}
	public void CompanyName(String m,int id,long phn) {
	System.out.println("company mail id is:"+m+"\n company id is:"+id+"\n company phone no is:"+phn);
	}
public static void main(String[] args) {
	CompanyInfo e = new CompanyInfo();
		e.companyName("chemito info tech", "chennai", 60099);
	e.CompanyName("chemito93@gamil.in", 154646,9494994945l);
	e.CompanyName("hcl", 5686, 8870892437l);
}
}
