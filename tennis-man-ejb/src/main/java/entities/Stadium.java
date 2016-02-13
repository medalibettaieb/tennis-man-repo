package entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Stadium
 *
 */
@Entity
@Table(name = "T_STADIUM")
public class Stadium implements Serializable {

	@Id
	private Integer id;
	private String name;
	private static final long serialVersionUID = 1L;

	@OneToMany(mappedBy = "stadium")
	private List<Match> matchs;

	public Stadium() {
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

	public List<Match> getMatchs() {
		return matchs;
	}

	public void setMatchs(List<Match> matchs) {
		this.matchs = matchs;
	}

}
