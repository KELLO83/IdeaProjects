package My_absFactory_Pattern;

public class JapanBody implements Body{
        JapanBody(){
            System.out.println("JapanBody Generated");
        }
        @Override
        public String getName() {
            return "JapanBody";
        }
}
