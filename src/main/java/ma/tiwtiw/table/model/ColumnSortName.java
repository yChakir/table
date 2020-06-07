package ma.tiwtiw.table.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ColumnSortName {

  /**
   * Ascend name
   */
  private String ascend;

  /**
   * Descend name
   */
  private String descend;

}
