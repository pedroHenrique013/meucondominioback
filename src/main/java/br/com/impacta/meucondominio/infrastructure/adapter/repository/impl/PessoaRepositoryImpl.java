package br.com.impacta.meucondominio.infrastructure.adapter.repository.impl;

import br.com.impacta.meucondominio.domain.model.Pessoa;
import br.com.impacta.meucondominio.domain.port.out.CadastroRepository;
import br.com.impacta.meucondominio.infrastructure.adapter.repository.PessoaMongoRepository;
import br.com.impacta.meucondominio.infrastructure.entity.PessoaEntity;
import br.com.impacta.meucondominio.infrastructure.mapper.InfrastructurePessoaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class PessoaRepositoryImpl implements CadastroRepository {

    private final PessoaMongoRepository pessoaMongoRepository;
    private final InfrastructurePessoaMapper mapper;

    @Override
    public void save( Pessoa pessoa) {

        var pessoaEntity = mapper.pessoaToPessoaEntity(pessoa);
        pessoaMongoRepository.save(pessoaEntity);
    }

    @Override
    public Pessoa find(String email) {

        Optional<PessoaEntity> Optpessoa = pessoaMongoRepository.findById(email);
        return mapper.OptionalPessoaEntityToPessoa(Optpessoa.get());
    }
}
