package br.mil.md.sc1.interc2persistencianosql.resource;

import br.mil.md.sc1.interc2persistencianosql.model.Plan;
import br.mil.md.sc1.interc2persistencianosql.service.PlanService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rootplan")
public class PlanResource {

    private static final Logger logger = LoggerFactory.getLogger(PlanResource.class);

    @Autowired
    private PlanService planService;

    @GetMapping("/plans")
    public ResponseEntity<List<Plan>> buscaAllPlan() {
        try {
            List<Plan> planList = planService.getAllPlan();
            logger.info("[INTERC2-PERSISTENCIANOSQL] : Retorno Lista de Operações OK!");
            return ResponseEntity.status(HttpStatus.OK).body(planList);
        } catch (Exception e) {
            logger.error("[INTERC2-PERSISTENCIANOSQL] : Não foi possível retornar Lista de Operações - ERROR: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

//    @GetMapping("/rootplans")
//    public ResponseEntity<List<RootPlan>> buscaAlRootPlan() {
//        try {
//            List<RootPlan> planList = planService.getAllRootPlan();
//            logger.info("[INTERC2-PERSISTENCIANOSQL] : Retorno Lista de Operações OK!");
//            return ResponseEntity.status(HttpStatus.OK).body(planList);
//        } catch (Exception e) {
//            logger.error("[INTERC2-PERSISTENCIANOSQL] : Não foi possível retornar Lista de Operações - ERROR: " + e.getMessage());
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//        }
//    }

    @PostMapping("/rootplan")
    public ResponseEntity<String> salvaPlan(@RequestBody String jsonPlan) {
//        try {
            //TODO transformar json em Plan para cada um da lista
//            planService.saveRootPlan(jsonPlan);
//            logger.info("[INTERC2-PERSISTENCIANOSQL] : Retorno Lista de Operações OK!");
//            return ResponseEntity.status(HttpStatus.OK).body(planList);
//        } catch (Exception e) {
//            logger.error("[INTERC2-PERSISTENCIANOSQL] : Não foi possível retornar Lista de Operações - ERROR: " + e.getMessage());
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
//        }
            return null;
    }

}
