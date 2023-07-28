package es.cic.ejerc007;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	public void borrarEntrada(EntradaDTO entrada) {
		entradasService.borrarEntrada(entrada.getId());
	}

}
