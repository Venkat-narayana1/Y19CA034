 class Quadratic {

    public static void main(String[] args) {

        double a = 1, b = 5, c = 6;
        double root1, root2;

        double determinant = b * b - 4 * a * c;

        // condition for real and different roots
        if(determinant > 0) {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);

            System.out.println("root1 " + root1 +" "+"root2" +root2);
        }
        // Condition for real and equal roots
        else if(determinant == 0) {
            root1 = root2 = -b / (2 * a);

            System.out.println("root1 = root2 "+ root1);
        }
        // If roots are not real
        else {
            double realPart = -b / (2 *a);
            double imaginaryPart = Math.sqrt(-determinant) / (2 * a);

            System.out.println("root1  and root2 are less than 0 then roots are not real");
        }
    }
}