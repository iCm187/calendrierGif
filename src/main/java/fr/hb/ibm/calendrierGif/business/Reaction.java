package fr.hb.ibm.calendrierGif.business;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Reaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime dateHeure;

	@ManyToOne
	private Utilisateur utilisateur;

	@ManyToOne
	private Emotion emotion;

	@ManyToOne
	private Gif gif;

	public Reaction() {
		super();
		dateHeure = LocalDateTime.now();
	}

}
