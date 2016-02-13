package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Match
 *
 */
@Entity
@Table(name="T_MATCH")
public class Match implements Serializable {

	@Id
	private Integer id;
	private String name;
	private Date dateOfTheMatch;
	private Integer scoreLocal;
	private Integer scoreAway;
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private User refree;
	@ManyToOne
	private User localPlayer;
	@ManyToOne
	private User awayPlayer;
	@ManyToOne
	private Stadium stadium;

	public Match() {
		super();
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfTheMatch() {
		return this.dateOfTheMatch;
	}

	public void setDateOfTheMatch(Date dateOfTheMatch) {
		this.dateOfTheMatch = dateOfTheMatch;
	}

	public Integer getScoreLocal() {
		return this.scoreLocal;
	}

	public void setScoreLocal(Integer scoreLocal) {
		this.scoreLocal = scoreLocal;
	}

	public Integer getScoreAway() {
		return this.scoreAway;
	}

	public void setScoreAway(Integer scoreAway) {
		this.scoreAway = scoreAway;
	}

	public User getRefree() {
		return refree;
	}

	public void setRefree(User refree) {
		this.refree = refree;
	}

	public User getLocalPlayer() {
		return localPlayer;
	}

	public void setLocalPlayer(User localPlayer) {
		this.localPlayer = localPlayer;
	}

	public User getAwayPlayer() {
		return awayPlayer;
	}

	public void setAwayPlayer(User awayPlayer) {
		this.awayPlayer = awayPlayer;
	}

}
