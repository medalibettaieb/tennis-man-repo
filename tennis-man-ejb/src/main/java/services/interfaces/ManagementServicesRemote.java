package services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import entities.Match;
import entities.Player;
import entities.Skill;
import entities.Stadium;

@Remote
public interface ManagementServicesRemote {
	List<Skill> findSkillsByMatch(Match match);

	List<Stadium> findStadiumsByPlayer(Player player);

}
