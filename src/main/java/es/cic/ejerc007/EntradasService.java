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

	public void crear(EntradaDTO entrada, int numeroDeEntradas) {
		
		double totalPagado = entrada.getPrecio() * numeroDeEntradas;
		int contadorDeEntradas = 0;
		
		if(numeroDeEntradas >= 5) {
			totalPagado = (totalPagado * 10)/100;
			entrada.setTotalPagado(totalPagado);
		} else {
			entrada.setTotalPagado(totalPagado);
		}
		
		while(contadorDeEntradas <= numeroDeEntradas) {
			entradas.add(entrada);
			contadorDeEntradas++;
		}

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
	
	public List<EntradaDTO> consultarEntradas(){
		return entradas;
	}
	

}
