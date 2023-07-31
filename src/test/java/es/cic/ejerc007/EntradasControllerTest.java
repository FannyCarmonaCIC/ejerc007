package es.cic.ejerc007;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EntradasControllerTest {
	
	private EntradaDTO entrada;

	@BeforeEach
	void setUp() throws Exception {
		entrada = new EntradaDTO(1, null, null, 3);
	}

	@Test
	void testCrearEntrada() {
		EntradasController ec = new EntradasController(new EntradasService());
		ec.crear(entrada, 5);
		List<EntradaDTO> listaDeEntradas = ec.consultarEntradas();
		boolean resultado = listaDeEntradas.contains(entrada);
		
		assertTrue(resultado);
	}

}
