package br.univille.estd.list;
import java.util.logging.*;

public class Alpha {
    private List<String> dataArray = new ArrayList1<String>();
    private String last_package = "111111111111";
    private boolean last_package_bool = false;
    private Logger logger = Logger.getLogger("br.univille.estd.list.Alpha");
    private float fullNumber;
    private int[] values_int;

    public Alpha(){

    }

    public float get_values_in_order(List<String> array){
        int size = Integer.parseInt(array.get(0).substring(4), 2);
        values_int = new int[size-2];
        for(int i = 1; i < array.size()-1; i++){
            logger.info("Converting binaries to Integers");
            int temp_position = Integer.parseInt(array.get(i).substring(0, 4), 2);
            logger.info("temp_position equals "+ temp_position);
            int temp_value = Integer.parseInt(array.get(i).substring(4), 2);
            logger.info("temp_value equals " + temp_value);
            values_int[temp_position-1] = temp_value;
        }
        for(int i = 0; i < values_int.length; i++){
            fullNumber += values_int[i];
        }
        logger.warning("The fullNummber is " + fullNumber);
        return fullNumber;
    }

    public int receiver(String data){
        logger.info("Adding data " + data +" to temporary array");
        dataArray.add(dataArray.size(), data);
        if(data.equals(last_package) && !last_package_bool){
            logger.info("Received last package");
            last_package_bool = true;
            logger.info("Testing full package");
            String temp_value = dataArray.get(0);
            temp_value = temp_value.substring(4);
            int int_value = Integer.parseInt(temp_value, 2);

            this.get_values_in_order(this.dataArray);
            if( int_value != dataArray.size() ){
                return 0;
            }else{
                return 1;
            }
        }else if(last_package_bool){
            logger.warning("Last Package already received");
            return 100;
        }
        
        return 99;

    }
}
