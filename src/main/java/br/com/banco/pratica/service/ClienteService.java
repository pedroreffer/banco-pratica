package br.com.banco.pratica.service;

import br.com.banco.pratica.entity.Cliente;
import br.com.banco.pratica.repository.ClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;


    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public void saveCliente(Cliente cliente){
        clienteRepository.save(cliente);
    }
}
