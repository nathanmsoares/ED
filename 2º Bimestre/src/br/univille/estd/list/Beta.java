package br.univille.estd.list;
import java.util.logging.*;


public class Beta {

    private List<String> dataArray = new ArrayList1<String>();
    private Logger logger = Logger.getLogger("br.univille.estd.list.Beta");
    private int max_packages;
    private boolean seventy_percent_capacity = false;
    private Alpha alpha_receiver;
    

    public Beta(int max_packages){
        this.max_packages = max_packages;
        logger.setLevel(Level.ALL);
        logger.info("Initiating Beta Object");
    }

    public String toBinary(int position, String data){
        logger.info("Converting position "+position+ " and data "+data+" to binary");
        String temp = Integer.toBinaryString(position);
        temp = temp+data;
        temp = "000000000000".substring(temp.length()) + temp;
        logger.info("Binary "+temp);
        return temp;
    }

    public void receive(String data){

        if(dataArray.size() == 0){
            logger.info("Setting package size to binary");
            String position_to_binary = Integer.toBinaryString(this.max_packages);
            String temp = "00000000".substring(position_to_binary.length()) + position_to_binary;
            logger.info("Package binary size "+temp);
            dataArray.add(0, temp);
        }
        // dataArray.add(package_number, data);
        logger.info("Adding binary "+data+" to array");
        dataArray.add(dataArray.size(), data);

        if(seventy_percent_capacity){
            this.send(dataArray.size() -1, this.dataArray.get(dataArray.size() -1));
            if(dataArray.size() == max_packages -1){
                this.send(dataArray.size(), "111111111111");
            }
        }else {
        float percent = (float) dataArray.size()/this.max_packages;
        if(percent >= 0.69 && !seventy_percent_capacity) {
            this.alpha_receiver = new Alpha();
            seventy_percent_capacity = true;
            for(int i = 0; i <= (dataArray.size() -1); i++){
                System.out.println("Entrou aqui");
                this.send(i, this.dataArray.get(i));
            }
           } 
        } 
    }
    public void send(int position, String data){
        int response;
        logger.info("Sending position and binary to Alpha device");
        if(data.equals("111111111111")){
            response = this.alpha_receiver.receiver("111111111111");
        }else{
            String send_data = this.toBinary(position, data);
            response = this.alpha_receiver.receiver(send_data);
        }
        if(response == 1){
            logger.info("Full package received by Alpha sucessfully");
        }else if(response == 0){
            logger.info("Full package received by Alpha was not complete");
        }else if(response == 99){
            logger.info("Package received by Alpha");
        }
    }
}
