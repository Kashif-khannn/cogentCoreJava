package com.cogent.employeemanagementsystem;

public class Main3 {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		// Default constructor: by default it is capable to hold 16 chars
		buffer.append("kashif");
		//6 characters
		
		System.out.println(buffer.capacity());
		System.out.println(buffer.length());
		buffer.append(" Cogent");
		System.out.println(buffer.capacity());
		System.out.println(buffer.length());
		buffer.append(" ");
		System.out.println(buffer.capacity());
		System.out.println(buffer.length());
		buffer.append("sdfasdfasdfasdcsdfsdcvsdfsdvcsdvc");
		System.out.println(buffer.capacity());
		System.out.println(buffer.length());
	
		
//		int b = 10;
//		int c = 10;
//		System.out.println(b==c);
		
//    	String s = "cogent university";
//    	//s.isBlank();
//    	System.out.println(s.isEmpty());
//    	System.out.println(s.length());
    	// length method : string class
    	// length property is: array
//		System.out.println("abi".compareTo("ADI"));
//		System.out.println("ABI".codePointAt(0));
//		System.out.println("abi".codePointAt(0));
//		System.out.println("a".compareTo("a"));
//		System.out.println("b".compareTo("D"));
		
		
		// this will give false because the new string reference is not the same as the spool
		// equals method used to check the content 
		// == operator is used to check location in case of ref
		// in case of primitive ==> value would be the expectation
		// == used to check whether s and other
		// ref is referring to same object or not
		// TODO Auto-generated method stub
//		String s = "Kashif";
//		String s2 = "cogent";
//		String s3 = new String("Cogent University"); // allocated in heap area
//		// CN ref = RT allocation
//		
//		String s4 = "Kashif";
//		String s5 = "cogent";
//		
//		System.out.println(s4.concat(" " + s5));
//		// concat is the only one solution where we can trust
//		
//		System.out.println(s4);
//		// because string objects are immutable 
//		// 3-4 methods that return a String object except concat
//		// toUpperCase(), toLowerCase(), valueOf()
//		
//		System.out.println(s4.toUpperCase());
//		System.out.println((s4.substring(0)));
		
//		try {
//			String ip = "192.168.1.1";
//			
//			String [] ipAddress = ip.split("\\.");
//			for(String string: ipAddress) {
//				System.out.println(Integer.parseInt(string));
//				int a = Integer.parseInt(string);
//				if(a>= 0 && a<=255) {
//					System.out.println("In the range ");
//					
//				}
//				else 
//					return; // terminates the execution 
//				// could also use System.exit(0);
//			} 
//			int classCell = Integer.parseInt(ipAddress[0]);
//			if(classCell >=0 && classCell <= 126) {
//				System.out.println("IP belongs to class A ");
//			} else if (classCell>=126 && classCell <=191) {
//				System.out.println("IP belongs to class B");
//			} else if(classCell>=192 && classCell<=223) {
//				System.out.println("IP belongs to class C");
//			} else {
//				System.out.println("IP belongs to class D");
//			}
//		} catch (NumberFormatException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		// \\.
//		// \\ => \.
//		// \. is an escape sequence
//		
//		

	}

}
