package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Player;
import entities.Refree;

/**
 * Session Bean implementation class UtilitiesServices
 */
@Singleton
@LocalBean
@Startup
public class UtilitiesServices {

	@PersistenceContext
	private EntityManager entityManager;

	private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy/hh:mm");

	/**
	 * Default constructor.
	 */
	public UtilitiesServices() {
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public void initDb() {
		Player localPlayer = new Player(7, "nadal", new Date());
		Player AwayPlayer = new Player(1, "jaziri", new Date());

		Refree refree = new Refree("pro", "harrouch", new Date());

		entityManager.persist(refree);
		entityManager.persist(localPlayer);
		entityManager.persist(AwayPlayer);
	}

	public static String fromDateToString(Date date) {
		return dateFormat.format(date);

	}

	public static Date fromStringToDate(String date) throws ParseException {
		return dateFormat.parse(date);

	}

}
