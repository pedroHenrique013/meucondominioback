package br.com.impacta.meucondominio.domain.port.out;

import br.com.impacta.meucondominio.domain.model.Pessoa;
import br.com.impacta.meucondominio.infrastructure.entity.PessoaEntity;

import java.util.Optional;

public interface CadastroRepository {

    public void save(Pessoa pessoa);
    public Pessoa find(String email);
}
