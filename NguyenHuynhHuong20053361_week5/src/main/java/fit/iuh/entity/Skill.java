package fit.iuh.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "skill")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Skill {
    @Id
    @Column(name = "skill_id")
    private long id;
    @Column(name = "skill_name", columnDefinition = "varchar(255)")
    private String name;
    @Column(name = "skill_description", columnDefinition = "varchar(255)")
    private String description;
    private SkillType type;

}
