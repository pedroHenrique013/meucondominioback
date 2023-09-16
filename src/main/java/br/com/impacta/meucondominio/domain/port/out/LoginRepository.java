package br.com.impacta.meucondominio.domain.port.out;

import br.com.impacta.meucondominio.domain.model.Login;
import br.com.impacta.meucondominio.domain.model.Pessoa;

public interface LoginRepository {

    public void save(Login login);
    public Login find(String email);
}
