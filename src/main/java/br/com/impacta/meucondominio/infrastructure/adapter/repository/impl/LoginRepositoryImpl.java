package br.com.impacta.meucondominio.infrastructure.adapter.repository.impl;


import br.com.impacta.meucondominio.domain.model.Login;
import br.com.impacta.meucondominio.domain.model.Pessoa;
import br.com.impacta.meucondominio.domain.port.out.LoginRepository;
import br.com.impacta.meucondominio.infrastructure.adapter.repository.LoginMongoRepository;
import br.com.impacta.meucondominio.infrastructure.mapper.InfrastructureLoginMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LoginRepositoryImpl implements LoginRepository {

    private final LoginMongoRepository loginMongoRepository;
    private final InfrastructureLoginMapper mapper;

    @Override
    public void save(Login login) {
        var loginEntity = mapper.loginToLoginEntity(login);
        loginMongoRepository.save(loginEntity);
    }

    @Override
    public Login find(String email) {
        var optLogin = loginMongoRepository.findById(email);
        return mapper.LoginEntityToLogin(optLogin.get());
    }
}
