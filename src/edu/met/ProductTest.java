package edu.met;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
	public class ProductTest {
	private static ApplicationContext ctx;
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	ctx=new ClassPathXmlApplicationContext("AppCtx.xml");
	Product p1=(Product) ctx.getBean("Product");
	//p1.setPid(104);
	//p1.setPname("Tyre");
	//p1.setPdesc("MRF");
	//p1.setPrice(5000);
	ProductDao d1=(ProductDao) ctx.getBean("productD");
	//System.out.println("Inserted : "+d1.savedProduct(p1));
	//p1.setPid(102);
	//d1.updateProduct(p1, "red shirt");
	for(Product p:d1.getProduct())
	{
	System.out.println("\t"+p.getPid()+"\t"+p.getPname()
	+"\t"+p.getPdesc()+"\t"+p.getPrice());
	}
	}

}
