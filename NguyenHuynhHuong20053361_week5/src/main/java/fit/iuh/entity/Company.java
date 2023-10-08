package fit.iuh.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "company")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Company {
    @Id
    @Column(name = "comp_id")
    private  long id ;
    @Column(columnDefinition = "varchar(2000)")
    private String about;
    @Column(columnDefinition = "varchar(255)")
    private String email;
    @Column(name = "comp_name",columnDefinition = "varchar(255)")
    private String companyName;
    @Column(columnDefinition = "varchar(255)")
    private String phone;
    @Column(name = "web_url",columnDefinition = "varchar(255)")
    private String webURL;
    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;
}
