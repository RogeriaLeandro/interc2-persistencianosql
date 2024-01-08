package br.mil.md.sc1.interc2persistencianosql.repository;

import br.mil.md.sc1.interc2persistencianosql.model.SurfaceVessel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SurfaceVesselRepository extends MongoRepository<SurfaceVessel, String> {


}
