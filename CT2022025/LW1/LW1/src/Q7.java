import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q7 {
    static void main(String[] args) {
        Date now =new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("h : mm :ss a");
        String currenttime=simpleDateFormat.format(now);

        JFrame windows=new JFrame();
        windows.setSize(400,200);
        windows.setTitle(currenttime);
        windows.setVisible(true);

    }
}
