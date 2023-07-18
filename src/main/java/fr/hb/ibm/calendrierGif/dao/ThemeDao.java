package fr.hb.ibm.calendrierGif.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.hb.ibm.calendrierGif.business.Theme;

public interface ThemeDao extends JpaRepository<Theme, Long> {

}
