package ma.tiwtiw.table.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ColumnTitleDto {

  private String text;

  private String i18n;

  private String optional;

  private String optionalHelp;
}
