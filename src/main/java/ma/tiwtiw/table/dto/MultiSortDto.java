package ma.tiwtiw.table.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MultiSortDto {

  private String key;

  private String separator;

  private String nameSeparator;

  private Boolean keepEmptyKey;

  private Boolean global;


}
