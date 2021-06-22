import br.univille.estd.list.ArrayList1;
import br.univille.estd.list.ArrayList_backup;
import br.univille.estd.list.Beta;
import br.univille.estd.list.List;

public class Main {
    public static void main(String args[]) { 
        Beta beta = new Beta(10);
        beta.receive("01010001");
        beta.receive("00110001");
        beta.receive("00110001");
        beta.receive("00110001");
        beta.receive("00110001");
        beta.receive("00011001");
        beta.receive("00011001");
        beta.receive("01010001");
        beta.receive("01010001");
        beta.receive("00111001");
    }
}
