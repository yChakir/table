package ma.tiwtiw.table.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ColumnButtonDto {

  private String text;

  private IconDto icon;

  private String i18n;

  private String type;

  private ColumnButtonPopDto pop;

  private ColumnButtonModalDto modal;

  private ColumnButtonDrawerDto drawer;

  private List<ColumnButtonDto> children;

  private ACLTypeDto acl;

  private String tooltip;
}
