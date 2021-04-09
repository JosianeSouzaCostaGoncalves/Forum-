package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);

}
