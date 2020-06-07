package ma.tiwtiw.table.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ColumnFilter {

  /**
   * Type of the filter, keyword render by input
   */
  @Default
  private ColumnFilterTypeEnum type = ColumnFilterTypeEnum.DEFAULT;

  /**
   * Filter menu config
   */
  private List<ColumnFilterMenu> menus;

  /**
   * Whether the data is filtered
   */
  private Boolean _default;

  /**
   * Customized filter icon
   */
  private Icon icon;

  /**
   * Whether multiple filters can be selected
   */
  @Default
  private Boolean multiple = Boolean.TRUE;

  /**
   * Text of the confirm button
   */
  private String confirmText;

  /**
   * Text of the clear button
   */
  private String clearText;

  /**
   * Unique key of this column, default is index property value
   */
  private String key;
}
