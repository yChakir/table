package ma.tiwtiw.table.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ColumnButtonPopDto {

  private String title;

  private String trigger;

  private String placement;

  private String overlayClassName;

  private Object overlayStyle;

  private String cancelText;

  private String okText;

  private String okType;

  private String icon;

}
