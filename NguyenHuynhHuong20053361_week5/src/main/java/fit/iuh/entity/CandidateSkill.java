package fit.iuh.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "candidate_skill")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CandidateSkill {
    @Id
    @ManyToOne
    @JoinColumn(name = "can_id")
    private Candidate candidate;
    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;
    @Column(name = "more_infos", columnDefinition = "varchar(1000)")
    private String moreInfos;
    private SkillLevel skillLevel;
}
