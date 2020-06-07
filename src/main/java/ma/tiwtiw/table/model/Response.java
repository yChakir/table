package ma.tiwtiw.table.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Response {

  /**
   * Map name total、list, could be set like a.b.c
   */
  // todo
  private ResponseName responseName;
}
