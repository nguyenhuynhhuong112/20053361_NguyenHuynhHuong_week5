package fit.iuh.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "address")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Address {
    @Id
    @Column(name = "address_id")
    private long id;
    @Column(columnDefinition = "varchar(50)")
    private String city;
    @Column(columnDefinition = "varchar(150)")
    private  String street;
    private Country country;
    @Column(columnDefinition = "varchar(20)")
    private String number;
    @Column(name = "zip_code",columnDefinition = "varchar(7)")
    private String zipCode;

}
