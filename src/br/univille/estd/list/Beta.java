package br.univille.estd.list;

public class Beta{
	private String receiver;
	private int capacity;
	private boolean final_package_received = false;
	private ArrayList1<Integer> array;
	private int size_new_array;
	
	public Beta() {
		
	}

	public int receive(String data) {
		String identifier = data.substring(0, 5);
		if(identifier == "0000") {
			this.size_new_array = Integer.parseInt(data.substring(5), 2);
			array = new ArrayList1<Integer>(this.size_new_array);
		}else if(data == "111111111111") {
			this.final_package_received = true;
			if(array.size() != size_new_array){
				return 0;
				}
			}else if(final_package_received){
				return 1;
			}else {
				try {
					array.add(array.size(), Integer.parseInt(data.substring(5), 2));
					return 99;
				}
				catch (Exception e) {
					System.out.println("Something went wrong " + e);
					return 0;
				}
			}
		return 1;
	}
	
	public void buffer_result() {
		float result = 0f; 
		for (int i = 0; i < this.size_new_array; i++) {
			result += array.get(i);
		}
		System.out.println("Result is " + result);
	}
	
}
