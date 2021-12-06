package Calculator;

public class ExceptionUserInformation extends java.lang.Exception {


    public ExceptionUserInformation() {
        System.out.println("Very bad name");
    }

    public ExceptionUserInformation(String message) {
        System.out.println("How dare you to put number 3");
    }
}
