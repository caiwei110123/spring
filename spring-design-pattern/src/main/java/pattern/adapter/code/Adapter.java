package pattern.adapter.code;

public class Adapter extends Target{
	OthersPlacesMehtods coma = new OthersPlacesMehtods();

	@Override
	public void b() {
		// TODO Auto-generated method stub
		super.b();
		coma.a();
	}
	
}
