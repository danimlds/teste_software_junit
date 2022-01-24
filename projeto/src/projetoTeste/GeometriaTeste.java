package projetoTeste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import projeto.Geometria;

class GeometriaTeste {
	/*
	private Geometria geometria;
	@Before
	void setUp() {
		System.out.println("Before!");
		new Geometria();
	}
	@After
	void tearDown() {
		System.out.println("After!");
	}*/

	@Test
	void testeCalcularDistancia() {
		Geometria geometria = new Geometria();
		assertEquals(6.3245553203367586639977870888654, geometria.calcularDistancia(3, 9, 4, 6));
		assertEquals(21.213203435596425732025330863145, geometria.calcularDistancia(-10 , 5 , -10, 5));
		assertEquals(4.2426406871192851464050661726291, geometria.calcularDistancia(2, -1, 2, -1));
		assertEquals(5.0, geometria.calcularDistancia(3, -1, -1, 2));
		assertEquals(5.0, geometria.calcularDistancia(-3, 1, 1, -2));
		assertEquals(1.4142135623730951, geometria.calcularDistancia(-1, -2, -1, -2));
	}
	@Test
	void testeCalcularAreaQuadrado() {
		Geometria geometria = new Geometria();
		assertEquals(10000, geometria.areaQuadrado(100));
		assertEquals(25, geometria.areaQuadrado(5));
		assertEquals(1, geometria.areaQuadrado(-1));
		assertEquals(0, geometria.areaQuadrado(0));
	}
	@Test
	void testeCalcularAreaCircunferencia() {
		Geometria geometria = new Geometria();
		assertEquals(78.539816339744830961566084581988, geometria.areaCircunferencia(5));
		assertEquals(314.15926535897932384626433832795, geometria.areaCircunferencia(-10));
		assertEquals(0, geometria.areaCircunferencia(0));
	}
	@Test
	void testeCalcularHipotenusa() {
		Geometria geometria = new Geometria();
		assertEquals(0, geometria.calcularHipotenusaTrianguloRetangulo(0, 0));
		assertEquals(10.198039027185569660056448218046, geometria.calcularHipotenusaTrianguloRetangulo(-2, 10));
		assertEquals(10.770329614269008062501420983081, geometria.calcularHipotenusaTrianguloRetangulo(10, -4));
		assertEquals(15, geometria.calcularHipotenusaTrianguloRetangulo(9, 12));
		assertEquals(14.142135623730950488016887242097, geometria.calcularHipotenusaTrianguloRetangulo(-10, -10));
	}
}
