import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {


                Scanner scanner = new Scanner(System.in);

                String[] products = new String[]{"Йогурт", "Вискас", "Сыр"};
                int[] prices = new int[]{125, 248, 354};
                int[] quantity = new int[products.length];
                int productNumber = 0;
                int productCount = 0;
                int currentPrice = prices[productNumber];

                while (true) {
                    System.out.println(Arrays.toString(products));
                    System.out.println(Arrays.toString(prices));
                    System.out.println("Список возможных товаров для покупки:\n1. Йогурт\n2. Вискас\n3. Сыр");
                    System.out.println("Выберите товар и количество или введите end");
                    String input = scanner.nextLine();
                    if ("end".equals(input)) break;
                    String[] parts = input.split(" ");
                    int number = Integer.parseInt(parts[0]);
                    int count = Integer.parseInt(parts[1]);
                    // System.out.printf("\nВыбран товар: %s, кол-во: %d\n", products[number - 1], count);
                    quantity[number - 1] += count;
                }

                int sumProducts = 0;
                int oneProductSum=0;
                System.out.println("Наименование товара   Количество  Цена/за.ед  Общая стоимость");
                for (int i = 0; i < quantity.length; i++) {
                    oneProductSum= prices[i] * quantity[i];
                    sumProducts+=oneProductSum;
                    System.out.printf("%19s  %11s  %10s  %15s",products[i],quantity[i],prices[i],oneProductSum);
                    System.out.println("");
                }

                System.out.println("Ваша корзина: "+sumProducts);
            }
        }