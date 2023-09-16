package br.com.impacta.meucondominio.application.facade;

import br.com.impacta.meucondominio.application.dto.request.LoginRequestDTO;
import br.com.impacta.meucondominio.application.dto.response.LoginResponseDTO;

public interface LoginFacade {
    public LoginResponseDTO cadastrarLogin(LoginRequestDTO loginRequestDTO);

    public LoginResponseDTO validarLogin(LoginRequestDTO loginRequestDTO);
}
