package entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Skill
 *
 */
@Entity
@Table(name = "T_SKILL")
public class Skill implements Serializable {

	@Id
	private Integer id;
	private String name;
	private static final long serialVersionUID = 1L;

	@ManyToMany(mappedBy = "skills")
	private List<Player> players;

	public Skill() {
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

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

}
