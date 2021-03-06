package br.com.aceleradora.comercomsaber.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "categoria")
public class Categoria {

    @Id
    @SequenceGenerator(initialValue = 1, allocationSize = 1, name = "geradorId", sequenceName = "categoria_codigo_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "geradorId")

    private int codigo;
    private String nome;

    @OneToMany(mappedBy = "categoria")
    private List<Alimento> alimentos;

    public Categoria(){}

    public Categoria(int codigo){
        this.codigo = codigo;
    }

    public Categoria(int codigo, String nome) {

        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Alimento> getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(List<Alimento> alimentos) {
        this.alimentos = alimentos;
    }
}