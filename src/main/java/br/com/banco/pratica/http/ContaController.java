package br.com.banco.pratica.http;

import br.com.banco.pratica.http.data.ContaRequest;
import br.com.banco.pratica.service.ContaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static br.com.banco.pratica.http.data.Converter.toConta;

@RestController
public class ContaController {

    private final ContaService contaService;

    public ContaController(ContaService contaService) {
        this.contaService = contaService;
    }

    @GetMapping("/conta")
    public ResponseEntity saveConta(ContaRequest request){
        contaService.saveConta(toConta(request));
        return ResponseEntity.ok().build();
    }
}
