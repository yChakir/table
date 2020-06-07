package ma.tiwtiw.table.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ColumnSort {

  /**
   * Unique key of this column
   */
  private String key;

  /**
   * Map name
   */
  private ColumnSortName reName;

}
