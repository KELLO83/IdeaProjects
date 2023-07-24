package My_absFactory_Pattern;

public class KorBody implements Body{
        KorBody(){
            System.out.println("KorBody Generated");
        }
        @Override
        public String getName() {
            return "KorBody";
        }
}
