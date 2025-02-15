package avito.ad;

import static java.net.HttpURLConnection.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.Matchers.hasKey;

import io.qameta.allure.Step;
import io.restassured.response.Response;

public class AdCheck {

    @Step("Check that ad is created and get item id")
    public String getOkForCreatingNewAd(Response response){
        String itemId = response.then()
                .assertThat()
                .statusCode(HTTP_OK)
                .and().body("status", startsWith("Сохранили объявление -"))
                .and().extract().body().path("status");
        return itemId.substring(23);
    }

    @Step("Check that get info about ad by item id is correct")
    public void getOkForGetInfoAboutAdByItemId(Response response, String itemId){
        response.then()
                .assertThat()
                .statusCode(HTTP_OK)
                .and().body("[0].id", equalTo(itemId));
    }

    @Step("Check that get statistic about ad by item id is correct")
    public void getOkForGetStatisticAboutAdByItemId(Response response){
        response.then()
                .assertThat()
                .statusCode(HTTP_OK)
                .and().body("[0]", hasKey("contacts"))
                .and().body("[0]", hasKey("likes"))
                .and().body("[0]", hasKey("viewCount"));
    }


    @Step("Check that get info about ads by seller id is correct")
    public void getOkForGetInfoAboutAdBySellerId(Response response, Integer sellerId){
        response.then()
                .assertThat()
                .statusCode(HTTP_OK)
                .and().body("[0]", hasKey("createdAt"))
                .body("[0]", hasKey("id"))
                .body("[0]", hasKey("name"))
                .body("[0]", hasKey("price"))
                .body("[0]", hasKey("sellerId"))
                .body("[0]", hasKey("statistics"))
                .body("[0].statistics", hasKey("contacts"))
                .body("[0].statistics", hasKey("likes"))
                .body("[0].statistics", hasKey("viewCount"))
                .body("sellerId", hasItems(sellerId));
    }


    @Step("Check that body is correct when get info about ads by seller id")
    public void getCorrectBodyResponseForGetInfoAboutAdBySellerId(Response response, String itemId, String name, Integer price){
        response.then()
                .assertThat()
                .body("id", hasItem(itemId))
                .and()
                .body("name", hasItem(name))
                .and()
                .body("price", hasItem(price));
    }

    @Step("Check that got BadRequest 400")
    public void getBadRequestForCreateAd(Response response){
        response.then()
                .assertThat()
                .statusCode(HTTP_BAD_REQUEST)
                .body("$", hasKey("result"))
                .body("$", hasKey("status"));
    }

    @Step("Check that got Not Found 404")
    public void getNotFoundResponseWhenGetInfo(Response response) {
        response.then().log().all()
                .assertThat()
                .statusCode(HTTP_NOT_FOUND)
                .body("$", hasKey("result"))
                .body("$", hasKey("status"));
    }

    @Step("Check that got Server Error 500")
    public void getServerErrorWhenGetInfo(Response response){
        response.then()
                .assertThat()
                .statusCode(HTTP_SERVER_ERROR)
                .body("$", hasKey("result"))
                .body("$", hasKey("status"));
    }

    @Step("Check that got Bad Request 400 by seller Id")
    public void getBadRequestWhenGetInfoBySellerId(Response response) {
        response.then()
                .assertThat()
                .statusCode(HTTP_BAD_REQUEST)
                .body("$", hasKey("result"))
                .body("$", hasKey("status"));
    }
}
