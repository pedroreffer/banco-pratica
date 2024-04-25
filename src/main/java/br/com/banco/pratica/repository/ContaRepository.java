package br.com.banco.pratica.repository;

import br.com.banco.pratica.entity.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<Conta, String> {
}
