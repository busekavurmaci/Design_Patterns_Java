package Factory_Account;

public class MaestroCard implements Account{

	@Override
	public String getType() {

		return "Maestro Card";
	}

	@Override
	public String getCurrency() {

		return "Euro + USD + Lira";
	}

}
