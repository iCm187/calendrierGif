package fr.hb.ibm.calendrierGif.business;

import org.hibernate.validator.constraints.URL;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Entity
@Data
//callsuper signifie, que les droit sont limités par ceux gérés par la classe parent
@EqualsAndHashCode(callSuper = true)
public class GifDistant extends Gif {

	@NotNull(message = "Merci de saisir une URL")
	@NotBlank(message = "Merci de saisir une URL")
	@URL(message = "Merci de saisir une URL valide, elle doit se terminer par .gif, .Gif ou .GIF", regexp = "^https?://(?:[a-z0-9\\-]+\\.)+[a-z]{2,6}(?:/[^/#?]+)+\\.(?:Gif|gif|GIF)$")
	private String url;
}
