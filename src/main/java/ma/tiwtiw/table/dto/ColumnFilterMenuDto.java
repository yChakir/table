package ma.tiwtiw.table.dto;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ColumnFilterMenuDto {

  private String text;

  private Map<String, String> value;

  private Boolean checked;

  private ACLTypeDto acl;
}
