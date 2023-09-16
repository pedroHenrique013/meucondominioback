package br.com.impacta.meucondominio.infrastructure.entity;

import br.com.impacta.meucondominio.domain.model.Morador;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Jacksonized
@Document(collection = "pessoa")
public class SolicitacaoEntity {

    @Id
    private String email;

    private Long ordemServico;
    private Enum setor;
    private Enum areaComum;
    private String   descricao;
}
