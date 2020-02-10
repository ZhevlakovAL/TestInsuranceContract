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
 * InsuranceHolderDto
 */
@Validated

public class InsuranceHolderDto   {
  @JsonProperty("id")
  private Long id = null;

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

  public InsuranceHolderDto id(Long id) {
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

  public InsuranceHolderDto lastName(String lastName) {
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

  public InsuranceHolderDto firstName(String firstName) {
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

  public InsuranceHolderDto middleName(String middleName) {
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

  public InsuranceHolderDto passportSeries(String passportSeries) {
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

  public InsuranceHolderDto passportId(String passportId) {
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

  public InsuranceHolderDto birthDate(Date birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Дата рождения. 'YYYY-MM-DD'
   * @return birthDate
  **/
  @ApiModelProperty(example = "1981-02-07", value = "Дата рождения. 'YYYY-MM-DD'")

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
    InsuranceHolderDto insuranceHolder = (InsuranceHolderDto) o;
    return Objects.equals(this.id, insuranceHolder.id) &&
        Objects.equals(this.lastName, insuranceHolder.lastName) &&
        Objects.equals(this.firstName, insuranceHolder.firstName) &&
        Objects.equals(this.middleName, insuranceHolder.middleName) &&
        Objects.equals(this.passportSeries, insuranceHolder.passportSeries) &&
        Objects.equals(this.passportId, insuranceHolder.passportId) &&
        Objects.equals(this.birthDate, insuranceHolder.birthDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lastName, firstName, middleName, passportSeries, passportId, birthDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceHolderDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

