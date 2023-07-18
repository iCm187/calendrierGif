package fr.hb.ibm.calendrierGif.business;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_gif")
@Getter
@Setter
@ToString
public abstract class Gif {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;

	@Temporal(TemporalType.TIMESTAMP)
	protected LocalDateTime dateHeureAjout;

	protected String legende;

	@OneToMany(mappedBy = "gif")
	protected List<Reaction> reactions;

	@ManyToOne
	protected Utilisateur utilisateur;

	@OneToOne
	protected Jour jour;

	public Gif() {
		super();
		this.dateHeureAjout = LocalDateTime.now();
	}

	public Gif(String legende) {
		this();
		this.legende = legende;
	}
}
