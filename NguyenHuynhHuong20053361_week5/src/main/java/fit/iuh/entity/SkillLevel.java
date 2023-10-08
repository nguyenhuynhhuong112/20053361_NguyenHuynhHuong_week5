package fit.iuh.entity;

public enum SkillLevel {
    BEGINNER,
    INTERMEDIATE,
    ADVANCED;

    @Override
    public String toString() {
        switch (this) {
            case BEGINNER:
                return "Beginner";
            case INTERMEDIATE:
                return "Intermediate";
            case ADVANCED:
                return "Advanced";
            default:
                return "Unknown Skill Level";
        }
    }
}
