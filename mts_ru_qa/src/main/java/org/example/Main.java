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

        Shop shop1 = new Shop(10,250,0.0075F);//Создание трёх экземпляров классов,
        Shop shop2 = new Shop(20,130,0.42575F);//передаём заданные по ТЗ проценты, а так же вписываем количество товаров и их цену.
        Shop shop3 = new Shop(35,35,0.591F);

        shop1.shopCalculate(shop1);//вызываем для каждого объекта метод, выводящий необходимую информацию, передаём в него этот же объект
        shop2.shopCalculate(shop2);
        shop3.shopCalculate(shop3);
    }
}

class Shop {//Создание класса Shop с товарами
    private int numberOfProducts;//Количество товаров
    private float praceOfTheProduct;//Цена одного товара
    private float discount;//скидка на товар

    public Shop(int numberOfProducts, float praceOfTheProduct, float discount) {/*Создание конструктора, который позволяет
        передать необходимые значение в созданный экземпляр*/
        this.numberOfProducts = numberOfProducts;
        this.praceOfTheProduct = praceOfTheProduct;
        this.discount = discount;
    }

    public void shopCalculate(Shop shop) {//метод, который принимает объект на вход и выполняет подсчеты: вывести на экран общую сумму покупки без скидки и сумму со скидкой.
        /*Для того, чтобы итоговая сумма была округлена до двух знаков после запятой,
        создадим дополнительную переменную totalAmount*/
        float totalAmount = numberOfProducts * praceOfTheProduct - (numberOfProducts *praceOfTheProduct* discount);
        String result1 = String.format("%.2f",totalAmount);


        System.out.print("Общая сумма покупки без скидки: ");
        System.out.println(numberOfProducts * praceOfTheProduct);
        System.out.print("Cкидка на все товары: ");
        System.out.println((numberOfProducts * praceOfTheProduct)* discount);//Отдельно вывожу размер скидки для ясности
        System.out.print("Общая сумма покупки со скидкой: ");
        System.out.println(result1 + "\n" + "___________________");//Подсчёт суммы твоваров со скидкой и округлённым значение до двух знаков после запятой

    }
}

