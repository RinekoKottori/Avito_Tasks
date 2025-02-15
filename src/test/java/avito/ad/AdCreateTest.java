package avito.ad;

import io.qameta.allure.junit4.DisplayName;
import io.restassured.response.Response;
import org.junit.Test;

public class AdCreateTest {
    AdShared adShared = new AdShared();
    AdCheck adCheck = new AdCheck();

    @Test
    @DisplayName("Test that creates an ad with validate body results OK")
    public void checkCreationNewAd(){
        var ad = Ad.randomAd();
        Response response = adShared.createNewAd(ad);
        adCheck.getOkForCreatingNewAd(response);
    }

}
