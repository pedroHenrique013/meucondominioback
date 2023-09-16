package br.com.impacta.meucondominio.domain.enums;

public enum SetorEnum {

    ADMINISTRACAO("Administração"),
    LIMPEZA("Limpeza"),
    MANUTENCAO("Manutenção");

    private String descricao;

    SetorEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
