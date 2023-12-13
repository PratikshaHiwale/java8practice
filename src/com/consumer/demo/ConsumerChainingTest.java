package com.consumer.demo;

import java.util.function.Consumer;

public class ConsumerChainingTest {
	public static void main(String[] args) {
		Consumer<String> c1=s->System.out.println(s+" is white colour");
		Consumer<String> c2=s->System.out.println(s+" has 4 legs");
		Consumer<String> c3=s->System.out.println(s+" is eating grass");
		/*
		 * c1.accept("cow"); c2.accept("cow"); c3.accept("cow");
		 */
		/* c1.andThen(c2).andThen(c3).accept("cow"); */
		Consumer<String> c4=c1.andThen(c2).andThen(c3);
		c4.accept("Cow");
	}

}
