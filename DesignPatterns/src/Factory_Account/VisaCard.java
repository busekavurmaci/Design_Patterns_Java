package Factory_Account;

public class VisaCard implements Account{

	@Override
	public String getType() {

		return "Visa card";
	}

	@Override
	public String getCurrency() {

		return "Euro + USD + Rupil";
	}

}
