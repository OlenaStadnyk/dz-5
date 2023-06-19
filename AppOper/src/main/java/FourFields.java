public class FourFields {
    private int field1;
    private int field2;
    private int field3;
    private int field4;

    public FourFields(int value1, int value2, int value3, int value4) {
        field1 = value1;
        field2 = value2;
        field3 = value3;
        field4 = value4;
    }

    public void printFields() {
        System.out.println("Field 1: " + field1);
        System.out.println("Field 2: " + field2);
        System.out.println("Field 3: " + field3);
        System.out.println("Field 4: " + field4);

        int sum12 = field1 + field2;
        int sum34 = field3 + field4;

        System.out.println("Sum of Field 1 and Field 2: " + sum12);
        System.out.println("Sum of Field 3 and Field 4: " + sum34);

        boolean isSum12Smaller = sum12 < sum34;
        System.out.println("Is the 1st sum smaller? = " + isSum12Smaller);

        if (!isSum12Smaller) {
            boolean isSum12NotSmaller = !isSum12Smaller;
        }

        sum12 += 1;
        sum34 -= 2;

        System.out.println("Increased 1st sum by 1: " + sum12);
        System.out.println("Reduced 2nd sum by 2: " + sum34);


        boolean isSum12Smallernew = sum12 > sum34;
        System.out.println("Is the 1st sum larger? = " + isSum12Smallernew);

        if (!isSum12Smallernew) {
            boolean isSum12NotSmaller = !isSum12Smallernew;
        }

        boolean isAnySumMultipleOf2 = (sum12 % 2 == 0) || (sum34 % 2 == 0);
        System.out.println("Is at least one sum a multiple of 2? = " + isAnySumMultipleOf2);


    }

    public static void main(String[] args) {
        FourFields fields = new FourFields(7, 2, 17, 3);
        fields.printFields();
    }
}