package virtu.systems.demo.dao.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

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

