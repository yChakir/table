package ma.tiwtiw.table.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ColumnTitle {

  /**
   * Text of header, can be choose one of `text` or `i18n`
   */
  private String text;

  /**
   * I18n key of header, can be choose one of `text` or `i18n`
   */
  private String i18n;

  /**
   * Optional information of header
   */
  private String optional;

  /**
   * Optional help of header
   */
  private String optionalHelp;
}
