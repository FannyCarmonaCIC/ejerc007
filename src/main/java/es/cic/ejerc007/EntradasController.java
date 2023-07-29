package es.cic.ejerc007;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntradasController {
	
	@Autowired
	private EntradasService entradasService;

	public EntradasController() {
	}
	
	@PostMapping("/crearentrada")
	public String crear(EntradaDTO entrada) {
		entradasService.crear(entrada);
		return "Entrada creada";
	}
	
	public void modificar(EntradaDTO entrada) {
		entradasService.modificar(entrada.getId());
	}
	
	@DeleteMapping("/entradas/borrar")
	public String borrarEntrada(EntradaDTO entrada) {
		entradasService.borrarEntrada(entrada.getId());
		return "Entrada borrada";
	}
	
	public int calcularPrecioTotal(EntradaDTO entrada) {
		return entradasService.calcularPrecioTotal(entrada.getTotalDeEntradas());
	}
	
	@GetMapping("/entradas/listar")
	public List<EntradaDTO> consultarEntradas(){
		return entradasService.consultarEntradas();
	}

}
