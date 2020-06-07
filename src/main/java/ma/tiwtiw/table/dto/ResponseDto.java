package ma.tiwtiw.table.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.tiwtiw.table.model.ResponseName;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto {

  @JsonProperty("reName")
  private ResponseName responseName;
}
