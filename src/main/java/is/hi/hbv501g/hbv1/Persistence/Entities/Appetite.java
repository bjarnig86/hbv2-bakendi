package is.hi.hbv501g.hbv1.Persistence.Entities;

public enum Appetite {
    BAD,
    OKAY,
    GOOD,
    VERY_GOOD;

    public String getAppetite(Appetite appetite) {
        switch (appetite) {
            case BAD:
                return "Ekki vel";
            case OKAY:
                return "Ágætlega";
            case GOOD:
                return "Vel";
            case VERY_GOOD:
                return "Mjög vel";
        }
        return "";
    }
}
