package br.com.impacta.meucondominio.domain.service.impl;

import br.com.impacta.meucondominio.domain.model.Pessoa;
import br.com.impacta.meucondominio.domain.port.in.LoginService;
import br.com.impacta.meucondominio.domain.port.out.CadastroRepository;
import br.com.impacta.meucondominio.domain.port.in.CadastroService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CadastroServiceImpl implements CadastroService {

    private final CadastroRepository cadastroRepository;
    private final LoginService LoginService;

    @Override
    public Pessoa consultarPessoa(String email) {
        return cadastroRepository.find(email);
    }

    @Override
    public void cadastrarMorador(Pessoa pessoa) {

        cadastroRepository.save(pessoa);
        LoginService.salvarLogin(pessoa.getLogin());
    }
}
