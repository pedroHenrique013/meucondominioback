package br.com.impacta.meucondominio.infrastructure.mapper;

import br.com.impacta.meucondominio.domain.model.Morador;
import br.com.impacta.meucondominio.domain.model.Pessoa;
import br.com.impacta.meucondominio.infrastructure.entity.PessoaEntity;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class InfrastructurePessoaMapper {

    public PessoaEntity pessoaToPessoaEntity(Pessoa pessoa){

        return PessoaEntity.builder()
                .email(pessoa.getEmail())
                .cpf(pessoa.getCpf())
                .nome(pessoa.getNome())
                .contato(pessoa.getContato())
                .morador(Morador.builder()
                        .apartamento(pessoa.getMorador().getApartamento())
                        .bloco(pessoa.getMorador().getBloco())
                        .build())
                .build();
    }

    public Pessoa OptionalPessoaEntityToPessoa(PessoaEntity pessoaEntity){

        return Pessoa.builder()
                .email(pessoaEntity.getEmail())
                .cpf(pessoaEntity.getCpf())
                .nome(pessoaEntity.getNome())
                .contato(pessoaEntity.getContato())
                .morador(Morador.builder()
                        .apartamento(pessoaEntity.getMorador().getApartamento())
                        .bloco(pessoaEntity.getMorador().getBloco())
                        .build())
                .build();
    }
}
