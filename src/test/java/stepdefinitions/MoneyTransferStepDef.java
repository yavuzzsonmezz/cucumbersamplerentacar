package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MoneyTransferStepDef {
    @Given("The account balance is ${int}")
    public void the_account_balance_is_$(Integer int1) {

    }

    @Given("the card is valid")
    public void the_card_is_valid() {

    }

    @Given("the machine contains enough money")
    public void the_machine_contains_enough_money() {

    }

    @When("the Account Holder requests ${int}")
    public void the_account_holder_requests_$(Integer int1) {

    }

    @Then("the ATM should dispense ${int}")
    public void the_atm_should_dispense_$(Integer int1) {

    }

    @Then("the account balance should be ${int}")
    public void the_account_balance_should_be_$(Integer int1) {

    }

    @Then("the card should be returned")
    public void the_card_should_be_returned() {

    }


}
