package com.algaworks.algafoodapi.di.notificacao;

import com.algaworks.algafoodapi.di.modelo.Cliente;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
public class NotificadorSMS implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.println("Notificando " + cliente.getNome() + " por SMS através do telefoneÇ + " + cliente.getTelefone()+ ": " + mensagem);
    }
}
