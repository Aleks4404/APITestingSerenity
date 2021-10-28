package starter.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import starter.OrderModel;
import net.serenitybdd.rest.SerenityRest;

import java.util.List;

public class MathWizStepsOrder {

    @Given("^Sending information to the service\"([^\"]*)\"$")
    public void iWantToSendSomeInformationToService(String url, List<OrderModel> createOrderList) {
        String body = "{\n" +
                "  \"id\": " + createOrderList.get(0).getId() + ",\n" +
                "  \"petId\": " + createOrderList.get(0).getPetId() + ",\n" +
                "  \"quantity\": " + createOrderList.get(0).getQuantity() + " ,\n" +
                "  \"shipDate\": \" " + createOrderList.get(0).getShipDate() + "\",\n" +
                "  \"status\": \" " + createOrderList.get(0).getStatus() + "\",\n" +
                "  \"complete\": " + createOrderList.get(0).getComplete() + " \n" +
                "}";
        SerenityRest.given().body(body).baseUri(url).header("Content-Type", "application/json").post();
    }

    @Then("^Should check the status of the code (\\d+) for the request$")
    public void iValidateTheStatusCodeForTheRequest(int status) {
        SerenityRest.lastResponse().then().statusCode(status);
        System.out.println("Status code: " + SerenityRest.lastResponse().getStatusCode());
    }
}
