package com.metaindustria.service;

import com.metaindustria.model.AlertaIndustrial;
import com.metaindustria.repository.AlertaIndustrialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlertaIndustrialService {

    @Autowired
    private AlertaIndustrialRepository repository;

    public AlertaIndustrial salvar (AlertaIndustrial alerta) {
        return repository.save(alerta);
    }

    public List<AlertaIndustrial> listarTodos() {
        return repository.findAll();
    }

    public Optional<AlertaIndustrial> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public AlertaIndustrial atualizar(Long id, AlertaIndustrial alertaIndustrial) {
        alertaIndustrial.setId(id);
        return repository.save(alertaIndustrial);
    }

    public void deletar (Long id){
        repository.deleteById(id);
    }
}