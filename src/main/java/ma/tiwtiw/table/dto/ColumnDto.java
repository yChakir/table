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
public class ColumnDto {

  private String key;

  private ColumnTitleDto title;

  private List<String> index;

  private String type;

  private String render;

  private String renderTitle;

  @JsonProperty("default")
  private String _default;

  private List<ColumnButtonDto> buttons;

  private String width;

  private String fixed;

  private String className;

  private Long colSpan;

  private ColumnSortDto sort;

  private ColumnFilterDto filter;

  private List<ColumnSelectionDto> selections;

  private String numberDigits;

  private String dateFormat;

  private ColumnYnDto yn;

  private Boolean exported;

  private ACLTypeDto acl;

  private ColumnBadgeDto badge;

  private ColumnTagDto tag;

  private ColumnWidgetDto widget;

  private ColumnStatisticalDto statistical;

  private List<ColumnDto> children;
}
