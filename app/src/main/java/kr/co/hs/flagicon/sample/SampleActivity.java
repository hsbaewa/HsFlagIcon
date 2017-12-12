package kr.co.hs.flagicon.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.os.LocaleListCompat;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Currency;
import java.util.Locale;

import kr.co.hs.app.HsActivity;
import kr.co.hs.flagicon.Country;
import kr.co.hs.flagicon.Flag;
import kr.co.hs.util.Logger;

/**
 * Created by hsbaewa on 2017. 11. 17..
 */

public class SampleActivity extends HsActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);


        ImageView imageView = findViewById(R.id.ImageView);
        TextView textView = findViewById(R.id.TextView);
        TextView textViewCurrencyName = findViewById(R.id.TextViewCurrencyName);

        Country country = new Country(Country.getAvailableCountries()[40]);
        Flag flag = new Flag(country);
        imageView.setImageResource(flag.getFlagResourceFlat());

        textView.setText(country.getCountryNameResource());

        textViewCurrencyName.setText(country.getCountryCurrencyNameResource());
    }
}
