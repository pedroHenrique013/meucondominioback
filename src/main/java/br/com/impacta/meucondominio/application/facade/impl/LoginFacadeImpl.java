package br.com.impacta.meucondominio.application.facade.impl;

import br.com.impacta.meucondominio.application.dto.request.LoginRequestDTO;
import br.com.impacta.meucondominio.application.dto.response.CadastrarMoradorResponseDTO;
import br.com.impacta.meucondominio.application.dto.response.LoginResponseDTO;
import br.com.impacta.meucondominio.application.facade.LoginFacade;
import br.com.impacta.meucondominio.application.mapper.ApplicationLoginMapper;
import br.com.impacta.meucondominio.domain.port.in.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LoginFacadeImpl implements LoginFacade {

    private final LoginService loginService;
    private final ApplicationLoginMapper mapper;

    @Override
    public LoginResponseDTO cadastrarLogin(LoginRequestDTO loginRequestDTO) {
        var login = mapper.LoginRequestDTOToLogin(loginRequestDTO);
        return mapper.LoginToLoginResponseDTO(loginService.salvarLogin(login));
    }

    @Override
    public LoginResponseDTO validarLogin(LoginRequestDTO loginRequestDTO) {
        var login = mapper.LoginRequestDTOToLogin(loginRequestDTO);
        return mapper.LoginToLoginResponseDTO(loginService.validarLogin(login));
    }
}
