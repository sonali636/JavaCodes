package code;

public class Custom {
    public static class CountryNotValidException extends Exception {
        private static final long serialVersionUID = 1L;
        public CountryNotValidException(String message) {
            super(message);
        }
    }

    public static class EmployeeNameInvalidException extends Exception {
        private static final long serialVersionUID = 1L;
        public EmployeeNameInvalidException(String message) {
            super(message);
        }
    }

    public static class TaxNotEligibleException extends Exception {
        private static final long serialVersionUID = 1L;
        public TaxNotEligibleException(String message) {
            super(message);
        }
    }
}
