package com.algaworks.algafoodapi.di.notificacao;

import com.algaworks.algafoodapi.di.modelo.Cliente;
import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorSMS implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        //modo que eu aprendi
        //System.out.println("Notificando " + cliente.getNome() + " por SMS através do telefone + " + cliente.getTelefone()+ ": " + mensagem);

        //modo da aula
        System.out.printf("Notificando %s por SMS através do telefone  %s: %s\n",
                cliente.getNome(), cliente.getTelefone(), mensagem);

    }
}
