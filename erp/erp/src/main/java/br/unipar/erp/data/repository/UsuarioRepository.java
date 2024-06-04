package br.unipar.erp.data.repository;

import br.unipar.erp.data.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository
        extends JpaRepository <Usuario, Integer > {

    Usuario findByUsuarioAndSenha(String usuario, String senha);

}
