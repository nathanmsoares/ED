import br.univille.estd.list.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beta beta = new Beta();
		Alpha alpha = new Alpha(10, beta);
		alpha.receive("000000001010");
		alpha.receive("000110100100");
		alpha.receive("001010011110");
		alpha.receive("001110101010");
		alpha.receive("010010101010");
		alpha.receive("010110101111");
		alpha.receive("011010101010");
		alpha.receive("011100000001");
		alpha.receive("011100000001");
		alpha.receive("100011111110");
		alpha.receive("100111111110");
		alpha.receive("111111111111");
		alpha.receive("101000000010");
	}

}
