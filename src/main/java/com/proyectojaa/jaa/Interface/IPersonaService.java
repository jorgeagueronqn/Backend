package com.proyectojaa.jaa.Interface;


import com.proyectojaa.jaa.Entity.Persona;
import java.util.List;

/**
 *
 * @author Jorge
 */
public interface IPersonaService {

    public List<Persona> getPersona();

    public void SavePersona(Persona persona);

    public void deletePersona(Long id);

    public Persona findPersona(Long id);

}
