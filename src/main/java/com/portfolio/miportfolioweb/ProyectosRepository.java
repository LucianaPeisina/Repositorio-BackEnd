package com.portfolio.miportfolioweb;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepository extends JpaRepository<Proyectos, Long> {
    List<Proyectos> findByPersonaId(Long idPersona);
}
