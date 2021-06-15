package br.univille.estd.list;
import java.lang.Math;

public class Alpha<T> {
	private int capacity;
	private List<String> array;
	private boolean seventy_porcent_sent = false;
	private Beta receiverObject;
	private boolean first_package = true;
	private static int RECEIVED_PACKAGE_COUNTER;
	
	
	public Alpha(int capacity, Beta receiverObject) {
		super();
		this.capacity = capacity;
		array = new ArrayList1<String>(capacity);
		this.receiverObject = receiverObject;
	}
	
	public void receive(String data) {
		
		if(first_package) {
			RECEIVED_PACKAGE_COUNTER = 1;
			String first_package_sent = Integer.toBinaryString(this.capacity);
			first_package_sent = String.format("%012d", first_package_sent);
			array.addFirst(first_package_sent);
			first_package = false;
		}
		if(!seventy_porcent_sent && ((RECEIVED_PACKAGE_COUNTER + 1)/this.capacity >= 0.7)) {
			for(int k = 0; k <= RECEIVED_PACKAGE_COUNTER; k++) {
				this.sendData(this.array.get(k));
			}
			this.seventy_porcent_sent = true;
		}
		array.add(RECEIVED_PACKAGE_COUNTER, data);
		RECEIVED_PACKAGE_COUNTER++;
		if(this.seventy_porcent_sent) {
			this.sendData(this.array.get(RECEIVED_PACKAGE_COUNTER));
		}
	}
	
	public int sendData(String data) {
		int response = this.receiverObject.receive(data);
		return response;
		
	}
}
	
	
	
	
//	for (int i = 0; i < this.capacity; i++) {
//		if(i == 0) {
//			String first_package_sent = Integer.toBinaryString(this.capacity);
//			array.addFirst(first_package_sent);
//		}
////		Add datareceived;
//		array.add(data);
//		if(this.seventy_porcent_sent) {
//			sendData(this.array[i]);
//			continue;
//		}
//		if((i+1)/this.capacity == 0.7) {
//			for(int k = 0; k <= i; k++) {
//				sendData(this.array[k]);
//			}
//			this.seventy_porcent_sent = true;
//
//		}
//
//	}
//	array.add(data);
//}
