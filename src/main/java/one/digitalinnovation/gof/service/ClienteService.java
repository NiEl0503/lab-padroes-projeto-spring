package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;

public interface ClienteService {

    Iterable<Cliente> getAllClientes();

    Cliente getClienteById(Long id);

    void insertarCliente(Cliente cliente);

    void actualizarCliente(Long id, Cliente cliente);

    void eliminarCliente(Long id);
}
