package virtu.systems.demo.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CalculateInsurancePremiumResponseDto
 */
@Validated

public class CalculateInsurancePremiumResponseDto   {
  @JsonProperty("insuranceAmount")
  private Long insuranceAmount = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("constructionYear")
  private Integer constructionYear = null;

  @JsonProperty("square")
  private Double square = null;

  @JsonProperty("validityPeriodFrom")
  private Date validityPeriodFrom = null;

  @JsonProperty("validityPeriodTo")
  private Date validityPeriodTo = null;

  @JsonProperty("insurancePremium")
  private Long insurancePremium = null;

  @JsonProperty("calculatedDate")
  private Date calculatedDate = null;

  public CalculateInsurancePremiumResponseDto insuranceAmount(Long insuranceAmount) {
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

  public CalculateInsurancePremiumResponseDto type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "Квартира", value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CalculateInsurancePremiumResponseDto constructionYear(Integer constructionYear) {
    this.constructionYear = constructionYear;
    return this;
  }

  /**
   * Get constructionYear
   * @return constructionYear
  **/
  @ApiModelProperty(example = "2012", value = "")


  public Integer getConstructionYear() {
    return constructionYear;
  }

  public void setConstructionYear(Integer constructionYear) {
    this.constructionYear = constructionYear;
  }

  public CalculateInsurancePremiumResponseDto square(Double square) {
    this.square = square;
    return this;
  }

  /**
   * Get square
   * @return square
  **/
  @ApiModelProperty(example = "32.0", value = "")


  public Double getSquare() {
    return square;
  }

  public void setSquare(Double square) {
    this.square = square;
  }

  public CalculateInsurancePremiumResponseDto validityPeriodFrom(Date validityPeriodFrom) {
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

  public CalculateInsurancePremiumResponseDto validityPeriodTo(Date validityPeriodTo) {
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

  public CalculateInsurancePremiumResponseDto insurancePremium(Long insurancePremium) {
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

  public CalculateInsurancePremiumResponseDto calculatedDate(Date calculatedDate) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalculateInsurancePremiumResponseDto calculateInsurancePremiumResponse = (CalculateInsurancePremiumResponseDto) o;
    return Objects.equals(this.insuranceAmount, calculateInsurancePremiumResponse.insuranceAmount) &&
        Objects.equals(this.type, calculateInsurancePremiumResponse.type) &&
        Objects.equals(this.constructionYear, calculateInsurancePremiumResponse.constructionYear) &&
        Objects.equals(this.square, calculateInsurancePremiumResponse.square) &&
        Objects.equals(this.validityPeriodFrom, calculateInsurancePremiumResponse.validityPeriodFrom) &&
        Objects.equals(this.validityPeriodTo, calculateInsurancePremiumResponse.validityPeriodTo) &&
        Objects.equals(this.insurancePremium, calculateInsurancePremiumResponse.insurancePremium) &&
        Objects.equals(this.calculatedDate, calculateInsurancePremiumResponse.calculatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(insuranceAmount, type, constructionYear, square, validityPeriodFrom, validityPeriodTo, insurancePremium, calculatedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculateInsurancePremiumResponseDto {\n");
    
    sb.append("    insuranceAmount: ").append(toIndentedString(insuranceAmount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    constructionYear: ").append(toIndentedString(constructionYear)).append("\n");
    sb.append("    square: ").append(toIndentedString(square)).append("\n");
    sb.append("    validityPeriodFrom: ").append(toIndentedString(validityPeriodFrom)).append("\n");
    sb.append("    validityPeriodTo: ").append(toIndentedString(validityPeriodTo)).append("\n");
    sb.append("    insurancePremium: ").append(toIndentedString(insurancePremium)).append("\n");
    sb.append("    calculatedDate: ").append(toIndentedString(calculatedDate)).append("\n");
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

