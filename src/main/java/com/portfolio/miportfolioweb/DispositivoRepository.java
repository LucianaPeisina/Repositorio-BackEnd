package com.portfolio.miportfolioweb;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DispositivoRepository extends JpaRepository<Dispositivo, Long> {
    List<Dispositivo> findByUsuarioId(Long id);
}
