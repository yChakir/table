package ma.tiwtiw.table.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ColumnTag {

  /**
   * Tag text
   */
  private String text;

  /**
   * Tag color value
   */
  private String color;
}
