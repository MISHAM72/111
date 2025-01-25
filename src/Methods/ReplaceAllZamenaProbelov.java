package Methods;

public class ReplaceAllZamenaProbelov {
    public static void main(String[] args) {

        String input  = " ПОСТАНОВЛЕНИЕ .признает допустимыми и достоверными";
        String result = input.replaceAll("\\s+", "").trim();
        System.out.println(result);

    }
}
