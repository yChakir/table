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
public class ColumnButtonDrawer {

  /**
   * Title of drawer
   */
  private String title;

  /**
   * Drawer component class
   */
  private Object component;

  /**
   * Dialog parameter
   */
  private Object params;

  /**
   * Receive parameter name of the target component, If target component receive value is null, pls
   * check global-config.module.ts Global settings
   */
  @Default
  private String paramsName = "record";

  /**
   * Size of drawer, support number type
   */
  @Default
  private ColumnButtonDrawerSizeEnum size = ColumnButtonDrawerSizeEnum.MD;

  /**
   * nz-drawer raw parameters NzDrawerOptions
   */
  private Object options;
}
