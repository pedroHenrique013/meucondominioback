package br.com.impacta.meucondominio.infrastructure.entity;

import br.com.impacta.meucondominio.domain.model.Login;
import br.com.impacta.meucondominio.domain.model.Morador;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Jacksonized
@Document(collection = "pessoa")
public class PessoaEntity {

    @Id
    private String email;
    @Indexed(unique = true)
    private String cpf;
    private String nome;
    private String contato;
    private Morador morador;
}
