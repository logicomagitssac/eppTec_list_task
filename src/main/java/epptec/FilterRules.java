package epptec;

public enum FilterRules {

    NEGATIVES {
        @Override
        public boolean evaluate(int value) {
            return value<0;
        }
    },

    POSITIVES {
        @Override
        public boolean evaluate(int value) {
            return value>0;
        }
    };

    public boolean evaluate(int bool) { // just to have a default method to override in the individual "constants", which are therefore not actually constant... =D
        return true;
    }

}