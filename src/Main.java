import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;

import static java.lang.Integer.parseInt;
public class Main {
    public static void main(String[] args) {

        secondCourses menu = new secondCourses();

        Beverages menuBeverages = new Beverages();

        ArrayList<String> order = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        printMenu();
        int number = parseInt(scanner.nextLine());

        ChoseSelectionOfMenu(number, menu, menuBeverages, order, scanner);
    }
    static void printMenu () {
        System.out.println("Restaurant Team 3 ");
        System.out.println("Menu: ");
        System.out.println("1 -> Appetizers");
        System.out.println("2 -> Main courses");
        System.out.println("3 -> Second Dishes");
        System.out.println("4 -> Beverages");
        System.out.println("5 -> Dessert");
        System.out.println("0 -> To end your order");
        System.out.println("finish -> Exit the current page");
        System.out.println("Insert the number referred to the selection you want to visit");
    }

    static void ChoseSelectionOfMenu (Integer input, secondCourses menu, Beverages menuBeverages, ArrayList<String> order, Scanner scanner){

        while (input != 0) {

            switch (String.valueOf(input)) {
                case "1":
                    System.out.println("Appetizers");
                    break;
                case "2":
                    System.out.println("Main courses");
                    break;
                case "3":
                    System.out.println("Second Dishes");
                    System.out.println("1 ->" +menu.first + " " + menu.firstPrice + "€");
                    System.out.println("2 ->" + menu.second + " " + menu.secondPrice + "€");
                    System.out.println("3 ->" +menu.third + " " + menu.thirdPrice + "€");
                    System.out.println("4 ->" + menu.fourth + " " + menu.fourthPrice + "€");
                    System.out.println("5 ->" +menu.last + " " + menu.lastPrice + "€");
                    String thirdInput = scanner.nextLine();

                    while (!Objects.equals(thirdInput, "0")){

                        switch (String.valueOf(thirdInput)){

                            case "1":
                                order.add(menu.first);
                                System.out.println("Your order now is : " + order);
                                thirdInput = "0";
                                break;

                            case "2" :
                                order.add(menu.second);
                                System.out.println("Your order now is : " + order);
                                thirdInput = "0";
                                break;

                            case "3":
                                order.add(menu.third);
                                System.out.println("Your order now is : " + order);
                                thirdInput = "0";
                                break;

                            case "4" :
                                order.add(menu.fourth);
                                System.out.println("Your order now is : " + order);
                                thirdInput = "0";
                                break;

                            case "5":
                                order.add(menu.last);
                                System.out.println("Your order now is : " + order);
                                thirdInput = "0";
                                break;

                            case "end":
                                System.out.println("Beverages added to order :)");
                                thirdInput = "0";
                                printMenu();
                                input = scanner.nextInt();
                                break;
                            default:
                                System.out.println();
                                thirdInput = "0";
                                break;
                        }

                    }
                    break;
                case "4":
                    System.out.println("Beverages");
                    System.out.println("1 ->" +menuBeverages.cocaCola + " " + menuBeverages.priceCoca + "€");
                    System.out.println("2 ->" +menuBeverages.sprite + " " + menuBeverages.priceSprite + "€");
                    System.out.println("3 ->" +menuBeverages.sevenUp + " " + menuBeverages.priceSevenUp + "€");
                    System.out.println("4 ->" +menuBeverages.sparklingWater + " " + menuBeverages.priceSparklingWater + "€");
                    System.out.println("5 ->" +menuBeverages.stillWater + " " + menuBeverages.priceStillWater + "€");
                    System.out.println("finish -> Exit");
                    System.out.println();
                    System.out.println("Insert the number referred to the option you like");
                    String secondInput = scanner.nextLine();
                        while (!Objects.equals(secondInput, "0")){

                        switch (String.valueOf(secondInput)){

                            case "1":
                                order.add(menuBeverages.cocaCola);
                                System.out.println("Your order now is : " + order);
                                secondInput = "0";
                                break;
                            case "2" :
                                order.add(menuBeverages.sprite);
                                System.out.println("Your order now is : " + order);
                                secondInput = "0";
                                break;
                            case "3":
                                order.add(menuBeverages.sevenUp);
                                System.out.println("Your order now is : " + order);
                                secondInput = "0";
                                break;
                            case "4" :
                                order.add(menuBeverages.sparklingWater);
                                System.out.println("Your order now is : " + order);
                                secondInput = "0";
                                break;
                            case "5":
                                order.add(menuBeverages.stillWater);
                                System.out.println("Your order now is : " + order);
                                secondInput = "0";
                                break;
                            case "end":
                                System.out.println("Beverages added to order :)");
                                secondInput = "0";
                                printMenu();
                                input = scanner.nextInt();
                                break;
                            default:
                                System.out.println();
                                secondInput = "0";
                                break;
                            }
                            System.out.println("Your order now is : " + order);
                        }
                    break;
                case "5":
                    System.out.println("Dessert");

                case "finish":
                    System.out.println("Thanks for your order");

                default:
                    System.out.println("The number is invalid");
                    break;
            }
        }
        System.out.println("You have finished your order");
}
}