package com.chainsys.coustmer.product.review;

public class Review {
	public static void main(String[] args) {
		Coustmer coustmer=new Coustmer();
		coustmer.name="karthi";
		coustmer.custid=2012;
		coustmer.product=new Product();
		coustmer.product.id=100;
		coustmer.product.name="mobile phone";
		System.out.println("submit your review"   +"    "+coustmer.product.id+ "   "  +coustmer.product.name);
		
		
		
		
		
	}

}
