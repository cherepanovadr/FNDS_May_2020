package Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> cars = new ArrayList<>();
        List<Truck> trucks = new ArrayList<>();
        int carsPower = 0;
        int truckPower = 0;

        String input = scanner.nextLine();
        while (!input.equalsIgnoreCase("end")) {
            String[] tokens = input.split("\\s+");
            String type = tokens[0];
            String model = tokens[1];
            String color = tokens[2];
            int horsepower = Integer.parseInt(tokens[3]);
            if ("car".equalsIgnoreCase(type)) {
                Car car = new Car(model, color, horsepower);
                cars.add(car);
                carsPower += car.getHorsepower();
            } else if ("truck".equalsIgnoreCase(type)) {
                Truck truck = new Truck(model, color, horsepower);
                trucks.add(truck);
                truckPower += truck.getHorsepower();
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equalsIgnoreCase("close the catalogue")) {
            for (Car car : cars) {
                if (car.getModel().equalsIgnoreCase(input)) {
                    System.out.println(car);
                    break;
                }
            }
            for (Truck truck : trucks) {
                if (truck.getModel().equalsIgnoreCase(input)) {
                    System.out.println(truck);
                    break;
                }


            }
            input = scanner.nextLine();
        }
        if (input.equalsIgnoreCase("close the catalogue")) {
            //Cars have average horsepower of: 413.33.
            //Trucks have average horsepower of: 250.00.
            double avrCAr = carsPower * 1.0 / cars.size();
            double avrTruck = truckPower * 1.0 / trucks.size();
            System.out.printf("Cars have average horsepower of: %.2f.%n", avrCAr);
            System.out.printf("Trucks have average horsepower of: %.2f.%n", avrTruck);


        }

    }

}

