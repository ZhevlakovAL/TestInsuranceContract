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
 * InsuranceHolderRequestDto
 */
@Validated

public class InsuranceHolderRequestDto   {
  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("middleName")
  private String middleName = null;

  @JsonProperty("passportSeries")
  private String passportSeries = null;

  @JsonProperty("passportId")
  private String passportId = null;

  @JsonProperty("birthDate")
  private Date birthDate = null;

  public InsuranceHolderRequestDto lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(example = "Иванов", value = "")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public InsuranceHolderRequestDto firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(example = "Иван", value = "")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public InsuranceHolderRequestDto middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Get middleName
   * @return middleName
  **/
  @ApiModelProperty(example = "Иванович", value = "")


  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public InsuranceHolderRequestDto passportSeries(String passportSeries) {
    this.passportSeries = passportSeries;
    return this;
  }

  /**
   * Get passportSeries
   * @return passportSeries
  **/
  @ApiModelProperty(example = "1234", value = "")


  public String getPassportSeries() {
    return passportSeries;
  }

  public void setPassportSeries(String passportSeries) {
    this.passportSeries = passportSeries;
  }

  public InsuranceHolderRequestDto passportId(String passportId) {
    this.passportId = passportId;
    return this;
  }

  /**
   * Get passportId
   * @return passportId
  **/
  @ApiModelProperty(example = "654321", value = "")


  public String getPassportId() {
    return passportId;
  }

  public void setPassportId(String passportId) {
    this.passportId = passportId;
  }

  public InsuranceHolderRequestDto birthDate(Date birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Дата рождения. 'YYYY-MM-DD'
   * @return birthDate
  **/
  @ApiModelProperty(example = "YYYY-MM-DD", value = "Дата рождения. 'YYYY-MM-DD'")

  @Valid

  public Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsuranceHolderRequestDto insuranceHolderRequest = (InsuranceHolderRequestDto) o;
    return Objects.equals(this.lastName, insuranceHolderRequest.lastName) &&
        Objects.equals(this.firstName, insuranceHolderRequest.firstName) &&
        Objects.equals(this.middleName, insuranceHolderRequest.middleName) &&
        Objects.equals(this.passportSeries, insuranceHolderRequest.passportSeries) &&
        Objects.equals(this.passportId, insuranceHolderRequest.passportId) &&
        Objects.equals(this.birthDate, insuranceHolderRequest.birthDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastName, firstName, middleName, passportSeries, passportId, birthDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceHolderRequestDto {\n");
    
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    passportSeries: ").append(toIndentedString(passportSeries)).append("\n");
    sb.append("    passportId: ").append(toIndentedString(passportId)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
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

