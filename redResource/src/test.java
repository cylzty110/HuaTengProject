import net.sf.json.JSONArray;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * 鎻忚堪:
 *
 * @author Administrator
 * @create 2018-06-27 17:49
 */
public class test {

    public static void main(String[] args){
    	
    	List<aaa> list = new ArrayList<>();
        aaa bbb = new aaa();
        bbb.setScrPdEcd("1");
        bbb.setTableName("1");
        bbb.setTaskBatch("1");
        bbb.setUploadBatch("1");
        list.add(bbb);
        

       
        JSONArray array = JSONArray.fromObject(list);
        String s = array.toString();
        s = "{'data'='12,135305,A02913006,220000000,04,1,1,04,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1'}";
        System.out.println(s);

        BufferedReader reader = null;
        String result = "";
        try {
            URL realUrl = new URL("http://10.60.103.125:8080/redResource/risk/predict");
            HttpURLConnection conn = (HttpURLConnection)realUrl.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setDoInput(true);
            //conn.setRequestProperty("Content-Type","application/json");
            OutputStream out = new DataOutputStream(conn.getOutputStream()) ;
            conn.connect();
			out.write("data:12,135305,A02913006,220000000,04,1,1,04,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1".getBytes());
			out.flush();
			out.close();
			InputStream is = conn.getInputStream();
			reader = new BufferedReader(new InputStreamReader(is));
			String line;
			while((line = reader.readLine()) != null){
				result += line;
			}
            System.out.println(result);
        } catch (Exception e){

        }
        
        
    }

}
