package virtu.systems.demo.dao.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "contract")
@org.hibernate.annotations.Table(
        appliesTo = "contract"
)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class Contract {
  @Id
  private Long id;

  @Column(nullable = false)
  private Long insuranceAmount;

  @Column(nullable = false)
  private Date validityPeriodFrom;

  @Column(nullable = false)
  private Date validityPeriodTo;

  @ManyToOne
  @JoinColumn(nullable = false)
  private RealEstate insuranceObject;

  @Column(nullable = false)
  private Long insurancePremium;

  @Column(unique = true, nullable = false)
  private Integer contractNumber;

  @Column(nullable = false)
  private Date calculatedDate;

  @Column(nullable = false)
  private Date conclusionDate;

  @ManyToOne
  @JoinColumn(nullable = false)
  private InsuranceHolder insuranceHolder;

  private String description;

}

