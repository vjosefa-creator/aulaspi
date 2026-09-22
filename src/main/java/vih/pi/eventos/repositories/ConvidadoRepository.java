package vih.pi.eventos.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import vih.pi.eventos.models.Convidado;
import vih.pi.eventos.models.Evento;

public interface ConvidadoRepository extends JpaRepository<Convidado, Long> {

	List<Convidado> findByEvento(Evento evento);
	
}
