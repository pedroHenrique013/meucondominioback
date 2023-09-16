package br.com.impacta.meucondominio.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Pessoa {

    private String email;
    private String nome;
    private String cpf;
    private String contato;

    private Morador morador;
    private Login login;
}
