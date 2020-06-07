package ma.tiwtiw.table.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ColumnFilterDto {

  private String type;

  private List<ColumnFilterMenuDto> menus;

  @JsonProperty("default")
  private Boolean _default;

  private IconDto icon;

  private Boolean multiple;

  private String confirmText;

  private String clearText;

  private String key;
}
