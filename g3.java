public class g3{



        private static CofinFin s = new CofinFin();
        public static void main (String[] args){

        s = (new CofinFin(false, new int[1])).complement();

        System.out.println((s).toString());
        }
        }