package fr.hb.ibm.calendrierGif.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.hb.ibm.calendrierGif.business.Gif;

public interface GifDao extends JpaRepository<Gif, Long> {

}
