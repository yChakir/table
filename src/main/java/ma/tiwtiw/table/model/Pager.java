package ma.tiwtiw.table.model;

import java.util.Arrays;
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
public class Pager {

  /**
   * Front paging when data is any[] or Observable<any[]>
   */
  @Default
  private Boolean front = Boolean.FALSE;

  /**
   * Whether the backend paging uses the 0 base index (only data is url)
   */
  @Default
  private Boolean zeroIndexed = Boolean.TRUE;

  /**
   * Specify the position of Pagination
   */
  @Default
  private PaginationPositionEnum position = PaginationPositionEnum.BOTTOM;

  /**
   * Specify the direction of Pagination
   */
  @Default
  private PaginationPlacementEnum placement = PaginationPlacementEnum.RIGHT;

  /**
   * Whether to show pager
   */
  @Default
  private Boolean show = Boolean.TRUE;

  /**
   * Determine whether ps can be changed
   */
  @Default
  private Boolean showSize = Boolean.TRUE;

  /**
   * Specify the sizeChanger options
   */
  @Default
  private List<Long> pageSizes = Arrays.asList(10L, 20L, 30L, 40L, 50L);

  /**
   * Determine whether you can jump to pages directly
   */
  @Default
  private Boolean showQuickJumper = Boolean.TRUE;

  /**
   * To display the total number and range, support custom string template (Three variable names:
   * total for total data, range[0] and range[1] for current data range; Variable name must be
   * double curly braces wrapper)
   */
  private String total;

  /**
   * To top when pager changed
   */
  @Default
  private Boolean toTop = Boolean.TRUE;

  /**
   * To top offset value
   */
  @Default
  private Long toTopOffset = 100L;
}
