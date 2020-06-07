package ma.tiwtiw.table.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ColumnYn {

  /**
   * Truth condition value
   */
  private Object truth;

  /**
   * Badge true text
   */
  private String yes;

  /**
   * Badge false text
   */
  private String no;

  /**
   * Display mode for yn
   */
  private ColumnYnModeEnum mode = ColumnYnModeEnum.ICON;

}
