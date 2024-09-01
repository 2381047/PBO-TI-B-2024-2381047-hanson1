public class TipeDataString {
    public static void main(String[] args) {
        String firstName = "Stephan";
        String lastName = "Nainggolan";
        String fullName = firstName + " " + lastName;
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(" ").concat(lastName));
        System.out.println(fullName.toUpperCase());

        System.out.println(fullName.charAt(6));
        System.out.println(fullName.contains("Nainggolan"));

    }
}
