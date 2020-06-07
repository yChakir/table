package ma.tiwtiw.table.model;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ColumnFilterMenu {

  /**
   * Filter text
   */
  private String text;

  /**
   * Filter value
   */
  private Map<String, String> value;

  /**
   * Whether checked
   */
  @Default
  private Boolean checked = Boolean.FALSE;

  /**
   * ACL permission
   */
  private ACLType acl;
}
