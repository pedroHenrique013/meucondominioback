package br.com.impacta.meucondominio.application.in.controller;

import br.com.impacta.meucondominio.application.dto.request.CadastrarMoradorRequestDTO;
import br.com.impacta.meucondominio.application.dto.response.CadastrarMoradorResponseDTO;
import br.com.impacta.meucondominio.application.dto.response.ConsultarMoradorResponseDTO;
import br.com.impacta.meucondominio.application.facade.CadastroFacade;
import br.com.impacta.meucondominio.application.mapper.ApplicationMoradorMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cadastro")
@RequiredArgsConstructor
public class CadastroController {

    private final CadastroFacade cadastroFacade;

    @GetMapping("/{email}")
    public ResponseEntity<ConsultarMoradorResponseDTO> consultarMorador(@PathVariable String email){
        return ResponseEntity.ok(cadastroFacade.consultarMorador(email));
    }

    @PostMapping
    public ResponseEntity<CadastrarMoradorResponseDTO> cadastrarMorador(@Valid @RequestBody CadastrarMoradorRequestDTO cadastrarMoradorRequestDTO){
        return ResponseEntity.ok(cadastroFacade.cadastrarMorador(cadastrarMoradorRequestDTO));
    }
}
