package org.junit.jupiter.project;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.project.Passenger;

public class PassengerTest {
private Passenger passenger;
	
	@BeforeEach
	void setUp() throws Exception {
		passenger = new Passenger("Ali", true);
	}

	@Test
	public void testPrintData() {
		Passenger mike = new Passenger("Mike", false);
		
		//cek VIP
		assertFalse(mike.isVip());//bukan VIP
		assertTrue(passenger.isVip());//VIP
		
		//mengecek nama equals atau tdk
		assertEquals(mike.getName(), "Mike");//nama = mike
		assertEquals(passenger.getName(), "Ali");
	}
}
