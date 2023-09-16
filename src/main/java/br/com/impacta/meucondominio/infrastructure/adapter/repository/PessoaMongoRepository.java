package br.com.impacta.meucondominio.infrastructure.adapter.repository;

import br.com.impacta.meucondominio.infrastructure.entity.PessoaEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaMongoRepository extends MongoRepository<PessoaEntity, String> {}
