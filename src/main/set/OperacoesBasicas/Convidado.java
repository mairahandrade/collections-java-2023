package main.set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    //atributos

    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite){
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }
// chamo o getter para caso quiser saber o cód do convite e o nome de acordo com o cód do convite.
    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }
// criou um comparacao de acordo com o cód do convite
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoConvite());
    }

// chamo o toString para quando eu imprimir não mostrar o cód
    // referenciando o caminho que está o objeto na memória. E sim o nome e cód.

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }
}
