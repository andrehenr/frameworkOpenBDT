#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.steps.definition;

import java.util.UUID;

import org.springframework.test.context.ContextConfiguration;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ${package}.steps.business.StepBusiness;
import net.thucydides.core.annotations.Steps;

@ContextConfiguration("/appcontext.xml")
public class StepDefinition {

	@Steps
	StepBusiness stepB;
	
	@Given("^estou na pagina inicial do site ${symbol_escape}"([^${symbol_escape}"]*)${symbol_escape}"${symbol_dollar}")
	public void estou_na_pagina_inicial_do_site(String url) throws Throwable {
	    stepB.openHome(url);
	}

	@When("^clico em 'Sign in'${symbol_dollar}")
	public void clico_em_Sign_in() throws Throwable {
	    stepB.clicarSignIn();
	}

	@When("^sistema apresenta tela de cadastro${symbol_dollar}")
	public void sistema_apresenta_tela_de_cadastro() throws Throwable {
	    stepB.validarTelaDeCadastro();
	}

	@When("^preencho 'Email address' ${symbol_escape}"([^${symbol_escape}"]*)${symbol_escape}"${symbol_dollar}")
	public void preencho_Email_address(String emailAddress) throws Throwable {
	    String[] split = emailAddress.split("@");
	    UUID randomUUID = UUID.randomUUID();
		stepB.preencherEmailAddress(split[0] + randomUUID + "@" + split[1]);
	}

	@When("^clico no botão 'Create an account'${symbol_dollar}")
	public void clico_no_botão_Create_an_account() throws Throwable {
	    stepB.clicarBotaoCreateAnAccount();
	}

	@When("^sistema apresenta tela 'YOUR PERSONAL INFORMATION'${symbol_dollar}")
	public void sistema_apresenta_tela_YOUR_PERSONAL_INFORMATION() throws Throwable {
	    stepB.validarTelaPersonalInformation();
	}

	@When("^preencho radio-button 'Title' ${symbol_escape}"([^${symbol_escape}"]*)${symbol_escape}"${symbol_dollar}")
	public void preencho_radio_button_Title(String radioButtonTitle) throws Throwable {
	    stepB.preencherRadioButtonTitle(radioButtonTitle);
	}

	@When("^preencho 'First name${symbol_escape}${symbol_escape}*' ${symbol_escape}"([^${symbol_escape}"]*)${symbol_escape}"${symbol_dollar}")
	public void preencho_First_name(String firstName) throws Throwable {
	    stepB.preencherFirstName(firstName);
	}

	@When("^preencho 'Last name${symbol_escape}${symbol_escape}*' ${symbol_escape}"([^${symbol_escape}"]*)${symbol_escape}"${symbol_dollar}")
	public void preencho_Last_name(String lastName) throws Throwable {
	    stepB.preencherLastName(lastName);
	}

	@When("^preencho 'Email${symbol_escape}${symbol_escape}*' ${symbol_escape}"([^${symbol_escape}"]*)${symbol_escape}" da tela de cadastro${symbol_dollar}")
	public void preencho_Email_da_tela_de_cadastro(String emailTelaCadastro) throws Throwable {
		String[] split = emailTelaCadastro.split("@");
	    UUID randomUUID = UUID.randomUUID();
	    stepB.preencherEmailTelaDeCadastro(split[0] + randomUUID + "@" + split[1]);
	}

	@When("^preencho 'Password${symbol_escape}${symbol_escape}*' ${symbol_escape}"([^${symbol_escape}"]*)${symbol_escape}"${symbol_dollar}")
	public void preencho_Password(String password) throws Throwable {
	    stepB.preencherPassword(password);
	}

	@When("^seleciono dia 'Date of Birth' ${symbol_escape}"([^${symbol_escape}"]*)${symbol_escape}"${symbol_dollar}")
	public void seleciono_dia_Date_of_Birth(String dayDateOfBirth) throws Throwable {
	    stepB.selecionarDiaDateOfBirth(dayDateOfBirth);
	}

	@When("^seleciono mês 'Date of Birth' ${symbol_escape}"([^${symbol_escape}"]*)${symbol_escape}"${symbol_dollar}")
	public void seleciono_mês_Date_of_Birth(String monthDateOfBirth) throws Throwable {
	    stepB.selecionarMesDateOfBirth(monthDateOfBirth);
	}

	@When("^seleciono ano 'Date of Birth' ${symbol_escape}"([^${symbol_escape}"]*)${symbol_escape}"${symbol_dollar}")
	public void seleciono_ano_Date_of_Birth(String yearDateOfBirth) throws Throwable {
	    stepB.selecionarAnoDateOfBirth(yearDateOfBirth);
	}

	@When("^preencho check-box 'Sign up for our newsletter!' ${symbol_escape}"([^${symbol_escape}"]*)${symbol_escape}"${symbol_dollar}")
	public void preencho_check_box_Sign_up_for_our_newsletter(String newsletter) throws Throwable {
	    stepB.preencherCheckBoxNewsletter(newsletter);
	}

	@When("^preencho check-box 'Receive special offers from our partners!' ${symbol_escape}"([^${symbol_escape}"]*)${symbol_escape}"${symbol_dollar}")
	public void preencho_check_box_Receive_special_offers_from_our_partners(String partners) throws Throwable {
	    stepB.preencherCheckBoxOffersPartners(partners);
	}

	@When("^preencho 'Address${symbol_escape}${symbol_escape}*' ${symbol_escape}"([^${symbol_escape}"]*)${symbol_escape}"${symbol_dollar}")
	public void preencho_Address(String address) throws Throwable {
	    stepB.preencherAddress(address);
	}

	@When("^preencho 'City${symbol_escape}${symbol_escape}*' ${symbol_escape}"([^${symbol_escape}"]*)${symbol_escape}"${symbol_dollar}")
	public void preencho_City(String city) throws Throwable {
	    stepB.preencherCity(city);
	}

	@When("^seleciono'State${symbol_escape}${symbol_escape}*' ${symbol_escape}"([^${symbol_escape}"]*)${symbol_escape}"${symbol_dollar}")
	public void seleciono_State(String state) throws Throwable {
	    stepB.selecionarState(state);
	}

	@When("^preencho 'Zip/Postal Code${symbol_escape}${symbol_escape}*' ${symbol_escape}"([^${symbol_escape}"]*)${symbol_escape}"${symbol_dollar}")
	public void preencho_Zip_Postal_Code(String zipCode) throws Throwable {
	    stepB.preencherZipCode(zipCode);
	}

	@When("^seleciono'Country${symbol_escape}${symbol_escape}*' ${symbol_escape}"([^${symbol_escape}"]*)${symbol_escape}"${symbol_dollar}")
	public void seleciono_Country(String country) throws Throwable {
	    stepB.selecionarCountry(country);
	}

	@When("^preencho 'Additional information${symbol_escape}${symbol_escape}*' ${symbol_escape}"([^${symbol_escape}"]*)${symbol_escape}"${symbol_dollar}")
	public void preencho_Additional_information(String information) throws Throwable {
	    stepB.preencherAdditionalInformation(information);
	}

	@When("^preencho 'Mobile phone${symbol_escape}${symbol_escape}*' ${symbol_escape}"([^${symbol_escape}"]*)${symbol_escape}"${symbol_dollar}")
	public void preencho_Mobile_phone(String mobilePhone) throws Throwable {
	    stepB.preencherMobilePhone(mobilePhone);
	}

	@When("^preencho 'Assign an address alias for future reference${symbol_escape}${symbol_escape}. ${symbol_escape}${symbol_escape}*' ${symbol_escape}"([^${symbol_escape}"]*)${symbol_escape}"${symbol_dollar}")
	public void preencho_Assign_an_address_alias_for_future_reference(String addressAlias) throws Throwable {
	    stepB.preencherAssignAddressAlias(addressAlias);
	}

	@When("^clico no botão 'Register >'${symbol_dollar}")
	public void clico_no_botão_Register() throws Throwable {
	    stepB.clicarBotaoRegister();
	}

	@Then("^sistema apresente tela 'MY ACCOUNT'${symbol_dollar}")
	public void sistema_apresente_tela_MY_ACCOUNT() throws Throwable {
	    stepB.validarTelaMyAccount();
	}
}
