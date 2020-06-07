package ma.tiwtiw.table.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ColumnSelection {

  /**
   * Selection text
   */
  private String text;

  /**
   * ACL permission
   */
  private ACLType acl;
}
