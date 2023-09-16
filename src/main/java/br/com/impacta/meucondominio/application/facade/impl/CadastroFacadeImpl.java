package br.com.impacta.meucondominio.application.facade.impl;

import br.com.impacta.meucondominio.application.dto.request.CadastrarMoradorRequestDTO;
import br.com.impacta.meucondominio.application.dto.response.CadastrarMoradorResponseDTO;
import br.com.impacta.meucondominio.application.dto.response.ConsultarMoradorResponseDTO;
import br.com.impacta.meucondominio.application.facade.CadastroFacade;
import br.com.impacta.meucondominio.application.mapper.ApplicationMoradorMapper;
import br.com.impacta.meucondominio.domain.model.Pessoa;
import br.com.impacta.meucondominio.domain.port.in.CadastroService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CadastroFacadeImpl implements CadastroFacade {

    private final CadastroService cadastroService;
    private final ApplicationMoradorMapper mapper;

    @Override
    public CadastrarMoradorResponseDTO cadastrarMorador(CadastrarMoradorRequestDTO cadastrarMoradorRequestDTO) {
        var pessoa = mapper.CadastrarMoradorRequestDTOToPessoa(cadastrarMoradorRequestDTO);
        cadastroService.cadastrarMorador(pessoa);
        return mapper.pessoaToCadastrarMoradorResponseDTO(pessoa);
    }

    @Override
    public ConsultarMoradorResponseDTO consultarMorador(String email) {
        var pessoa = cadastroService.consultarPessoa(email);
        return  mapper.pessoaToPessoaEntity(pessoa);
    }
}
