public class memoryObject {

    private String object, hint1, hint2;

    public memoryObject(String object, String hint1, String hint2) {
        this.object = object;
        this.hint1 = hint1;
        this.hint2 = hint2;
    }

    public String getObject() {
        return object;
    }

    public String getHint1() {
        return hint1;
    }

    public String getHint2() {
        if (hint2.equals("")) {
            return "You should be able to get it in 1 hint!";
        }
        return hint2;
    }

}
