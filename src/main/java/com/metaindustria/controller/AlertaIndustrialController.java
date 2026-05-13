package com.metaindustria.controller;

import com.metaindustria.model.AlertaIndustrial;
import com.metaindustria.service.AlertaIndustrialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alertas")
public class AlertaIndustrialController {
    @Autowired
    private AlertaIndustrialService service;

    @PostMapping
    public AlertaIndustrial criar(@RequestBody AlertaIndustrial alerta) {
        return service.salvar(alerta);
    }

    @GetMapping
    public List<AlertaIndustrial> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<AlertaIndustrial> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public AlertaIndustrial atualizar(@PathVariable Long id,
                                      @RequestBody AlertaIndustrial alerta) {
        return service.atualizar(id, alerta);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }


}