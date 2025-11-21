class IrsUtil {
    static double irsTax(int bracket) {
        if (bracket < 1 || bracket > 4) {
            return 0.0;
        }
        if (bracket == 1) {
            return 0.12;
        } else if (bracket == 2) {
            return 0.18;
        } else if (bracket == 3) {
            return 0.23;
        } else {
            return 0.29;
        }
    }

    static int irsGroup(int income) {
        assert income >= 0;
        if (income >= 0 && income < 10000) {
            return 1;
        } else if (income >= 10000 && income <= 25500) {
            return 2;
        } else if (income <= 48500) {
            return 3;
        } else {
            return 4;
        }
    }
}