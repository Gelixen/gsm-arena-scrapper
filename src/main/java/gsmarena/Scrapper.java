package gsmarena;

import java.util.List;

import static java.util.Arrays.asList;

public class Scrapper {

    private static final List<String> urls = asList(
            "https://www.gsmarena.com/google_pixel_6-11037.php",
            "https://www.gsmarena.com/google_pixel_6a-11229.php",
            "https://www.gsmarena.com/google_pixel_6_pro-10918.php",
            "https://www.gsmarena.com/xiaomi_mi_10t_lite_5g-10480.php",
            "https://www.gsmarena.com/xiaomi_mi_9_lite-9862.php",
            "https://www.gsmarena.com/oneplus_8t-10420.php",
            "https://www.gsmarena.com/oneplus_8t+_5g-10512.php",
            "https://www.gsmarena.com/oneplus_10_pro-11234.php",
            "https://www.gsmarena.com/oneplus_9_pro-10806.php",
            "https://www.gsmarena.com/oneplus_9-10747.php",
            "https://www.gsmarena.com/oneplus_8_pro-9919.php",
            "https://www.gsmarena.com/oneplus_nord_2_5g-10960.php",
            "https://www.gsmarena.com/oneplus_nord_ce_2_5g-11269.php",
            "https://www.gsmarena.com/oneplus_nord_ce_5g-10944.php",
            "https://www.gsmarena.com/oneplus_nord_n10_5g-10556.php",
            "https://www.gsmarena.com/oneplus_nord-10289.php"
    );

    public static void main(String[] args) {
        new GsmArena(urls).scrape();
    }
}
