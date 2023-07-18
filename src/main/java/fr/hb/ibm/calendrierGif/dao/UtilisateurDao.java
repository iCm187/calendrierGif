package fr.hb.ibm.calendrierGif.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.hb.ibm.calendrierGif.business.Utilisateur;

public interface UtilisateurDao extends JpaRepository<Utilisateur, Long> {

}
