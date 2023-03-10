package com.proyectojaa.jaa.Security.Service;


import com.proyectojaa.jaa.Security.Entity.Usuario;
import com.proyectojaa.jaa.Security.Entity.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;



/**
 *
 * @author Jorge
 */
@Service
public class UserDetailsImpl implements UserDetailsService {

    @Autowired       
    UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        Usuario usuario = (Usuario) usuarioService.getByNombreUsuario(nombreUsuario).get();
        return UsuarioPrincipal.build(usuario);
    }

}
