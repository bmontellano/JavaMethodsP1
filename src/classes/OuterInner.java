package classes;

public class OuterInner {
    public class Inner {
        private final String message;

        public Inner(String message) {
            this.message = message;
        }

        @Override
        public String toString(){
            return "Message from the inside: " + this.message;
        }
    }

    public String getInnerMessage(String message) {
        Inner in = new Inner(message);
        return in.toString();
    }

    public Inner getInner(String message){
        return new Inner(message);
    }
}
