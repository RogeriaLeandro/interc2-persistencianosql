package br.mil.md.sc1.interc2persistencianosql.util;

import br.mil.md.sc1.interc2persistencianosql.model.Plan;
import br.mil.md.sc1.interc2persistencianosql.model.RootPlan;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class UtilPlan {

    public String transformaObjetoRootPlanEmJson(RootPlan rootPlan) {

        Gson gson = new Gson();
        String jsonPlan = gson.toJson(rootPlan);
        return jsonPlan;
    }

    public Plan deserializaRootPlantoPlan(RootPlan rootPlan) throws JsonProcessingException {
        System.out.println("entrou em deserializa");
        String jsonRootPlan = this.transformaObjetoRootPlanEmJson(rootPlan);
        System.out.println(jsonRootPlan);
        final ObjectMapper objectMapper = new ObjectMapper();
        final Plan plan = objectMapper.readValue(jsonRootPlan, Plan.class);

        return plan;
    }


}
