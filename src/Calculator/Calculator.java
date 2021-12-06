package Calculator;

import java.util.Scanner;

public class Calculator {
    public int firstNumb;
    public int secondNumb;
    public String nameOfUser;
    int localNumber;
    int countOfThree =0;
    int countOfName =0;
    int countOfSeven =0;
    int resalt;


    public Calculator() {
        this.firstNumb = firstNumb;
        this.secondNumb = secondNumb;
        this.nameOfUser = nameOfUser;
        setInformation();
        add(firstNumb, secondNumb);
        min(firstNumb, secondNumb);
        mul(firstNumb, secondNumb);
        div(firstNumb, secondNumb);
        this.countOfSeven = countOfSeven;
        this.countOfName = countOfName;
        this.countOfThree = countOfThree;

    }

    public void setInformation() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введть імя користувача");
        nameOfUser = input.nextLine();
        try {
            if (nameOfUser.equals("Роман") || nameOfUser.equals("Рома") || nameOfUser.equals("Roman") ||nameOfUser.equals("Roma"))
                throw new ExceptionUserInformation();
        } catch (Exception e) {
            e.printStackTrace();
            countOfName++;
        }
        System.out.println("Введть перше число");
        firstNumb = input.nextInt();
        System.out.println("Введть друге число");
        secondNumb = input.nextInt();
        try {
            if (firstNumb == 3 || secondNumb == 3) throw new ExceptionUserInformation("3");
        } catch (Exception e) {
            e.printStackTrace();
            countOfThree++;
        }

        try {
            if (firstNumb == 7 || secondNumb == 7) throw new ExceptionSeven("7");
        } catch (Exception e) {
            e.printStackTrace();
            countOfSeven++;
        }

    }

    public int add(int firstNumb, int secondNumb) {
        resalt = firstNumb + secondNumb;
        try {
            if (resalt == 3) throw new ExceptionUserInformation("3");
        } catch (Exception e) {
            e.printStackTrace();
            countOfThree++;
        }

        try {
            if (resalt == 7) throw new ExceptionSeven("7");
        } catch (Exception e) {
            e.printStackTrace();
            countOfSeven++;
        }
        System.out.println(resalt);
        return resalt;
    }

    public int min(int firstNumb, int secondNumb) {
        resalt = firstNumb - secondNumb;
        try {
            if (resalt == 3) throw new ExceptionUserInformation("3");
        } catch (Exception e) {
            e.printStackTrace();
            countOfThree++;
        }

        try {
            if (resalt == 7) throw new ExceptionSeven("7");
        } catch (Exception e) {
            e.printStackTrace();
            countOfSeven++;
        }
        System.out.println(firstNumb - secondNumb);
        return  resalt;
    }

    public int mul(int firstNumb, int secondNumb) {
        resalt = firstNumb * secondNumb;
        try {
            if (resalt == 3) throw new ExceptionUserInformation("3");
        } catch (Exception e) {
            e.printStackTrace();
            countOfThree++;
        }

        try {
            if (resalt == 7) throw new ExceptionSeven("7");
        } catch (Exception e) {
            e.printStackTrace();
            countOfSeven++;
        }
        System.out.println( resalt);
        return  resalt;
    }

    public int div(int firstNumb, int secondNumb) {
        resalt = firstNumb / secondNumb;
        try {
            if (secondNumb == 0) throw new ArithmeticException();
        } catch (Exception e){
            e.printStackTrace();
        }
        try {
            if (resalt == 3) throw new ExceptionUserInformation("3");
        } catch (Exception e) {
            e.printStackTrace();
            countOfThree++;
        }

        try {
            if (resalt == 7) throw new ExceptionSeven("7");
        } catch (Exception e) {
            e.printStackTrace();
            countOfSeven++;
        }
        System.out.println(firstNumb / secondNumb);
        return firstNumb / secondNumb;
    }

    public int next() {
        Scanner input = new Scanner(System.in);
        System.out.println("Якщо Ви бажаєте продовжити, натисніть цифру 1");
        localNumber = input.nextInt();
        if (localNumber == 1) {
            return localNumber;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "countOfThree=" + countOfThree +
                ", countOfName=" + countOfName +
                ", countOfSeven=" + countOfSeven +
                '}';
    }
}
