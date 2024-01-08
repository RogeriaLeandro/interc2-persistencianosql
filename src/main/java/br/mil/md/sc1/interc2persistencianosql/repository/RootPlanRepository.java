package br.mil.md.sc1.interc2persistencianosql.repository;

import br.mil.md.sc1.interc2persistencianosql.model.RootPlan;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RootPlanRepository extends MongoRepository<RootPlan, String> {

}
