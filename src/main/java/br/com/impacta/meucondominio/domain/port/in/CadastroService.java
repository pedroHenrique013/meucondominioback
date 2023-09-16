package br.com.impacta.meucondominio.domain.port.in;

import br.com.impacta.meucondominio.domain.model.Pessoa;

public interface CadastroService {

    public void cadastrarMorador(Pessoa pessoa);
    public Pessoa consultarPessoa(String email);

}
