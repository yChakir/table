package ma.tiwtiw.table.model;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request {

  /**
   * Pagination type, page used pi, ps; skip used skip, limit
   */
  @Default
  private RequestTypeEnum type = RequestTypeEnum.PAGE;

  /**
   * Request parameters, default to auto append pi, ps to URL
   */
  @Default
  private Map<String, String> params;

  /**
   * Request method
   */
  @Default
  private MethodEnum method = MethodEnum.GET;

  /**
   * Request body (only method is POST)
   */
  private Map<String, String> body;

  /**
   * Request header
   */
  private Map<String, String> headers;

  /**
   * Map name pi、ps
   */
  private RequestName requestName;

  /**
   * Whether to request all parameter data into body (except url itself parameter)
   */
  @Default
  private Boolean allInBody = Boolean.FALSE;

  /**
   * Whether to dealy loading data in first render st component
   */
  @Default
  private Boolean lazyLoad = Boolean.FALSE;
}
