package com.portfolio.miportfolioweb;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
        List<Usuario> findAll();
    Optional<Usuario> findById(Long id);
    Optional<Usuario> findByEmail(String email);
       
}