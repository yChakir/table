package ma.tiwtiw.table.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestName {

  /**
   * Page index parameter name
   */
  private String pi;

  /**
   * Page parameter size name
   */
  private String ps;

  /**
   * Skip parameter name
   */
  private String skip;

  /**
   * Limit parameter name
   */
  private String limit;
}
