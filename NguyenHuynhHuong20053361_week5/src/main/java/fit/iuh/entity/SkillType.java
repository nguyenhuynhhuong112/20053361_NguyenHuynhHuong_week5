package fit.iuh.entity;

public enum SkillType {
    PROGRAMMING,
    DESIGN,
    MARKETING,
    WRITING,
    COMMUNICATION,
    ANALYSIS,
    MANAGEMENT;

    @Override
    public String toString() {
        switch (this) {
            case PROGRAMMING:
                return "Programming";
            case DESIGN:
                return "Design";
            case MARKETING:
                return "Marketing";
            case WRITING:
                return "Writing";
            case COMMUNICATION:
                return "Communication";
            case ANALYSIS:
                return "Analysis";
            case MANAGEMENT:
                return "Management";
            default:
                return "Unknown Skill Type";
        }
    }
}
