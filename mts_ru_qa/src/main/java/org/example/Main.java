package org.example;
/*
Домашнее задание (опциональное):

        Создать класс, который содержит 3 параметра:
        ● целочисленное значение - количество товаров
        ● вещественное значение - цена товара
        ● вещественное значение - скидка на товар

        Сам класс должен иметь описание с многострочным комментарием. Каждое поле должно содержать однострочный комментарий с коротким
        описанием.

        Сделать метод, который принимает объект на вход и выполняет подсчеты: вывести на экран общую сумму покупки без скидки и сумму со скидкой.

        Создать второй класс, который будет содержать метод main. Сделать 3 вызова метода с различными объектами (количество товаров и сумма
        должны быть больше нуля) и скидками:
        1) 0,75%
        2) 42,575%
        3) 59,1%

        Итоговая сумма должна быть округлена до 2 знаков после запятой.
*/


public class Main {
    public static void main(String[] args) {

        Shop shop1 = new Shop(10,250,0.0075F);
        Shop shop2 = new Shop(20,130,0.42575F);
        Shop shop3 = new Shop(35,35,0.591F);

        shop1.shopCalculate(shop1);
        shop2.shopCalculate(shop2);
        shop3.shopCalculate(shop3);
    }
}

class Shop {//Создание класса
    int numberOfGoods;//Количество товаров
    float praceOfTheProduct;//Цена одного товара
    float discount;//скидка на товар

    public Shop(int numberOfGoods, float praceOfTheProduct, float discount) {/*Создание конструктора, который позволяет
        передать необходимые значение в созданный экземпляр*/
        this.numberOfGoods = numberOfGoods;
        this.praceOfTheProduct = praceOfTheProduct;
        this.discount = discount;
    }

    public void shopCalculate(Shop shop) {//метод, который принимает объект на вход и выполняет подсчеты: вывести на экран общую сумму покупки без скидки и сумму со скидкой.
        System.out.print("Общая сумма покупки без скидки: ");
        System.out.println(numberOfGoods*praceOfTheProduct);
        System.out.print("Общая сумма скидки: ");
        System.out.println((numberOfGoods*praceOfTheProduct)*discount);//Отдельно вывожу скидку для ясности
        System.out.print("Общая сумма покупки со скидкой: ");
        System.out.println(numberOfGoods*praceOfTheProduct-((numberOfGoods*praceOfTheProduct)*discount) + "\n" + "___________________");//Подсчёт суммы твоваров со скидкой

    }
}

