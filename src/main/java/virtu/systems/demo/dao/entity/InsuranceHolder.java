package virtu.systems.demo.dao.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "insurance_holder")
@org.hibernate.annotations.Table(
        appliesTo = "insurance_holder"
)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class InsuranceHolder {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String lastName;

  @Column(nullable = false)
  private String firstName;

  private String middleName;

  @Column(nullable = false)
  private String passportSeries;

  @Column(nullable = false)
  private String passportId;

  @Column(nullable = false)
  private Date birthDate;

}

