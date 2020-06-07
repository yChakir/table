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
public class MultiSort {

  /**
   * Request parameter name
   */
  @Default
  private String key = "sort";

  /**
   * Separator between attributes
   */
  @Default
  private String separator = "-";

  /**
   * Column name and state separator
   */
  @Default
  private String nameSeparator = ".";

  /**
   * Whether to keep send empty key
   * <ul>
   * <li><b>true</b> send the key name anyway</li>
   * <li><b>false</b> don't send key when not sorting</li>
   * </ul>
   */
  @Default
  private Boolean keepEmptyKey = Boolean.TRUE;

  /**
   * Only global config, Whether global multi sort mode
   * <ul>
   * <li><b>true</b> all st defaults multi-sort</li>
   * <li><b>false</b> all st non-multiple sorting, just only configurable for rule</li>
   * </ul>
   */
  @Default
  private Boolean global = Boolean.TRUE;


}
