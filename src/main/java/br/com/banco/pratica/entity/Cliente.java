package br.com.banco.pratica.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Cliente {

    @Id
    @Nonnull
    private String cpf;
    private String nome;
    private String telefone;
}
