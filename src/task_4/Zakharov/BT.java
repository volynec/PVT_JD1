package task_4.Zakharov;

/**
 * Created by user on 08.12.2017.
 */
public class BT {

        private int value20;
        private int value50;
        private int value100;

        private int[] moneyValue = {20, 50, 100};

        // методы для добавления купюр в банкомате
        void addValue20(int value20) {
            this.value20 += value20;
        }
        void addValue50(int value50) {
            this.value50 += value50;
        }
        void addValue100(int value100) {
            this.value100 += value100;
        }

        BT(int value20, int value50, int value100) {
            addValue20(value20);
            addValue50(value50);
            addValue100(value100);
        }

        // вызов функции по выдаче денег через булевое значение
        boolean getCash(int needSumm) {
            if (value20 * moneyValue[0] + value50 * moneyValue[1] + value100 * moneyValue[2] < needSumm) {
                System.out.println("В банкомате нет всей суммы\nМаксимальная сумма для снятия: " + (value20 * moneyValue[0] +
                        value50 * moneyValue[1] + value100 * moneyValue[2]));
                return false;
            }
            if (needSumm < moneyValue[0]) {
                System.out.println("Минимальная сумма к выдаче - " + moneyValue[0] + " рублей");
                return false;
            }
            int[] valueNumber = getValueNumber(needSumm);
            return giveMoney(valueNumber);
        }

        // условия для совершения транзакции
        private boolean giveMoney(int[] valueNumber) {
            if (valueNumber[0] == 0 && valueNumber[1] == 0 && valueNumber[2] == 0) {
                return false;
            } else if (valueNumber[0] > value20) {
                return false;
            } else if (valueNumber[1] > value50) {
                return false;
            } else if (valueNumber[2] > value100) {

                int needValue100 = valueNumber[2] - value100;
                int availableValue50 = value50 - valueNumber[1];
                int availableValue20 = value20 - valueNumber[0];

                if (needValue100 * 2 <= availableValue50) {
                    valueNumber[2] -= needValue100;
                    valueNumber[1] += needValue100 * 2;
                    printCheck(valueNumber);
                    return true;
                } else {
                    int returnValue100 = availableValue50 / 2;

                    if ((needValue100 - returnValue100) * 5 <= availableValue20) {
                        valueNumber[2] -= needValue100;
                        valueNumber[1] += returnValue100 * 2;
                        valueNumber[0] += (needValue100 - returnValue100) * 5;
                        printCheck(valueNumber);
                        return true;
                    } else {
                        return false;
                    }
                }
            } else {
                printCheck(valueNumber);
                return true;
            }
        }

        // содержимое вывода на экран
        private void printCheck(int[] valueNumber) {
            System.out.println("Банкомат выдаст купюры следующим образом:");
            for (int i = 0; i < valueNumber.length; i++) {
                if (valueNumber[i] > 0) {
                    System.out.println(valueNumber[i] + " шт." + " по " + moneyValue[i] + " рублей");
                }
            }
        }

        // алгоритм расчета купюр
        private int[] getValueNumber(int needSumm) {
            int count20 = 0;
            int count50 = 0;
            int count100 = 0;

            if (needSumm < 100) {
                if (needSumm % 20 == 0) {
                    count20 += needSumm / 20;
                } else if (needSumm - 50 > 0) {
                    if ((needSumm - 50) % 20 == 0) {
                        count50++;
                        count20 += (needSumm - 50) / 20;
                    }
                } else if (needSumm == 50) {
                    count50++;
                }
            } else if (needSumm == 100) {
                count100++;
            } else {
                if (needSumm / 100 >= 2) {
                    count100 = needSumm / 100 - 1;
                    needSumm = needSumm - count100 * 100;
                }
                if ((needSumm - 100) % 20 == 0) {
                    count100++;
                    count20 += (needSumm - 100) / 20;
                } else if ((needSumm - 150) > 0) {
                    if ((needSumm - 150) % 20 == 0) {
                        count100++;
                        count50++;
                        count20 += (needSumm - 150) / 20;
                    } else {
                        count100 = 0;
                    }
                } else if (needSumm == 150) {
                    count100++;
                    count50++;
                } else if ((needSumm - 150) < 0) {
                    if ((needSumm - 50) % 20 == 0) {
                        count50++;
                        count20 += (needSumm - 50) / 20;
                    } else {
                        count100 = 0;
                    }
                } else {
                    count100 = 0;
                }
            }

            int[] result = new int[moneyValue.length];
            result[0] = count20;
            result[1] = count50;
            result[2] = count100;

            return result;
        }

        private int getMin(int[] array) {
            int min = array[0];

            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            return min;
        }
    }

