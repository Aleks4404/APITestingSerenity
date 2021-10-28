package starter.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.rest.SerenityRest;
import starter.UserModel;

import java.util.List;

public class MathWizStepsUser {

    @Given("^Should send the information to the service \"([^\"]*)\"$")
    public void shouldSendTheInformationToTheService(String url, List<UserModel> createUserList) {

        String body = "{\n" +
                "    \"id\": " + createUserList.get(0).getId() + ",\n" +
                "    \"username\": \" " + createUserList.get(0).getUsername() + " \",\n" +
                "    \"firstName\": \" " + createUserList.get(0).getFirstName() + " \",\n" +
                "    \"lastName\": \" " + createUserList.get(0).getLastName() + " \",\n" +
                "    \"email\": \" " + createUserList.get(0).getEmail() + " \",\n" +
                "    \"password\": \" " + createUserList.get(0).getPassword() + " \",\n" +
                "    \"phone\": \" " + createUserList.get(0).getPhone() + " \",\n" +
                "    \"userStatus\": " + createUserList.get(0).getUserStatus() + " \n" +
                "  }";
        SerenityRest.given().body(body).baseUri(url).header("Content-Type", "application/json").post();
    }

    @Then("^Should check the status of the code (\\d+)$")
    public void shouldCheckTheStatusOfTheCode(int status) {
        SerenityRest.lastResponse().then().statusCode(status);
        System.out.println("Status code: " + SerenityRest.lastResponse().getStatusCode());
    }
}
