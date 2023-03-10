package com.proyectojaa.jaa.Repository;


import com.proyectojaa.jaa.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jorge
 */
@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {

}
