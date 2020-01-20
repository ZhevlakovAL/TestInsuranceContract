package virtu.systems.demo.dao.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "real_estate")
@org.hibernate.annotations.Table(
        appliesTo = "real_estate"
)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class RealEstate {
  @Id
  private Long id;

  @Column(nullable = false)
  private String type;

  @Column(nullable = false)
  private Integer constructionYear;

  @Column(nullable = false)
  private Double square;

  @Column(nullable = false)
  private String state;

  private String index;

  @Column(nullable = false)
  private String region;

  private String area;

  @Column(nullable = false)
  private String settlement;

  @Column(nullable = false)
  private String street;

  private Integer house;

  private String housing;

  private String structure;

  @Column(nullable = false)
  private Integer apartment;

}

