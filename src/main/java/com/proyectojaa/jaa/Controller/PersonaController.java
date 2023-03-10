package com.proyectojaa.jaa.Controller;


import com.proyectojaa.jaa.Entity.Persona;
import com.proyectojaa.jaa.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jorge
 */
@RestController
@CrossOrigin(origins="http://localhost:4200")
        
public class PersonaController {

    @Autowired
    IPersonaService ipersonaService;

    @GetMapping("/personas/traer")
    public List<Persona> getPersona() {

        return ipersonaService.getPersona();
    }
@PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona) {

        ipersonaService.SavePersona(persona);
        return "persona creada correctamente";
    }
@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable long id) {

        ipersonaService.deletePersona(id);
        return "persona eliminada correctamente";
    }
@PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable long id,
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("apellido") String nuevoApellido,
            @RequestParam("img") String nuevoImg) {

        Persona persona = (Persona) ipersonaService.findPersona(id);

        persona.setApellido(nuevoApellido);
        persona.setNombre(nuevoNombre);
        persona.setImg(nuevoImg);

        ipersonaService.SavePersona(persona);
        return persona;
    }

    @GetMapping("/personas/traer/perfil")
    public Persona findPersona() {

        return (Persona) ipersonaService.findPersona((long) 1);
    }

}
