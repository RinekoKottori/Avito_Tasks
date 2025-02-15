package avito;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class Shared {
    public static final String BASE_URI = "https://qa-internship.avito.com";
    public static final String CREATE_AD = "/api/1/item";
    public static final String GET_AD_INFO_BY_ITEM_ID = "/api/1/item/:id";
    public static final String GET_AD_STATISTIC_BY_ID = "/api/1/statistic/:id";
    public static final String GET_ADS_BY_SELLER_ID = "/api/1/:sellerID/item";


public RequestSpecification spec(){
    return RestAssured.given()
    .contentType(io.restassured.http.ContentType.JSON)
    .baseUri(BASE_URI);
}

}
