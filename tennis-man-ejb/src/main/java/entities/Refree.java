package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Refree
 *
 */
@Entity

public class Refree extends User implements Serializable {

	private String level;
	private static final long serialVersionUID = 1L;

	public Refree() {
		super();
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Refree(String level, String name, Date birthDay) {
		super();
		this.level = level;
		setBirthDay(birthDay);
		setName(name);
	}

}
