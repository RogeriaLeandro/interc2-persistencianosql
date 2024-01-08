package br.mil.md.sc1.interc2persistencianosql.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Metadata {

    private Classification classification;

    private String reportingDatatime;

    private String effectiveDatetimeStart;

    private String getEffectiveDatetimeEnd;

}
