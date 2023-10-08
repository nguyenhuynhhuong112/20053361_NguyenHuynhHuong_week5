package fit.iuh.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "candidate")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Candidate {
    @Id
    @Column(name = "candidate_id")
    private long id;
    private Date dob;
    @Column(columnDefinition = "varchar(255)")
    private String email;
    @Column(name = "full_name",columnDefinition = "varchar(255)")
    private String fullName;
    @Column(columnDefinition = "varchar(10)")
    private String phone;
    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;
}
