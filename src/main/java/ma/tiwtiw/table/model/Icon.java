package ma.tiwtiw.table.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Icon {

  /**
   * Type of the ant design icon
   */
  private String type;

  /**
   * Type of the ant design icon
   */
  private IconThemeEnum theme;

  /**
   * Rotate icon with animation
   */
  @Default
  private Boolean spin = Boolean.FALSE;

  /**
   * Only support the two-tone icon. Specific the primary color.
   */
  private String twoToneColor;

  /**
   * Type of the icon from iconfont
   */
  private String iconFont;
}
