package ma.tiwtiw.table.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IconDto {

  private String type;

  private String theme;

  private Boolean spin;

  private String twoToneColor;

  private String iconFont;
}
