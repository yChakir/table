package ma.tiwtiw.table.model;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ma.tiwtiw.core.model.BaseModel;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Table extends BaseModel<String> {

  /**
   * Columns description
   */
  @Default
  private List<Column> columns = new ArrayList<>();

  /**
   * Data source
   */
  private String data;

  /**
   * Http request configuration
   */
  private Request request;

  /**
   * Http response configuration
   */
  private Response response;

  /**
   * Pagination index
   */
  @Default
  private Long pi = 1L;

  /**
   * Pagination size, 0 is no page, default is 10
   */
  @Default
  private Long ps = 10L;

  /**
   * Total data count, should set when nzServerRender is true, default is 0
   */
  @Default
  private Long total = 0L;

  /**
   * Pager configuration
   */
  private Pager pager;

  /**
   * Custom no result content
   */
  private String noContent;

  /**
   * Whether to show all table borders
   */
  @Default
  private Boolean bordered = Boolean.TRUE;

  /**
   * Size of table
   */
  @Default
  private SizeEnum size = SizeEnum.DEFAULT;

  /**
   * Set the table width mode
   */
  private WidthMode widthMode;

  /**
   * Loading status of table, when specifying null is controlled by st
   */
  private Boolean loading;

  /**
   * Specifies a delay in milliseconds for loading state (prevent flush)
   */
  @Default
  private Long loadingDelay = 0L;

  /**
   * Whether table can be scrolled in x/y direction, x or y can be a string that indicates the width
   * and height of table body
   */
  private ScrollInfo scroll;

  /**
   * Enable virtual scroll mode，work with [nzScroll]
   */
  @Default
  private Boolean virtualScroll = Boolean.FALSE;

  /**
   * The size of the items in the list, same as cdk itemSize
   */
  @Default
  private Long virtualItemSize = 54L;

  /**
   * The number of pixels worth of buffer to render for when rendering new items, same as cdk
   * maxBufferPx
   */
  @Default
  private Long virtualMaxBufferPx = 200L;

  /**
   * The minimum amount of buffer rendered beyond the viewport (in pixels),same as cdk minBufferPx
   */
  @Default
  private Long virtualMinBufferPx = 100L;

  /**
   * Single sort config If not specified, return: columnName=ascend|descend If specified, return:
   * sort=columnName.(ascend|descend)
   */
  private SingleSort singleSort;

  /**
   * Whether to mulit-sort, recommended use in URL data source
   */
  private MultiSort multiSort;

  /**
   * Click twice in the time range for double click, unit is millisecond
   */
  @Default
  private Long rowClickTime = 200L;

  /**
   * Table header renderer
   */
  private String header;

  /**
   * Table footer renderer
   */
  private String footer;

  /**
   * Set col width can not used with width of STColumn
   */
  @Default
  private List<String> widthConfig = new ArrayList<>();

  /**
   * Whether to expand row by clicking anywhere in the whole row
   */
  @Default
  private Boolean expandRowByClick = Boolean.FALSE;

  /**
   * Accordion mode
   */
  @Default
  private Boolean expandAccordion = Boolean.FALSE;

  /**
   * Whether to turn on responsive
   */
  @Default
  private Boolean responsive = Boolean.TRUE;

  /**
   * Whether to display the header and footer under the small screen
   */
  @Default
  private Boolean responsiveHideHeaderFooter = Boolean.FALSE;
}
