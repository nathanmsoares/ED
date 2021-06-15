package br.univille.estd.list;

public class Beta{
	private String receiver;
	private int capacity;
	private boolean final_package_received = false;
	private List<Integer> array;
	private int size_new_array;
	
	public Beta() {
		
	}

	public int receive(String data) {
		String identifier = data.substring(0, 5);
		if(identifier == "0000") {
			size_new_array = Integer.parseInt(data.substring(5), 2);
			array = new ArrayList1<Integer>(size_new_array);
		}else if(data == "111111111111") {
			this.final_package_received = true;
			if(array.size() != size_new_array){
				return 0;
			}else if(array.size() == size_new_array) {
				return 1;
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
	
	
}
