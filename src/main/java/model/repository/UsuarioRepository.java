package model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	public List findByCpf(String cpf);
	public List findByCpfNot(String cpf);

}

public List<Usuario> findAll() {
   return entityManager.createQuery("FROM " +
   Usuario.class.getName()).getResultList();
}
