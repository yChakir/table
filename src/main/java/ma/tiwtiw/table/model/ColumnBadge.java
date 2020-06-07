package ma.tiwtiw.table.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ColumnBadge {

  /**
   * Badge text
   */
  private String text;

  /**
   * Badge color value
   */
  private ColumnBadgeColorEnum color;
}
