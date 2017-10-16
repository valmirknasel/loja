/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unoparads.loja.controller;

import com.unoparads.loja.repository.Calcados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author StallkerTwo
 */
@Controller
public class CalcadosController {
    
    @Autowired
    private Calcados calcados;
    
    @GetMapping("/calcados")
    public ModelAndView listar() {
        ModelAndView modelAndView = new ModelAndView("ListaCalcados");
        modelAndView.addObject("calcados", calcados.findAll());
        return modelAndView;
    }
    
}
