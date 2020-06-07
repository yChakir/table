package ma.tiwtiw.table.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.tiwtiw.table.model.RequestName;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestDto {

  private String type;

  private Map<String, String> params;

  private String method;

  private Map<String, String> body;

  private Map<String, String> headers;

  @JsonProperty("reName")
  private RequestName requestName;

  private Boolean allInBody;

  private Boolean lazyLoad;
}
