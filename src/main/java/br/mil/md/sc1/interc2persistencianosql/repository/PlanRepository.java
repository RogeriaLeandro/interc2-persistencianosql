package br.mil.md.sc1.interc2persistencianosql.repository;

import br.mil.md.sc1.interc2persistencianosql.model.Plan;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanRepository extends MongoRepository<Plan, String> {

}
