package virtu.systems.demo.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import virtu.systems.demo.api.dto.RealEstateDto;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContractUpdateRequestDto
 */
@Validated

public class ContractUpdateRequestDto   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("insuranceAmount")
  private Long insuranceAmount = null;

  @JsonProperty("validityPeriodFrom")
  private Date validityPeriodFrom = null;

  @JsonProperty("validityPeriodTo")
  private Date validityPeriodTo = null;

  @JsonProperty("insuranceObject")
  private RealEstateDto insuranceObject = null;

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

  public ContractUpdateRequestDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "123123", value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ContractUpdateRequestDto insuranceAmount(Long insuranceAmount) {
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

  public ContractUpdateRequestDto validityPeriodFrom(Date validityPeriodFrom) {
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

  public ContractUpdateRequestDto validityPeriodTo(Date validityPeriodTo) {
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

  public ContractUpdateRequestDto insuranceObject(RealEstateDto insuranceObject) {
    this.insuranceObject = insuranceObject;
    return this;
  }

  /**
   * Get insuranceObject
   * @return insuranceObject
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RealEstateDto getInsuranceObject() {
    return insuranceObject;
  }

  public void setInsuranceObject(RealEstateDto insuranceObject) {
    this.insuranceObject = insuranceObject;
  }

  public ContractUpdateRequestDto insurancePremium(Long insurancePremium) {
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

  public ContractUpdateRequestDto contractNumber(Integer contractNumber) {
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

  public ContractUpdateRequestDto calculatedDate(Date calculatedDate) {
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

  public ContractUpdateRequestDto conclusionDate(Date conclusionDate) {
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

  public ContractUpdateRequestDto insuranceHolderId(Long insuranceHolderId) {
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

  public ContractUpdateRequestDto description(String description) {
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
    ContractUpdateRequestDto contractUpdateRequest = (ContractUpdateRequestDto) o;
    return Objects.equals(this.id, contractUpdateRequest.id) &&
        Objects.equals(this.insuranceAmount, contractUpdateRequest.insuranceAmount) &&
        Objects.equals(this.validityPeriodFrom, contractUpdateRequest.validityPeriodFrom) &&
        Objects.equals(this.validityPeriodTo, contractUpdateRequest.validityPeriodTo) &&
        Objects.equals(this.insuranceObject, contractUpdateRequest.insuranceObject) &&
        Objects.equals(this.insurancePremium, contractUpdateRequest.insurancePremium) &&
        Objects.equals(this.contractNumber, contractUpdateRequest.contractNumber) &&
        Objects.equals(this.calculatedDate, contractUpdateRequest.calculatedDate) &&
        Objects.equals(this.conclusionDate, contractUpdateRequest.conclusionDate) &&
        Objects.equals(this.insuranceHolderId, contractUpdateRequest.insuranceHolderId) &&
        Objects.equals(this.description, contractUpdateRequest.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, insuranceAmount, validityPeriodFrom, validityPeriodTo, insuranceObject, insurancePremium, contractNumber, calculatedDate, conclusionDate, insuranceHolderId, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractUpdateRequestDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

