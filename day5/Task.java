package com.tra.day5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/*   product.txt
 * 101,box,90,890
   102,table,20,1000
   03,bag,50,200
 */
class ProductNotFoundException extends Exception{
	ProductNotFoundException(String m){
		super(m);
	}
}

class Product{
	Integer id;
	String name;
	Double qty;
	Double price;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getQty() {
		return qty;
	}
	public void setQty(Double qty) {
		this.qty = qty;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", qty=" + qty + ", price=" + price + "]";
	}
	
}

public class Task {

	public static void main(String[] args)  throws IOException,ProductNotFoundException{
		
		FileReader f1=new FileReader("d:\\product.txt"); //existing
		BufferedReader b1=new BufferedReader(f1);  //buffer effect to speed up read
		System.out.println("enter product id");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		String line=null;
		Product p=new Product();
		boolean flag=false;
		while((line=b1.readLine())!=null) {
			//System.out.println(line);
		    String s[]=line.split(",");
		    int id1=Integer.parseInt(s[0]);
		    String name1=s[1];
		    Double qty1=Double.parseDouble(s[2]);
		    Double price1=Double.parseDouble(s[3]);
		    p.setId(id1);
		    p.setName(name1);
		    p.setQty(qty1);
		    p.setPrice(price1);
		    if (id==id1)
		    {	System.out.println("Price for given product id :"+id+" is Rs:"+price1);
		     flag=true;
		    }
		}
		if(flag==false)
			throw new ProductNotFoundException("Given product not found");
		f1.close();
		b1.close();
		

	}

}
