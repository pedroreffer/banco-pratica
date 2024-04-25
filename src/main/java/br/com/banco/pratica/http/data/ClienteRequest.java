package br.com.banco.pratica.http.data;

import lombok.Data;

@Data
public class ClienteRequest {

    private String cpf;
    private String nome;
    private String telefone;
}
