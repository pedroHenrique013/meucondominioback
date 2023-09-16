package br.com.impacta.meucondominio.infrastructure.mapper;

import br.com.impacta.meucondominio.domain.model.Login;
import br.com.impacta.meucondominio.domain.model.Morador;
import br.com.impacta.meucondominio.domain.model.Pessoa;
import br.com.impacta.meucondominio.infrastructure.entity.LoginEntity;
import br.com.impacta.meucondominio.infrastructure.entity.PessoaEntity;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class InfrastructureLoginMapper {

    public Login LoginEntityToLogin(LoginEntity loginEntity){

        return Login.builder()
                .email(loginEntity.getEmail())
                .senha(loginEntity.getSenha())
                .build();
    }

    public LoginEntity loginToLoginEntity(Login login){

        return LoginEntity.builder()
                .email(login.getEmail())
                .senha(login.getSenha())
                .build();
    }
}
