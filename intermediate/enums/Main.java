package intermediate.enums;

public class Main {
    public static void main(String[] args) {

        /*When accessing enums, you'll notice that it's quite similar to any regular Java class*/
        Status status = Status.HTTP_200;
        System.out.println(status.number + " : " + status.message);

        /*You can also loop over an enum*/
        for (Status s : Status.values()) {
            System.out.println(s.number + " : " + s.message);
        }

    }
}
