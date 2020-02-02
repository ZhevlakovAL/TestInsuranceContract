package virtu.systems.demo.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import virtu.systems.demo.api.dto.ContractDto;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContractsResponseDto
 */
@Validated

public class ContractsResponseDto   {
  @JsonProperty("contracts")
  @Valid
  private List<ContractDto> contracts = null;

  public ContractsResponseDto contracts(List<ContractDto> contracts) {
    this.contracts = contracts;
    return this;
  }

  public ContractsResponseDto addContractsItem(ContractDto contractsItem) {
    if (this.contracts == null) {
      this.contracts = new ArrayList<ContractDto>();
    }
    this.contracts.add(contractsItem);
    return this;
  }

  /**
   * Get contracts
   * @return contracts
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ContractDto> getContracts() {
    return contracts;
  }

  public void setContracts(List<ContractDto> contracts) {
    this.contracts = contracts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractsResponseDto contractsResponse = (ContractsResponseDto) o;
    return Objects.equals(this.contracts, contractsResponse.contracts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contracts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractsResponseDto {\n");
    
    sb.append("    contracts: ").append(toIndentedString(contracts)).append("\n");
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

