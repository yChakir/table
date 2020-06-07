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
public class ColumnButtonPop {


  /**
   * Title of the popover`
   */
  private String title;

  /**
   * Popover trigger mode, default: `click`
   */
  @Default
  private ColumnButtonTriggerEnum trigger = ColumnButtonTriggerEnum.CLICK;

  /**
   * The position of the popover relative to the target, default: `top`
   */
  @Default
  private ColumnButtonPopPlacementEnum placement = ColumnButtonPopPlacementEnum.TOP;

  /**
   * Class name of the popover card
   */
  private String overlayClassName;

  /**
   * Style of the popover card
   */
  private Object overlayStyle;

  /**
   * Text of the Cancel button
   */
  private String cancelText;

  /**
   * Text of the Confirm button
   */
  private String okText;

  /**
   * Button `type` of the Confirm button
   */
  private ColumnButtonPopOkTypeEnum okType;

  /**
   * Customize icon of confirmation
   */
  private String icon;

}
