package Factory_Account;

public class MasterCard implements Account{

	@Override
	public String getType() {

		return "Master card";
	}

	@Override
	public String getCurrency() {

		return "USD";
	}

}
