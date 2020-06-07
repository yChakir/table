package ma.tiwtiw.table.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ColumnYnDto {

  private Object truth;

  private String yes;

  private String no;

  private String mode;

}
