package br.com.impacta.meucondominio.application.dto.response;

import br.com.impacta.meucondominio.domain.model.Morador;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@AllArgsConstructor
@Data
@Builder
public class ConsultarMoradorResponseDTO implements Serializable {

    private String email;
    private String nome;
    private String cpf;
    private String contato;
    private Morador morador;
}
