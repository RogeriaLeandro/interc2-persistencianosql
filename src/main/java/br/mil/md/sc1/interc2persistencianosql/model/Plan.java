package br.mil.md.sc1.interc2persistencianosql.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Plan {

  private Metadata metadata;

  private Extension extension;

  private String uri;

  private String source;

  private String otherAttributes;

  private String nameTxt;

  private String planningIndCode;

  private String progressCode;

  private String plndStartDttm;

  private String plndEndDttm;

}
