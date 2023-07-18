package fr.hb.ibm.calendrierGif.dao;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.hb.ibm.calendrierGif.business.Jour;

public interface JourDao extends JpaRepository<Jour, LocalDate> {

}
