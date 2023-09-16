package br.com.impacta.meucondominio.domain.port.in;

import br.com.impacta.meucondominio.domain.model.Login;
import br.com.impacta.meucondominio.domain.model.Pessoa;

public interface LoginService {

    public Login salvarLogin(Login login);

    public Login validarLogin(Login login);
}
