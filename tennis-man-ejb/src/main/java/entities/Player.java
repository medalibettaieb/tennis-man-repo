package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

/**
 * Entity implementation class for Entity: Player
 *
 */
@Entity

public class Player extends User implements Serializable {

	private Integer number;
	private static final long serialVersionUID = 1L;

	@ManyToMany
	private List<Skill> skills;

	public Player() {
		super();
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Player(Integer number,String name, Date birthDay) {
		super();
		this.number = number;
		setName(name);
		setBirthDay(birthDay);
	}

}
