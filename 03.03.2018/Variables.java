package DIT1;

public class Variables {
    //Создать по одной переменной каждого типа.
    public static void main (String [] args) {
        char s =118;
        System.out.println(s);
    }

    public static class Variables1 {
        public static void main (String [] args) {
            boolean d = true;
            System.out.println(d);
        }

        public static class Variables2 {
            public static void main (String [] args) {
                double b = 3.4205;
                System.out.println(b);
            }

            public static class Variables3 {
                public static void main (String [] args) {
                    float p = (float) (3.4*10f);
                    float q = 2.654f;
                    System.out.println(p+q);
                }

                public static class Variables4 {
                    public static void main (String [] args) {
                        long f = 757453423;
                        System.out.println(f);
                    }

                    public static class Variables5 {
                        public static void main (String [] args) {
                            int p = 1208374920;
                            System.out.println(p);
                        }

                        public static class Variables6 {
                            public static void main (String [] args) {
                                short q = 12075;
                                System.out.println(q);
                            }

                            public static class Variables7 {
                                public static void main (String [] args){
                                    byte s = 120;
                                    System.out.println (s);

                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
