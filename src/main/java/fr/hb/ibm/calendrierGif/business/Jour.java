package fr.hb.ibm.calendrierGif.business;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Jour {

	@Id
	@Temporal(TemporalType.DATE)
	private LocalDate date;

	private int nbPoints;

	@OneToOne
	protected Gif gif;

	public Jour(int nbPoints) {
		this();
		this.nbPoints = nbPoints;
	}

}
