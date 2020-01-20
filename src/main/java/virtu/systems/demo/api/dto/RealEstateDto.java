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
 * RealEstateDto
 */
@Validated

public class RealEstateDto   {
  @JsonProperty("id")
  private Long id = null;

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

  public RealEstateDto id(Long id) {
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

  public RealEstateDto type(String type) {
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

  public RealEstateDto constructionYear(Integer constructionYear) {
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

  public RealEstateDto square(Double square) {
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

  public RealEstateDto state(String state) {
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

  public RealEstateDto index(String index) {
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

  public RealEstateDto region(String region) {
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

  public RealEstateDto area(String area) {
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

  public RealEstateDto settlement(String settlement) {
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

  public RealEstateDto street(String street) {
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

  public RealEstateDto house(Integer house) {
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

  public RealEstateDto housing(String housing) {
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

  public RealEstateDto structure(String structure) {
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

  public RealEstateDto apartment(Integer apartment) {
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
    RealEstateDto realEstate = (RealEstateDto) o;
    return Objects.equals(this.id, realEstate.id) &&
        Objects.equals(this.type, realEstate.type) &&
        Objects.equals(this.constructionYear, realEstate.constructionYear) &&
        Objects.equals(this.square, realEstate.square) &&
        Objects.equals(this.state, realEstate.state) &&
        Objects.equals(this.index, realEstate.index) &&
        Objects.equals(this.region, realEstate.region) &&
        Objects.equals(this.area, realEstate.area) &&
        Objects.equals(this.settlement, realEstate.settlement) &&
        Objects.equals(this.street, realEstate.street) &&
        Objects.equals(this.house, realEstate.house) &&
        Objects.equals(this.housing, realEstate.housing) &&
        Objects.equals(this.structure, realEstate.structure) &&
        Objects.equals(this.apartment, realEstate.apartment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, constructionYear, square, state, index, region, area, settlement, street, house, housing, structure, apartment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealEstateDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

