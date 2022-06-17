package br.com.sammoraes.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.sammoraes.entities.Atendimento;

public interface IAtendimentoRepository extends CrudRepository<Atendimento, Integer> {

	@Query("select a from Atendimento a order by a.dataHora desc")
	List<Atendimento> findAll();
}



