package com.Tienda.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.Tienda.domain.Cliente;
import com.Tienda.service.ArticuloService;
import com.Tienda.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class IndexController {

    @Autowired
    private ArticuloService articuloService;

    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora utilizamos MVC");
        
        var articulos = articuloService.getArticulos(true);
        model.addAttribute("clientes", articulos);

        return "index";

    }
    
}
