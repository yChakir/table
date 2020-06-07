package ma.tiwtiw.table.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SingleSort {

  /**
   * Request parameter name
   */
  private String key = "sort";

  /**
   * Column name and state separator
   */
  private String nameSeparator = ".";
}
