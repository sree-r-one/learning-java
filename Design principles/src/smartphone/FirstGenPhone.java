package smartphone;

public class FirstGenPhone implements IPhone{

	public FirstGenPhone() {
	}

	@Override
	public void makePhoneCall() {
		throw new UnsupportedOperationException("Unimplemented method 'makePhoneCall'");
	}

	@Override
	public void encryptOutgoingSound() {
		throw new UnsupportedOperationException("Unimplemented method 'encryptOutgoingSound'");
	}

	@Override
	public void decipherIncomingSound() {
		throw new UnsupportedOperationException("Unimplemented method 'decipherIncomingSound'");
	}

}
