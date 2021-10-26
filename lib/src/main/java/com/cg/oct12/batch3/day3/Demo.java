package com.cg.oct12.batch3.day3;

public class Demo {

	
		//static method- free access-with class reference
		static void hello() {
			System.out.println("Hello World");
		}

		// non-static method- restricted access - with object reference
		void hii() {
			System.out.println("Hii World");
		}

		public static void main(String[] args) {
			System.out.println("Start");

			hello();

			Demo obj = new Demo();

			obj.hii();
			System.out.println("End");
		}

	


	}


