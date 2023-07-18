package fr.hb.ibm.calendrierGif.business;


import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class GifTeleverse extends Gif {

	private String nomFichierOriginal;
}
