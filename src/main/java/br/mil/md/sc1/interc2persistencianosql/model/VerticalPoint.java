package br.mil.md.sc1.interc2persistencianosql.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class VerticalPoint {

    private String latCoord;

    private String longCoord;
}
