package ma.tiwtiw.table.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ColumnButton {

  /**
   * Text of button, coexist with icon
   */
  private String text;

  /**
   * Icon of button, coexist with text
   */
  private Icon icon;

  /**
   * I18n key of button
   */
  private String i18n;

  /**
   * Type of button
   */
  private ColumnButtonTypeEnum type;

  /**
   * Whether to pop confirm
   */
  private ColumnButtonPop pop;

  /**
   * Config of type is modal or static
   */
  private ColumnButtonModal modal;

  /**
   * Config of type is drawer
   */
  private ColumnButtonDrawer drawer;

  /**
   * Drop-down menu, only supports level 1
   */
  private List<ColumnButton> children;

  /**
   * ACL permission
   */
  private ACLType acl;

  /**
   * Button popup tip
   */
  private String tooltip;
}
