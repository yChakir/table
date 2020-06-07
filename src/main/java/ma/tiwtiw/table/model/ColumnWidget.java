package ma.tiwtiw.table.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ColumnWidget {

  /**
   * Specify the type name, which can be customized by STWidgetRegistry, for example
   */
  private String type;
}
