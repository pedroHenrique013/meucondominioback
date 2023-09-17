package br.com.impacta.meucondominio.application.mapper;

import br.com.impacta.meucondominio.application.dto.request.CadastrarMoradorRequestDTO;
import br.com.impacta.meucondominio.application.dto.response.CadastrarMoradorResponseDTO;
import br.com.impacta.meucondominio.application.dto.response.ConsultarMoradorResponseDTO;
import br.com.impacta.meucondominio.domain.model.Login;
import br.com.impacta.meucondominio.domain.model.Morador;
import br.com.impacta.meucondominio.domain.model.Pessoa;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class ApplicationMoradorMapper {

    private final String MORADOR_CADASTRADO_SUCESSO = "Morador Cadastrado com sucesso !";
    public ConsultarMoradorResponseDTO pessoaToPessoaEntity(Pessoa pessoa){

        return ConsultarMoradorResponseDTO.builder()
                .cpf(pessoa.getCpf())
                .nome(pessoa.getNome())
                .email(pessoa.getEmail())
                .contato(pessoa.getContato())
                .morador(pessoa.getMorador())
                .build();
    }

    public CadastrarMoradorResponseDTO pessoaToCadastrarMoradorResponseDTO(Pessoa pessoa){
        return CadastrarMoradorResponseDTO.builder()
                .nome(pessoa.getNome())
                .mensagem(MORADOR_CADASTRADO_SUCESSO)
                .build();
    }

    public Pessoa CadastrarMoradorRequestDTOToPessoa(CadastrarMoradorRequestDTO cadastrarMoradorRequestDTO){
        return Pessoa.builder()
                .cpf(cadastrarMoradorRequestDTO.getCpf())
                .nome(cadastrarMoradorRequestDTO.getNome())
                .email(cadastrarMoradorRequestDTO.getEmail())
                .contato(cadastrarMoradorRequestDTO.getContato())
                .morador(Morador.builder()
                        .apartamento(cadastrarMoradorRequestDTO.getMorador().getApartamento())
                        .bloco(cadastrarMoradorRequestDTO.getMorador().getBloco())
                        .build())
                .login(Login.builder()
                        .email(cadastrarMoradorRequestDTO.getEmail())
                        .senha(cadastrarMoradorRequestDTO.getLogin().getSenha())
                        .build())
                .build();
    }
}
