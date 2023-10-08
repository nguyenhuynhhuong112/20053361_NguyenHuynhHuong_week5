package fit.iuh.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "job")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Job {
    @Id
    @Column(name = "job_id")
    private long id;
    @Column(name = "job_name", columnDefinition = "varchar(255)")
    private String name;
    @Column(name = "job_desc", columnDefinition = "varchar(255)")
    private String description;
    @ManyToOne
    @JoinColumn(name = "comp_id")
    private Company company;
}
