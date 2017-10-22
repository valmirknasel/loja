/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unoparads.loja.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author StallkerTwo
 */
@Entity
@Table(name = "calcado")
public class Calcado implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="calcado_id_seq")
    @SequenceGenerator(name="calcado_id_seq", sequenceName="calcado_id_seq", allocationSize=1)
    private Long id;
    
    private String nomeDoCalcado;
    private String colecao;
    private Integer menorTamanho;
    private Integer maiorTamanho;
    private String corDoCalcado;
    private Double precoDeCusto;
    

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the nomeDoCalcado
     */
    public String getNomeDoCalcado() {
        return nomeDoCalcado;
    }

    /**
     * @param nomeDoCalcado the nomeDoCalcado to set
     */
    public void setNomeDoCalcado(String nomeDoCalcado) {
        this.nomeDoCalcado = nomeDoCalcado;
    }

    /**
     * @return the colecao
     */
    public String getColecao() {
        return colecao;
    }

    /**
     * @param colecao the colecao to set
     */
    public void setColecao(String colecao) {
        this.colecao = colecao;
    }

    /**
     * @return the menorTamanho
     */
    public Integer getMenorTamanho() {
        return menorTamanho;
    }

    /**
     * @param menorTamanho the menorTamanho to set
     */
    public void setMenorTamanho(Integer menorTamanho) {
        this.menorTamanho = menorTamanho;
    }

    /**
     * @return the maiorTamanho
     */
    public Integer getMaiorTamanho() {
        return maiorTamanho;
    }

    /**
     * @param maiorTamanho the maiorTamanho to set
     */
    public void setMaiorTamanho(Integer maiorTamanho) {
        this.maiorTamanho = maiorTamanho;
    }

    /**
     * @return the corDoCalcado
     */
    public String getCorDoCalcado() {
        return corDoCalcado;
    }

    /**
     * @param corDoCalcado the corDoCalcado to set
     */
    public void setCorDoCalcado(String corDoCalcado) {
        this.corDoCalcado = corDoCalcado;
    }

    /**
     * @return the precoDeCusto
     */
    public Double getPrecoDeCusto() {
        return precoDeCusto;
    }

    /**
     * @param precoDeCusto the precoDeCusto to set
     */
    public void setPrecoDeCusto(Double precoDeCusto) {
        this.precoDeCusto = precoDeCusto;
    }
    
    
    
}
