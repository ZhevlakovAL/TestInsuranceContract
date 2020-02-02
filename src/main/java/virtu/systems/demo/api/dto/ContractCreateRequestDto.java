package virtu.systems.demo.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import virtu.systems.demo.api.dto.RealEstateCreateDto;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContractCreateRequestDto
 */
@Validated

public class ContractCreateRequestDto   {
  @JsonProperty("insuranceAmount")
  private Long insuranceAmount = null;

  @JsonProperty("validityPeriodFrom")
  private Date validityPeriodFrom = null;

  @JsonProperty("validityPeriodTo")
  private Date validityPeriodTo = null;

  @JsonProperty("insuranceObject")
  private RealEstateCreateDto insuranceObject = null;

  @JsonProperty("insurancePremium")
  private Long insurancePremium = null;

  @JsonProperty("contractNumber")
  private Integer contractNumber = null;

  @JsonProperty("calculatedDate")
  private Date calculatedDate = null;

  @JsonProperty("conclusionDate")
  private Date conclusionDate = null;

  @JsonProperty("insuranceHolderId")
  private Long insuranceHolderId = null;

  @JsonProperty("description")
  private String description = null;

  public ContractCreateRequestDto insuranceAmount(Long insuranceAmount) {
    this.insuranceAmount = insuranceAmount;
    return this;
  }

  /**
   * Get insuranceAmount
   * @return insuranceAmount
  **/
  @ApiModelProperty(example = "123123", value = "")


  public Long getInsuranceAmount() {
    return insuranceAmount;
  }

  public void setInsuranceAmount(Long insuranceAmount) {
    this.insuranceAmount = insuranceAmount;
  }

  public ContractCreateRequestDto validityPeriodFrom(Date validityPeriodFrom) {
    this.validityPeriodFrom = validityPeriodFrom;
    return this;
  }

  /**
   * 'YYYY-MM-DD'
   * @return validityPeriodFrom
  **/
  @ApiModelProperty(example = "2020-01-01", value = "'YYYY-MM-DD'")

  @Valid

  public Date getValidityPeriodFrom() {
    return validityPeriodFrom;
  }

  public void setValidityPeriodFrom(Date validityPeriodFrom) {
    this.validityPeriodFrom = validityPeriodFrom;
  }

  public ContractCreateRequestDto validityPeriodTo(Date validityPeriodTo) {
    this.validityPeriodTo = validityPeriodTo;
    return this;
  }

  /**
   * 'YYYY-MM-DD'
   * @return validityPeriodTo
  **/
  @ApiModelProperty(example = "2020-03-01", value = "'YYYY-MM-DD'")

  @Valid

  public Date getValidityPeriodTo() {
    return validityPeriodTo;
  }

  public void setValidityPeriodTo(Date validityPeriodTo) {
    this.validityPeriodTo = validityPeriodTo;
  }

  public ContractCreateRequestDto insuranceObject(RealEstateCreateDto insuranceObject) {
    this.insuranceObject = insuranceObject;
    return this;
  }

  /**
   * Get insuranceObject
   * @return insuranceObject
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RealEstateCreateDto getInsuranceObject() {
    return insuranceObject;
  }

  public void setInsuranceObject(RealEstateCreateDto insuranceObject) {
    this.insuranceObject = insuranceObject;
  }

  public ContractCreateRequestDto insurancePremium(Long insurancePremium) {
    this.insurancePremium = insurancePremium;
    return this;
  }

  /**
   * Get insurancePremium
   * @return insurancePremium
  **/
  @ApiModelProperty(example = "123123", value = "")


  public Long getInsurancePremium() {
    return insurancePremium;
  }

  public void setInsurancePremium(Long insurancePremium) {
    this.insurancePremium = insurancePremium;
  }

  public ContractCreateRequestDto contractNumber(Integer contractNumber) {
    this.contractNumber = contractNumber;
    return this;
  }

  /**
   * Get contractNumber
   * @return contractNumber
  **/
  @ApiModelProperty(example = "123123", value = "")


  public Integer getContractNumber() {
    return contractNumber;
  }

  public void setContractNumber(Integer contractNumber) {
    this.contractNumber = contractNumber;
  }

  public ContractCreateRequestDto calculatedDate(Date calculatedDate) {
    this.calculatedDate = calculatedDate;
    return this;
  }

  /**
   * 'YYYY-MM-DD'
   * @return calculatedDate
  **/
  @ApiModelProperty(example = "2020-01-01", value = "'YYYY-MM-DD'")

  @Valid

  public Date getCalculatedDate() {
    return calculatedDate;
  }

  public void setCalculatedDate(Date calculatedDate) {
    this.calculatedDate = calculatedDate;
  }

  public ContractCreateRequestDto conclusionDate(Date conclusionDate) {
    this.conclusionDate = conclusionDate;
    return this;
  }

  /**
   * 'YYYY-MM-DD'
   * @return conclusionDate
  **/
  @ApiModelProperty(example = "2020-01-01", value = "'YYYY-MM-DD'")

  @Valid

  public Date getConclusionDate() {
    return conclusionDate;
  }

  public void setConclusionDate(Date conclusionDate) {
    this.conclusionDate = conclusionDate;
  }

  public ContractCreateRequestDto insuranceHolderId(Long insuranceHolderId) {
    this.insuranceHolderId = insuranceHolderId;
    return this;
  }

  /**
   * Get insuranceHolderId
   * @return insuranceHolderId
  **/
  @ApiModelProperty(example = "123123", value = "")


  public Long getInsuranceHolderId() {
    return insuranceHolderId;
  }

  public void setInsuranceHolderId(Long insuranceHolderId) {
    this.insuranceHolderId = insuranceHolderId;
  }

  public ContractCreateRequestDto description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "Договор страхования имущества", value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractCreateRequestDto contractCreateRequest = (ContractCreateRequestDto) o;
    return Objects.equals(this.insuranceAmount, contractCreateRequest.insuranceAmount) &&
        Objects.equals(this.validityPeriodFrom, contractCreateRequest.validityPeriodFrom) &&
        Objects.equals(this.validityPeriodTo, contractCreateRequest.validityPeriodTo) &&
        Objects.equals(this.insuranceObject, contractCreateRequest.insuranceObject) &&
        Objects.equals(this.insurancePremium, contractCreateRequest.insurancePremium) &&
        Objects.equals(this.contractNumber, contractCreateRequest.contractNumber) &&
        Objects.equals(this.calculatedDate, contractCreateRequest.calculatedDate) &&
        Objects.equals(this.conclusionDate, contractCreateRequest.conclusionDate) &&
        Objects.equals(this.insuranceHolderId, contractCreateRequest.insuranceHolderId) &&
        Objects.equals(this.description, contractCreateRequest.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(insuranceAmount, validityPeriodFrom, validityPeriodTo, insuranceObject, insurancePremium, contractNumber, calculatedDate, conclusionDate, insuranceHolderId, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractCreateRequestDto {\n");
    
    sb.append("    insuranceAmount: ").append(toIndentedString(insuranceAmount)).append("\n");
    sb.append("    validityPeriodFrom: ").append(toIndentedString(validityPeriodFrom)).append("\n");
    sb.append("    validityPeriodTo: ").append(toIndentedString(validityPeriodTo)).append("\n");
    sb.append("    insuranceObject: ").append(toIndentedString(insuranceObject)).append("\n");
    sb.append("    insurancePremium: ").append(toIndentedString(insurancePremium)).append("\n");
    sb.append("    contractNumber: ").append(toIndentedString(contractNumber)).append("\n");
    sb.append("    calculatedDate: ").append(toIndentedString(calculatedDate)).append("\n");
    sb.append("    conclusionDate: ").append(toIndentedString(conclusionDate)).append("\n");
    sb.append("    insuranceHolderId: ").append(toIndentedString(insuranceHolderId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

