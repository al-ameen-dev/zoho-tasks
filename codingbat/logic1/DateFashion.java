package logic1;

public class DateFashion {
    public static int dateFashion(int you, int date) {
        if ((you > 7 && date > 7) || (you > 2 && date > 7) || (you > 7 && date > 2))
            return 2;
        else if ((you > 8 && date < 3) || (you < 3 && date > 8) || (you < 3 && date < 3) || (you < 3 || date < 3))
            return 0;
        else if (you < 3 || date < 3)
            return 1;
        else
            return 1;
    }

}
