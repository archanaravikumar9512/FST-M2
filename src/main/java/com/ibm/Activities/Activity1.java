package com.ibm.Activities;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Activity1 {
	static ArrayList<String> list;

	@BeforeEach
	void setUp() throws Exception {
		list = new ArrayList<String>();
		list.add("alpha");
		list.add("beta");
	}

	@Test
	@Order(1)
	public void insertTest() {
		assertEquals(2, list.size(), "Wrong size");
		list.add(2, "new value");
		assertEquals(3, list.size(), "Wrong size");
		assertEquals("alpha", list.get(0), "Wrong element");
		assertEquals("beta", list.get(1), "Wrong element");
		assertEquals("new value", list.get(2), "Wrong element");
	}

	@Test
	@Order(2)
	public void replaceTest() {

		list.set(1, "new value");
		assertEquals(2, list.size(), "Wrong size");
		assertEquals("alpha", list.get(0), "Wrong element");
		assertEquals("new value", list.get(1), "Wrong element");

	}

	@Disabled("Practising the code")
	@AfterEach
	void test() {

	}

}
