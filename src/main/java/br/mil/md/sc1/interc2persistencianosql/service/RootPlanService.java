package br.mil.md.sc1.interc2persistencianosql.service;

import br.mil.md.sc1.interc2persistencianosql.model.Plan;
import br.mil.md.sc1.interc2persistencianosql.model.RootPlan;
import br.mil.md.sc1.interc2persistencianosql.repository.RootPlanRepository;
import br.mil.md.sc1.interc2persistencianosql.resource.RootPlanResource;
import br.mil.md.sc1.interc2persistencianosql.util.UtilPlan;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RootPlanService {

    @Autowired
    private RootPlanRepository rootPlanRepository;

    private UtilPlan util;

    private static final Logger logger = LoggerFactory.getLogger(RootPlanService.class);

    public List<Plan> getAllPlan() throws JsonProcessingException {
        List<RootPlan> listRootPlan = rootPlanRepository.findAll();
        logger.info(listRootPlan.size() + "objetos");
        List<Plan> listPlan = new ArrayList<>();
        for (RootPlan rootPlan : listRootPlan) {
            Plan planDeserializado = util.deserializaRootPlantoPlan(rootPlan);
            listPlan.add(planDeserializado);
        }
        logger.info(listPlan.size() + "objetos");
        return listPlan;
    }

    public List<RootPlan> getAllRootPlan() {
        List<RootPlan> listRootPlan = rootPlanRepository.findAll();
        logger.info(listRootPlan.size() + "objetos");
        return listRootPlan;
    }

    public String saveRootPlan(String jsonRootPlan) {
        rootPlanRepository.save(jsonRootPlan);

    }
}
