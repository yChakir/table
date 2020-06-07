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
public class ColumnButtonModal {

  /**
   * Modal component class
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
   * Size of modal, support number type
   */
  @Default
  private ColumnButtonModalSizeEnum size = ColumnButtonModalSizeEnum.LG;

  /**
   * Exact match return value, default is true, If the return value is not null (null or undefined)
   * is considered successful, otherwise it is considered error.
   */
  @Default
  private Boolean exact = Boolean.TRUE;

  /**
   * Whether to wrap the nz-tabset, fix content spacing problem
   */
  private Boolean includeTabs;

  /**
   * nz-modal raw parameters ModalOptions
   */
  private Object modalOptions;
}
