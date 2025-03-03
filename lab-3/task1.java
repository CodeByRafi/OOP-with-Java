class Vehicle {
    String makeBy;
    int makingYear;

    public Vehicle(String makeBy, int makingYear) {
        this.makeBy = makeBy;
        this.makingYear = makingYear;
    }
    public void displayVehicleInfo() 
    {
        System.out.println("Make: " + makeBy);
        System.out.println("Year: " + makingYear);
    }

    public boolean isPalindromeYear() 
    {
        int year = makingYear;
        int reversedYear = 0;
        int originalYear = year;

        while (year != 0) 
        {
            int digit = year % 10;
            reversedYear = reversedYear * 10 + digit;
            year /= 10;
        }

        return originalYear == reversedYear;
    }
}

class Car extends Vehicle {
    int numDoors;


    public Car(String makeBy, int makingYear, int numDoors) 
    {
        super(makeBy, makingYear);
        this.numDoors = numDoors;
    }

    @Override
    public void displayVehicleInfo() 
    {
        System.out.println("Car Information:");
        super.displayVehicleInfo();
        System.out.println("Number of doors: " + numDoors);
    }

    @Override
    public boolean isPalindromeYear() 
    {
        return super.isPalindromeYear();
    }
}

class Motorcycle extends Vehicle 
{
    boolean hasSidecar;

    public Motorcycle(String makeBy, int makingYear, boolean hasSidecar) 
    {
        super(makeBy, makingYear);
        this.hasSidecar = hasSidecar;
    }

    // Overridden method to display motorcycle information
    @Override
    public void displayVehicleInfo() {
        System.out.println("Motorcycle Information:");
        super.displayVehicleInfo();
        System.out.println("Has sidecar: " + hasSidecar);
    }

    // Overridden method to check if the motorcycle's manufacturing year is a palindrome
    @Override
    public boolean isPalindromeYear() {
        return super.isPalindromeYear(); // Palindrome check logic is same for both Car and Motorcycle
    }
}

// Main class to demonstrate inheritance and method overriding
public class task1 {
    public static void main(String[] args) {
        // Create instances of Car and Motorcycle
        Car car = new Car("Toyota", 2002, 4);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", 2003, true);

        // Display Car information and check if year is palindrome
        car.displayVehicleInfo();
        if (car.isPalindromeYear()) {
            System.out.println("This Car manufacturing year is a palindrome.\n");
        } else {
            System.out.println("This Car manufacturing year is not a palindrome.\n");
        }

        // Display Motorcycle information and check if year is palindrome
        motorcycle.displayVehicleInfo();
        if (motorcycle.isPalindromeYear()) {
            System.out.println("The Motorcycle manufacturing year is a palindrome.\n");
        } else {
            System.out.println("The Motorcycle manufacturing year is not a palindrome.\n");
        }
    }
}
