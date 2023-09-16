package br.com.impacta.meucondominio.application.facade;

import br.com.impacta.meucondominio.application.dto.request.CadastrarMoradorRequestDTO;
import br.com.impacta.meucondominio.application.dto.response.CadastrarMoradorResponseDTO;
import br.com.impacta.meucondominio.application.dto.response.ConsultarMoradorResponseDTO;
import br.com.impacta.meucondominio.domain.model.Pessoa;

public interface CadastroFacade {

    public CadastrarMoradorResponseDTO cadastrarMorador(CadastrarMoradorRequestDTO cadastrarMoradorRequestDTO);
    public ConsultarMoradorResponseDTO consultarMorador(String email);
}
