public class TipeDataArray {
    public static void main(String[] args) {
        int[] arrayInteger = new int[3];
        arrayInteger[0] = 40;
        arrayInteger[1] = 50;
        arrayInteger[2] = 70;

        int[] arrayInteger2 = new int[] {40, 50, 70};
        arrayInteger2[1] = 50;
        System.out.println(arrayInteger2);

        int [][] arrayInteger3 = new int [][] {{40, 50, 70}, {90, 100, 120}, {90, 100, 120}};
        System.out.println(arrayInteger3[0][2] + arrayInteger3[1][2]);

        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = 40;
        arrayOfObject[1] = "Stephan Nainggolan";
        arrayOfObject[2] = 40L;
        System.out.println(arrayOfObject[1]);
    }
}
