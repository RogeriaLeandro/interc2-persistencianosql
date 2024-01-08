package br.mil.md.sc1.interc2persistencianosql.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Document(collection = "rootplan")
public class RootPlan {

    private Plan plan;

}
