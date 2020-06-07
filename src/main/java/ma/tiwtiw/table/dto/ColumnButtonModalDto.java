package ma.tiwtiw.table.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ColumnButtonModalDto {

  private Object component;

  private Object params;

  private String paramsName;

  private String size;

  private Boolean exact;

  private Boolean includeTabs;

  private Object modalOptions;
}
