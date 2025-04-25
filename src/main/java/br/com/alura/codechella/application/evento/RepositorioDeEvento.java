package br.com.alura.codechella.application.evento;

import br.com.alura.codechella.domain.evento.Evento;
import br.com.alura.codechella.infra.evento.Endereco;

public interface RepositorioDeEvento {
    Evento buscarEventoPorCidade(Endereco cep);
}
