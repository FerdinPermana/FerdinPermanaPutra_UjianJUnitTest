package com.juaracoding.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


import com.juaracoding.function.HitungKolam;

import junitparams.*;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class TestKolam {
	HitungKolam kolam;

	@Before
	public void setUp() throws Exception {
		kolam = new HitungKolam();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@FileParameters("src/test/resources/volume_kolam.csv")
	public void testHitungVolume(double panjang, double lebar, double tinggi, double hasil ) {
		assertEquals(hasil, kolam.hitungVolume(panjang, lebar, tinggi), 0.00);
	}

	@Test
	@FileParameters("src/test/resources/keliling_kolam.csv")
	public void testHitungKeliling(double panjang, double lebar, double tinggi, double hasil ) {
		assertEquals(hasil, kolam.hitungKeliling(panjang, lebar, tinggi), 0.00);
	}

}
