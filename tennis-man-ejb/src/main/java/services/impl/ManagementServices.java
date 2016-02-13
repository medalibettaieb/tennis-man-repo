package services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.Match;
import entities.Player;
import entities.Skill;
import entities.Stadium;
import services.interfaces.ManagementServicesLocal;
import services.interfaces.ManagementServicesRemote;

/**
 * Session Bean implementation class ManagementServices
 */
@Stateless
public class ManagementServices implements ManagementServicesRemote, ManagementServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public ManagementServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Skill> findSkillsByMatch(Match match) {
		String jpql = "select s from Skill s ,join s.players ps ";
		Query query = entityManager.createQuery(jpql, Skill.class);
		query.setParameter("", match);
		return query.getResultList();
	}

	@Override
	public List<Stadium> findStadiumsByPlayer(Player player) {
		String jpql = "select s from Stadium s join s.martchs sm where sm.localPlayer=:param1 or sm.awayPlayer=:pram1";
		Query query = entityManager.createQuery(jpql, Stadium.class);
		query.setParameter("param1", player);
		return query.getResultList();
	}

}
