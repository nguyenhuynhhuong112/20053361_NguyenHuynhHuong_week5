package fit.iuh.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "job_skill")
@Data
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JobSkill {
    @Id
    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;
    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;
    @Column(name = "more_infos", columnDefinition = "varchar(1000)")
    private String moreInfos;
    private SkillLevel skillLevel;
}
