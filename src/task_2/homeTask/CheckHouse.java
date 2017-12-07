package task_2.homeTask;

import static task_2.homeTask.DateFormat.inputNumber;

/**
 * 2. Имеются два дома размерами a на b и c на d. Размеры вводятся польователем с консоли.
 Проверить, помещаются ли эти дома на участке размерами e на f.
 Стороны домов - параллельны сторонам участка, в остальном размещение может быть любым.

 */
public class CheckHouse {
    public static void main(String[] args) {
        int houseSizeA = inputNumber();
        int houseSizeB = inputNumber();
        int houseSizeC = inputNumber();
        int houseSizeD = inputNumber();
        int areaSizeE = inputNumber();
        int areaSizeF = inputNumber();
        System.out.printf(
                (areaSizeE >= houseSizeA && areaSizeE >= houseSizeC && areaSizeF >= (houseSizeB + houseSizeD)) ||
                        (areaSizeE >= houseSizeB && areaSizeE >= houseSizeC && areaSizeF >= (houseSizeA + houseSizeD)) ||
                        (areaSizeE >= houseSizeA && areaSizeE >= houseSizeD && areaSizeF >= (houseSizeB + houseSizeC)) ||
                        (areaSizeE >= houseSizeB && areaSizeE >= houseSizeD && areaSizeF >= (houseSizeA + houseSizeC)) ||
                        (areaSizeF >= houseSizeA && areaSizeF >= houseSizeC && areaSizeE >= (houseSizeB + houseSizeD)) ||
                        (areaSizeF >= houseSizeB && areaSizeF >= houseSizeC && areaSizeE >= (houseSizeA + houseSizeD)) ||
                        (areaSizeF >= houseSizeA && areaSizeF >= houseSizeD && areaSizeE >= (houseSizeA + houseSizeC)) ||
                        (areaSizeF >= houseSizeB && areaSizeF >= houseSizeD && areaSizeE >= (houseSizeA + houseSizeC)) ? "Yes" : "No\n");
    }
    }



