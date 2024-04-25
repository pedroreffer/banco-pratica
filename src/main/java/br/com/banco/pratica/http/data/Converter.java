package br.com.banco.pratica.http.data;

import br.com.banco.pratica.entity.Cliente;
import br.com.banco.pratica.entity.Conta;

public class Converter {

    public static Conta toConta(ContaRequest request){
        Conta conta = new Conta();
        conta.setAgencia(request.getAgencia());
        conta.setBanco(request.getBanco());
        conta.setNumero(request.getNumero());
        conta.setCliente(toCliente(request.getCliente()));
        return conta;
    }

    public static Cliente toCliente(ClienteRequest request){
        Cliente cliente = new Cliente();
        cliente.setCpf(request.getCpf());
        cliente.setNome(request.getNome());
        cliente.setTelefone(request.getTelefone());
        return cliente;
    }
}
