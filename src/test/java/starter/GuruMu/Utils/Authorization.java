package starter.GuruMu.Utils;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import starter.GuruMu.LoginAPI;

import java.io.Console;
import java.io.File;

public class Authorization {
    public static String EXPIRED_TOKEN = "";

    public String getToken(){
        File jsonRequest = new File(Constant.JSON_REQUEST + "/Login/LoginValid.json");
        Response response = SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(jsonRequest)
                .post(LoginAPI.POST_LOGIN);

        JsonPath jsonPathEvaluator = response.jsonPath();

        return jsonPathEvaluator.get(Constant.DATA_TOKEN);
    }

    public String getTokenSiswa(){
        File jsonRequest = new File(Constant.JSON_REQUEST + "/Login/LoginValidMurid.json");
        Response response = SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(jsonRequest)
                .post(LoginAPI.POST_LOGIN);

        JsonPath jsonPathEvaluator = response.jsonPath();

        return jsonPathEvaluator.get(Constant.DATA_TOKEN);
    }

    public String getTokenGuru(){
        File jsonRequest = new File(Constant.JSON_REQUEST + "/Login/LoginValidGuru.json");
        Response response = SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(jsonRequest)
                .post(LoginAPI.POST_LOGIN);

        JsonPath jsonPathEvaluator = response.jsonPath();

        return jsonPathEvaluator.get(Constant.DATA_TOKEN);
    }

    public String getTokenGuruGet(){
        File jsonRequest = new File(Constant.JSON_REQUEST + "/Login/LoginValidGuruGet.json");
        Response response = SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(jsonRequest)
                .post(LoginAPI.POST_LOGIN);

        JsonPath jsonPathEvaluator = response.jsonPath();

        return jsonPathEvaluator.get(Constant.DATA_TOKEN);
    }

    public String getTokenSiswaGet(){
        File jsonRequest = new File(Constant.JSON_REQUEST + "/Login/LoginValidSiswaGet.json");
        Response response = SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(jsonRequest)
                .post(LoginAPI.POST_LOGIN);

        JsonPath jsonPathEvaluator = response.jsonPath();

        return jsonPathEvaluator.get(Constant.DATA_TOKEN);
    }

    public String getTokenByCustom(String json){
        Response response = SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json)
                .post(LoginAPI.POST_LOGIN);

        JsonPath jsonPathEvaluator = response.jsonPath();
        String token =jsonPathEvaluator.get(Constant.DATA_TOKEN);

        return jsonPathEvaluator.get(Constant.DATA_TOKEN);
    }
}
