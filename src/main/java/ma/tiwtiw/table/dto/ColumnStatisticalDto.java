package ma.tiwtiw.table.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ColumnStatisticalDto {

  private String type;

  private Long digits;

  private Boolean currency;
}
