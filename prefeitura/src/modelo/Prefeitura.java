/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Prefeitura {
    private Integer codigo;
    private String nome;
    private String endereco;
    private Integer n_funcionario;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getN_funcionario() {
        return n_funcionario;
    }

    public void setN_funcionario(Integer n_funcionario) {
        this.n_funcionario = n_funcionario;
    }

    @Override
    public String toString() {
        return "Prefeitura{" + "nome=" + nome + '}';
    }
}
