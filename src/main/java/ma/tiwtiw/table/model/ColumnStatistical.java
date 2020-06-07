package ma.tiwtiw.table.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ColumnStatistical {

  /**
   * Statistic type of current column
   */
  private ColumnStatisticalTypeEnum type;

  /**
   * The number of digits to appear after the decimal point
   */
  private Long digits;

  /**
   * Whether formatting currency
   */
  private Boolean currency;
}
