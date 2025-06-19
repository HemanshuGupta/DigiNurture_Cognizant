public class TestBuilderPattern {
    public static void main(String[] args) {
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB")
                                   .build();
        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB")
                                     .setStorage("2TB SSD")
                                     .build();
        Computer officeComputer = new Computer.Builder("AMD Ryzen 5", "16GB")
                                     .setStorage("512GB SSD")
                                     .build();
        System.out.println("Basic Computer: " + basicComputer);
        System.out.println("Gaming Computer: " + gamingComputer);
        System.out.println("Office Computer: " + officeComputer);
    }
}
