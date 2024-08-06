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

    public boolean evaluate(int bool) {
        return true;
    }

}
