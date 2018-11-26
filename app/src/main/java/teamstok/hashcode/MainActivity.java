package teamstok.hashcode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void  main (File file) throws Exception {
        FileReader fileReader = new FileReader(file);
        getDetails(fileReader);
    }

    private static ArrayList<String> getDetails(FileReader fileReader) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        ArrayList<String> arrayList = new ArrayList<>();
        String firstLine = bufferedReader.readLine();

        for ( int i = 0; i< firstLine.length(); i++){
            String[] strings = firstLine.split("\\s");
            arrayList.addAll(Arrays.asList(strings));
        }
        return arrayList;
    }

}
