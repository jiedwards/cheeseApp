package helloworld.advprog.mmu.ac.uk.mmucheeseapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.net.URL;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView cheeseN = findViewById(R.id.cheeseName);
        TextView cheeseD = findViewById(R.id.cheeseDescription);
        ImageView cheeseImage = (ImageView) findViewById(R.id.imageViewCheese);


        // get the intent
        Bundle extras = getIntent().getExtras();
// create a cheese object from the cheese object that was passed over from
// the MainActivity. Notice you use the key ('cheese') to retrieve the value/variable needed.
                Cheese theCheese = (Cheese) extras.get("cheese");
        System.out.println("received from the intent: "+theCheese.getName());

        cheeseN.setText(theCheese.getName());
        cheeseD.setText(theCheese.getDetails());

        String cheeseImageName = theCheese.getName().toLowerCase();
        cheeseImageName = ....;
        String imageURL = "http://radikaldesign.co.uk/sandbox/cheese_images/"+cheeseImageName+".jpg";

        try {
            URL url = new URL(imageURL);
            System.out.println(url);
            Bitmap bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());
            cheeseImage.setImageBitmap(bmp);
        }
        catch(IOException e) {
            e.printStackTrace();
        }

    }
}
