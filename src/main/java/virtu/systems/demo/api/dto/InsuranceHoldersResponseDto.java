package virtu.systems.demo.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import virtu.systems.demo.api.dto.InsuranceHolderDto;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InsuranceHoldersResponseDto
 */
@Validated

public class InsuranceHoldersResponseDto   {
  @JsonProperty("insuranceHolders")
  @Valid
  private List<InsuranceHolderDto> insuranceHolders = null;

  public InsuranceHoldersResponseDto insuranceHolders(List<InsuranceHolderDto> insuranceHolders) {
    this.insuranceHolders = insuranceHolders;
    return this;
  }

  public InsuranceHoldersResponseDto addInsuranceHoldersItem(InsuranceHolderDto insuranceHoldersItem) {
    if (this.insuranceHolders == null) {
      this.insuranceHolders = new ArrayList<InsuranceHolderDto>();
    }
    this.insuranceHolders.add(insuranceHoldersItem);
    return this;
  }

  /**
   * Get insuranceHolders
   * @return insuranceHolders
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<InsuranceHolderDto> getInsuranceHolders() {
    return insuranceHolders;
  }

  public void setInsuranceHolders(List<InsuranceHolderDto> insuranceHolders) {
    this.insuranceHolders = insuranceHolders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsuranceHoldersResponseDto insuranceHoldersResponse = (InsuranceHoldersResponseDto) o;
    return Objects.equals(this.insuranceHolders, insuranceHoldersResponse.insuranceHolders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(insuranceHolders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceHoldersResponseDto {\n");
    
    sb.append("    insuranceHolders: ").append(toIndentedString(insuranceHolders)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

