package br.mil.md.sc1.interc2persistencianosql.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class SurfaceVessel {

    private Metadata metadata;

    private String uri;

    private String source;

    private String operatStatCode;

    private String nameTxt;

    private String hostility;

    private VerticalPoint verticalPoint;

}
