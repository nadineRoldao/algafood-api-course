package com.algaworks.algafoodapi.di.notificacao;

import com.algaworks.algafoodapi.di.modelo.Cliente;
import org.springframework.stereotype.Component;

@Component
public class NotificadorEmail implements Notificador {

    public NotificadorEmail() {
        System.out.println("NotificadorEmail");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem){
        System.out.println("Notificando " + cliente.getNome() + " através do email " + cliente.getEmail() + ": " + mensagem);

    }
}
