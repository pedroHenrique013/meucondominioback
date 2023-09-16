package br.com.impacta.meucondominio.application.dto.request;

import br.com.impacta.meucondominio.application.dto.LoginDTO;
import br.com.impacta.meucondominio.application.dto.MoradorDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CadastrarMoradorRequestDTO implements Serializable {

    private static final long serialVersionUID = -2719958873395673522L;

    @NotNull(message = "{campo.email.obrigatorio}")
    @NotBlank(message = "{campo.email.obrigatorio}")
    @Email
    private String email;
    @NotNull(message = "{campo.cpf.obrigatorio}")
    @NotBlank(message = "{campo.cpf.obrigatorio}")
    private String cpf;
    @NotNull(message = "{campo.nome.obrigatorio}")
    @NotBlank(message = "{campo.nome.obrigatorio}")
    private String nome;
    @NotNull(message = "{campo.contato.obrigatorioo}")
    @NotBlank(message = "{campo.contato.obrigatorio}")
    private String contato;
    @Valid
    @JsonProperty("morador")
    private MoradorDTO morador;
    @Valid
    @JsonProperty("login")
    private LoginDTO login;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDateTime dataCadastro;
}
