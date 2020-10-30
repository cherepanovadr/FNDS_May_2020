import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class NeedForSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//{car}|{mileage}|{fuel}
        //Volkswagen Passat CC|45678|5
        //Drive : Audi A6 : 543 : 47 {car} : {distance} : {fuel}
        int a = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> mileage = new TreeMap<>();
        Map<String, Integer> fuel = new TreeMap<>();
        for (int i = 0; i < a; i++) {
            String[] tokens = scanner.nextLine().split("\\|");
            String carName = tokens[0];
            int carMileage = Integer.parseInt(tokens[1]);
            int carFuel = Integer.parseInt(tokens[2]);
            mileage.put(carName, carMileage);
            fuel.put(carName, carFuel);

        }
        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String[] parts = input.split(" : ");
            String action = parts[0];
            switch (action) {
                case "Drive":
                    String car = parts[1];
                    int distance = Integer.parseInt(parts[2]);
                    int fuelNeeded = Integer.parseInt(parts[3]);
                    if (fuel.get(car) >= fuelNeeded) {
                        int fuelOld = fuel.get(car);
                        int fuelNew = fuelOld - fuelNeeded;
                        fuel.put(car, fuelNew);
                        int oldMil = mileage.get(car);
                        int newMil = oldMil + distance;
                        mileage.put(car, newMil);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, fuelNeeded);

                        if (newMil >= 100000) {
                            System.out.printf("Time to sell the %s!%n",car);
                            mileage.remove(car);
                            fuel.remove(car);
                        }
                    } else {
                        System.out.println("Not enough fuel to make that ride");
                    }
                    break;
                case "Refuel":
                    String carRefuel = parts[1];
                    int fuelRefuel = Integer.parseInt(parts[2]);
                    if ((fuel.get(carRefuel) + fuelRefuel) > 75) {
                        int fuelToTake = 75 - fuel.get(carRefuel);
                        fuel.put(carRefuel, 75);
                        System.out.printf("%s refueled with %s liters%n", carRefuel, fuelToTake);
                    } else {
                        int newLiters = fuel.get(carRefuel) + fuelRefuel;
                        fuel.put(carRefuel, newLiters);
                        System.out.printf("%s refueled with %s liters%n", carRefuel, fuelRefuel);
                    }
                    break;
                case "Revert":
                    String carRevert = parts[1];
                    int km = Integer.parseInt(parts[2]);
                    int newMill = mileage.get(carRevert) - km;
                    if (newMill < 10000) {
                        mileage.put(carRevert, 10000);
                    } else {
                        mileage.put(carRevert, newMill);
                        System.out.printf("%s mileage decreased by %d kilometers%n", carRevert, km);
                    }
                    break;
            }

            input = scanner.nextLine();
        }
      // print all cars in your possession, sorted by their mileage in decscending order,
        // then by their name in ascending order, in the following format:
        //"{car} -> Mileage: {mileage} kms, Fuel in the tank: {fuel} lt."

        mileage
                .entrySet()
                .stream()
                .sorted((aa,b) -> {
                    int dif = b.getValue()- aa.getValue();
                    if (dif == 0){
                        return aa.getKey().compareTo(b.getKey());
                    } else {
                        return dif;
                    }
                })
                .forEach(s-> System.out.println(String.format("%s -> Mileage: %d kms, Fuel in the tank: %d lt.", s.getKey(), s.getValue(), fuel.get(s.getKey()))));

    }
}
