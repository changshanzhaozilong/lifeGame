package service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import data.CellArray;

public class GameServiceTest {

	public static GameService gs=new GameService();
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testInitMap() {
		gs.initMap(40, 40);
	}

	@Test
	public void testGenerate() {
		CellArray i=gs.initMap(40, 40);
		gs.generate(i);
	}

	@Test
	public void testCountNumber() {
		CellArray i=gs.initMap(40, 40);
		gs.countNumber(i, 5, 5);
	}

}
