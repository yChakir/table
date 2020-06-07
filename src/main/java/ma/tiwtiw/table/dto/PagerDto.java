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
public class PagerDto {

  private Boolean front;

  private Boolean zeroIndexed;

  private String position;

  private String placement;

  private Boolean show;

  private Boolean showSize;

  private List<Long> pageSizes;

  private Boolean showQuickJumper;

  private String total;

  private Boolean toTop;

  private Long toTopOffset;
}
