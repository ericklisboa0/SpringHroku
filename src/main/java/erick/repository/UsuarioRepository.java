package erick.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import erick.model.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
