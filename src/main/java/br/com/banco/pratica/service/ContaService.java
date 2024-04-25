package br.com.banco.pratica.service;

import br.com.banco.pratica.entity.Conta;
import br.com.banco.pratica.repository.ContaRepository;
import org.springframework.stereotype.Service;

@Service
public class ContaService {

    private final ContaRepository contaRepository;

    public ContaService(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }

    public void saveConta(Conta conta){
        contaRepository.save(conta);
    }
}
