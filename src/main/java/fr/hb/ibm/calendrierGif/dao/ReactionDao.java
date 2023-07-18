package fr.hb.ibm.calendrierGif.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.hb.ibm.calendrierGif.business.Reaction;

public interface ReactionDao extends JpaRepository<Reaction, Long> {

}
