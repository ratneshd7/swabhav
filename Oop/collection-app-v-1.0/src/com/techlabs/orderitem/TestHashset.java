package com.techlabs.orderitem;

import java.util.HashSet;

public class TestHashset {
	public static void main(String[] args) {
		OrderItem ot;
		
		 HashSet<String> set=new HashSet<String>();  
         set.add("Ravi");  
         set.add("Vijay");  
         set.add("Arun"); 
         
         System.out.println(set);
         set.remove("Ravi");
         System.out.println(set);
         
         HashSet<OrderItem> st=new HashSet<>();
        
         st.add(new OrderItem("Book", 100, 5));
         st.add(new OrderItem("Colour", 10, 10));
         ot=new OrderItem("Pencil", 100, 10);
         st.add(ot);
         System.out.println(st);
         
         st.remove(ot);
         System.out.println(st);
	}
}
