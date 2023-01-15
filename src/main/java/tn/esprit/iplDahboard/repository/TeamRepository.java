package tn.esprit.iplDahboard.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.iplDahboard.model.Team;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long>{

    Team findByTeamName(String teamName);
}
