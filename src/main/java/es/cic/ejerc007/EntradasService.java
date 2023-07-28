package es.cic.ejerc007;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class EntradasService {

	private List<EntradaDTO> entradas;

	public EntradasService() {
		entradas = new ArrayList<>();
	}

	public void crear(EntradaDTO entrada) {
		entradas.add(entrada);
	}

	public EntradaDTO modificar(int id) {

		throw new UnsupportedOperationException("Método modificar en Service no implementado");
	}

	public void borrarEntrada(int id) {
		
		Optional<EntradaDTO> entradaOptional = entradas.stream()
				.filter(entrada -> entrada.getId() == id)
				.findFirst();
		entradaOptional.ifPresent((entrada) -> entradas.remove(entrada));
		
	}

}
