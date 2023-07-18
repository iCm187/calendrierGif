package fr.hb.ibm.calendrierGif.business;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Utilisateur {

	private static final int NB_POINT_INITIAL = 500;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nom;

	@Column(nullable = false, length = 50)
	private String prenom;

	@Column(nullable = false, length = 255, unique = true)
	@Email(message = "veuillez saisir un format d'email existant")
	@Pattern(regexp = "^([A-Za-z0-9-])+(.[A-Za-z0-9-]+)*@hb.com$", message = "mauvais nom de domaine")
	private String email;

	@Column(nullable = false, length = 128)
	@Size(min = 8, message = "le mot de passe doit faire au moins 8 caractères")
	private String motDePasse;

	private int nbPoints;

	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime dateInscription;

	@NotNull(message = "veuillez sélectionner un thème pour votre compte")
	@ManyToOne
	private Theme theme;

	@OneToMany(mappedBy = "utilisateur")
	private List<Reaction> reactions;

	@OneToMany(mappedBy = "utilisateur")
	private List<Gif> gifs;

	public Utilisateur() {
		super();
		this.nbPoints = NB_POINT_INITIAL;
		dateInscription = LocalDateTime.now();
	}

	public Utilisateur(String prenom, String email, String motDePasse, Theme theme) {
		this();
		this.prenom = prenom;
		this.email = email;
		this.motDePasse = motDePasse;
		this.theme = theme;
	}

	public Utilisateur(String prenom, String email, String motDePasse, Theme theme, String nom) {
		this(prenom, email, motDePasse, theme);
		this.nom = nom;
	}

}
