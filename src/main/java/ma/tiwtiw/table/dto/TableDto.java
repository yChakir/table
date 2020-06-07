package ma.tiwtiw.table.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ma.tiwtiw.core.dto.BaseDto;
import ma.tiwtiw.table.model.Table;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TableDto extends BaseDto<Table, String> {

  private List<ColumnDto> columns;

  private String data;

  @JsonProperty("req")
  private RequestDto request;

  @JsonProperty("res")
  private ResponseDto response;

  private Long pi;

  private Long ps;

  private Long total;

  @JsonProperty("page")
  private PagerDto pager;

  private String noContent;

  private Boolean bordered;

  private String size;

  private WidthModeDto widthMode;

  private Boolean loading;

  private Long loadingDelay;

  private ScrollInfoDto scroll;

  private Boolean virtualScroll;

  private Long virtualItemSize;

  private Long virtualMaxBufferPx;

  private Long virtualMinBufferPx;

  private SingleSortDto singleSort;

  private MultiSortDto multiSort;

  private Long rowClickTime;

  private String header;

  private String footer;

  private List<String> widthConfig;

  private Boolean expandRowByClick;

  private Boolean expandAccordion;

  private Boolean responsive;

  private Boolean responsiveHideHeaderFooter;
}
