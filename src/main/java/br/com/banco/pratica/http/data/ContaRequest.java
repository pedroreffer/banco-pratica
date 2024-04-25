package br.com.banco.pratica.http.data;

import lombok.Data;

@Data
public class ContaRequest {
    private String numero;
    private String Banco;
    private String agencia;
    private ClienteRequest cliente;
}
