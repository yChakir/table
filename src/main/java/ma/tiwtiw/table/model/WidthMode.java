package ma.tiwtiw.table.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WidthMode {

  /**
   * Type of width mode
   */
  private WidthModeTypeEnum type = WidthModeTypeEnum.DEFAULT;

  /**
   * Behavior type of strict
   */
  private WidthModeStrictBehaviorEnum strictBehavior = WidthModeStrictBehaviorEnum.TRUNCATE;
}
