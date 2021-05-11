package homework_4;


public class BoolExpressions {

    boolean test1(int i) {
        return (i == 10 || i == 20 || i == 75);
    }

    boolean test2(int i) {
        return i != 10 && i != 20 && i != 75;
    }

    String test3(int i) {
        if (i % 2 == 0) {
            return "Even";
        } else {
            return "Odd";

        }
    }

    String test4(int i) {
        if (i < 11) {
            return "children";
        } else if (i < 21){
            return "teenagers";
        }else if(i< 31) {
            return "young";
        }else if(i< 56) {
            return "adult";
        }else {
            return "senior";

        }
    }

    boolean test5(String text, int i) {
        return text.length() == i;
    }

    boolean test6(String text1, String text2) {
        return text1.equals(text2);
    }

    int test7(int num1, int num2){
        return Math.max(num1,num2);
    }

}