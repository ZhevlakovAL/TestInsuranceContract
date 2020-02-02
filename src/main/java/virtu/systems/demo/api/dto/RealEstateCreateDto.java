package virtu.systems.demo.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RealEstateCreateDto
 */
@Validated

public class RealEstateCreateDto   {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("constructionYear")
  private Integer constructionYear = null;

  @JsonProperty("square")
  private Double square = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("index")
  private String index = null;

  @JsonProperty("region")
  private String region = null;

  @JsonProperty("area")
  private String area = null;

  @JsonProperty("settlement")
  private String settlement = null;

  @JsonProperty("street")
  private String street = null;

  @JsonProperty("house")
  private Integer house = null;

  @JsonProperty("housing")
  private String housing = null;

  @JsonProperty("structure")
  private String structure = null;

  @JsonProperty("apartment")
  private Integer apartment = null;

  public RealEstateCreateDto type(String type) {
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

  public RealEstateCreateDto constructionYear(Integer constructionYear) {
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

  public RealEstateCreateDto square(Double square) {
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

  public RealEstateCreateDto state(String state) {
    this.state = state;
    return this;
  }

  /**
   * государство
   * @return state
  **/
  @ApiModelProperty(example = "Россия", value = "государство")


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public RealEstateCreateDto index(String index) {
    this.index = index;
    return this;
  }

  /**
   * индекс
   * @return index
  **/
  @ApiModelProperty(example = "23452", value = "индекс")


  public String getIndex() {
    return index;
  }

  public void setIndex(String index) {
    this.index = index;
  }

  public RealEstateCreateDto region(String region) {
    this.region = region;
    return this;
  }

  /**
   * республика, край, область
   * @return region
  **/
  @ApiModelProperty(example = "Томская", value = "республика, край, область")


  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public RealEstateCreateDto area(String area) {
    this.area = area;
    return this;
  }

  /**
   * район
   * @return area
  **/
  @ApiModelProperty(example = "Советский", value = "район")


  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }

  public RealEstateCreateDto settlement(String settlement) {
    this.settlement = settlement;
    return this;
  }

  /**
   * населённый пункт
   * @return settlement
  **/
  @ApiModelProperty(example = "", value = "населённый пункт")


  public String getSettlement() {
    return settlement;
  }

  public void setSettlement(String settlement) {
    this.settlement = settlement;
  }

  public RealEstateCreateDto street(String street) {
    this.street = street;
    return this;
  }

  /**
   * улица
   * @return street
  **/
  @ApiModelProperty(example = "Тютчева", value = "улица")


  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public RealEstateCreateDto house(Integer house) {
    this.house = house;
    return this;
  }

  /**
   * дом
   * @return house
  **/
  @ApiModelProperty(example = "3", value = "дом")


  public Integer getHouse() {
    return house;
  }

  public void setHouse(Integer house) {
    this.house = house;
  }

  public RealEstateCreateDto housing(String housing) {
    this.housing = housing;
    return this;
  }

  /**
   * корпус
   * @return housing
  **/
  @ApiModelProperty(example = "2", value = "корпус")


  public String getHousing() {
    return housing;
  }

  public void setHousing(String housing) {
    this.housing = housing;
  }

  public RealEstateCreateDto structure(String structure) {
    this.structure = structure;
    return this;
  }

  /**
   * строение
   * @return structure
  **/
  @ApiModelProperty(example = "", value = "строение")


  public String getStructure() {
    return structure;
  }

  public void setStructure(String structure) {
    this.structure = structure;
  }

  public RealEstateCreateDto apartment(Integer apartment) {
    this.apartment = apartment;
    return this;
  }

  /**
   * квартира
   * @return apartment
  **/
  @ApiModelProperty(example = "34", value = "квартира")


  public Integer getApartment() {
    return apartment;
  }

  public void setApartment(Integer apartment) {
    this.apartment = apartment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealEstateCreateDto realEstateCreate = (RealEstateCreateDto) o;
    return Objects.equals(this.type, realEstateCreate.type) &&
        Objects.equals(this.constructionYear, realEstateCreate.constructionYear) &&
        Objects.equals(this.square, realEstateCreate.square) &&
        Objects.equals(this.state, realEstateCreate.state) &&
        Objects.equals(this.index, realEstateCreate.index) &&
        Objects.equals(this.region, realEstateCreate.region) &&
        Objects.equals(this.area, realEstateCreate.area) &&
        Objects.equals(this.settlement, realEstateCreate.settlement) &&
        Objects.equals(this.street, realEstateCreate.street) &&
        Objects.equals(this.house, realEstateCreate.house) &&
        Objects.equals(this.housing, realEstateCreate.housing) &&
        Objects.equals(this.structure, realEstateCreate.structure) &&
        Objects.equals(this.apartment, realEstateCreate.apartment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, constructionYear, square, state, index, region, area, settlement, street, house, housing, structure, apartment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealEstateCreateDto {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    constructionYear: ").append(toIndentedString(constructionYear)).append("\n");
    sb.append("    square: ").append(toIndentedString(square)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    settlement: ").append(toIndentedString(settlement)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    house: ").append(toIndentedString(house)).append("\n");
    sb.append("    housing: ").append(toIndentedString(housing)).append("\n");
    sb.append("    structure: ").append(toIndentedString(structure)).append("\n");
    sb.append("    apartment: ").append(toIndentedString(apartment)).append("\n");
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

