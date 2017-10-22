/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unoparads.loja.controller;

import com.unoparads.loja.model.Calcado;
import com.unoparads.loja.repository.Calcados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author StallkerTwo
 */
@Controller
@RequestMapping(value= "/calcados")
public class CalcadosController {
    
    @Autowired
    private Calcados calcados;
    
    @GetMapping
    public ModelAndView listar() {
        ModelAndView mv = new ModelAndView("ListaCalcados");
        mv.addObject("calcados", calcados.findAll());
        mv.addObject(new Calcado());
        return mv;
    }
    
    @PostMapping
    public String salvar (Calcado calcado) {
        this.calcados.save(calcado);
        return "redirect:/calcados";
        
    }
    
}
