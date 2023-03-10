package com.proyectojaa.jaa.Security.Service;



import com.proyectojaa.jaa.Security.Entity.Rol;
import com.proyectojaa.jaa.Security.Enums.RolNombre;
import com.proyectojaa.jaa.Security.Repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jorge
 */
@Service
@Transactional
public class RolService {

    @Autowired
    iRolRepository  iRolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        
        return iRolRepository.findByRolNombre(rolNombre);
    }
    public void save(Rol rol) {
        iRolRepository.save(rol);
    }
}
