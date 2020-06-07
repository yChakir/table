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
public class Column {

  /**
   *
   */
  private String key;

  /**
   * Title of this column
   */
  private ColumnTitle title;

  /**
   * Display field of the data record, could be set like a.b.c
   */
  private List<String> index;

  /**
   * <ul>
   * <li><b>no</b> Rows number</li>
   * <li><b>checkbox</b> selection</li>
   * <li><b>radio</b> selection</li>
   * <li><b>link</b> Link that triggers click</li>
   * <li><b>img</b> Align to the center</li>
   * <li><b>number</b> Align to the right</li>
   * <li><b>currency</b> Align to the right</li>
   * <li><b>date</b> Align to the center</li>
   * <li><b>badge</b> Nz-Badge</li>
   * <li><b>tag</b> Nz-Tag</li>
   * <li><b>yn</b> Make boolean as badge</li>
   * <li><b>widget</b> Custom widgets to render columns	</li>
   * </ul>
   */
  private ColumnTypeEnum type;

  /**
   * Custom render template ID
   */
  private String render;

  /**
   * Title custom render template ID
   */
  private String renderTitle;

  /**
   * Replace with default value when no data exists (value typeof is undefined)
   */
  // todo
  private String _default;

  /**
   * Buttons of this column
   */
  private List<ColumnButton> buttons;

  /**
   * Width of this column (NOTICE: If the fixed column must be a number), e.g: 100, 10%, 100px
   */
  private String width;

  /**
   * Set column to be fixed, must specify width
   */
  private ColumnFixedEnum fixed;

  /**
   * Class name of this column, e.g: text-center, text-right, text-danger, pls refer to Style Tools
   */
  private String className;

  /**
   * Span of this column's title
   */
  private Long colSpan;

  /**
   * Sort config of this column
   */
  private ColumnSort sort;

  /**
   * Filter config of this column
   */
  private ColumnFilter filter;

  /**
   * Config of type is checkbox
   */
  private List<ColumnSelection> selections;

  /**
   * Config of type is number
   */
  private String numberDigits;

  /**
   * Config of type is date
   */
  private String dateFormat;

  /**
   * Config of type is yn
   */
  private ColumnYn yn;

  /**
   * Whether to allow export
   */
  @Default
  private Boolean exported = Boolean.TRUE;

  /**
   * ACL permission
   */
  private ACLType acl;

  /**
   * Config of type is badge
   */
  private ColumnBadge badge;

  /**
   * Config of type is tag
   */
  private ColumnTag tag;

  /**
   * Config of type is widget
   */
  private ColumnWidget widget;

  /**
   * Statistics
   */
  private ColumnStatistical statistical;

  /**
   * Group columns
   */
  private List<Column> children;
}
