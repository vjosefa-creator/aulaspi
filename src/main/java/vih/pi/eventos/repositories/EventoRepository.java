package vih.pi.eventos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import vih.pi.eventos.models.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {

}
