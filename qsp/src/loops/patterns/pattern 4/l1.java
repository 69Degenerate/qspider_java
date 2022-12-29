class l1{
        public static void main(String[] args) {
        int a=5,b=a;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if (b<=j) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            b--;
            System.out.println();
        }
    }
}