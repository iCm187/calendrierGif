package fr.hb.ibm.calendrierGif.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.hb.ibm.calendrierGif.business.Emotion;

public interface EmotionDao extends JpaRepository<Emotion, Long> {

}
