/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unoparads.loja.repository;

import com.unoparads.loja.model.Calcado;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author StallkerTwo
 */
public interface Calcados extends JpaRepository<Calcado, Long>{
    
    
}
