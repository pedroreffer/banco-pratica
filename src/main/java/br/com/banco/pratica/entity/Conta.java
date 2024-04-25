package br.com.banco.pratica.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Conta {

    @Id
    @Nonnull
    private String numero;
    private String Banco;
    private String agencia;
    private Cliente cliente;

}
