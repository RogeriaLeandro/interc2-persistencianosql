package br.mil.md.sc1.interc2persistencianosql.service;

import br.mil.md.sc1.interc2persistencianosql.model.Plan;
import br.mil.md.sc1.interc2persistencianosql.repository.PlanRepository;
import br.mil.md.sc1.interc2persistencianosql.util.UtilPlan;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanService {

    @Autowired
    private PlanRepository planRepository;

    private UtilPlan util;

    private static final Logger logger = LoggerFactory.getLogger(PlanService.class);

    public List<Plan> getAllPlan() throws JsonProcessingException {
//        List<Plan> listPlan = planRepository.findAll();
//        for (Plan plan : planRepository) {
//            Plan planDeserializado = util.deserializaRootPlantoPlan(rootPlan);
//            listPlan.add(planDeserializado);
//        }
//        logger.info(listPlan.size() + "objetos");
        return planRepository.findAll();
    }

    public String saveRootPlan(List<Plan> plan) {
        planRepository.saveAll(plan);
        return "Operação Salva";
    }
}
