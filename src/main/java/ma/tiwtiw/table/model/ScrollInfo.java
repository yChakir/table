package ma.tiwtiw.table.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ScrollInfo {

  /**
   * x position
   */
  private Long x;

  /**
   * y position
   */
  private Long y;
}
