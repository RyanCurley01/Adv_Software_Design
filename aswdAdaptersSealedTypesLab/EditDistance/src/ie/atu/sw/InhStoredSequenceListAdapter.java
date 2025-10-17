package ie.atu.sw;

public class InhStoredSequenceListAdapter extends StoredSequenceContext implements SequenceListStore{

	public InhStoredSequenceListAdapter(CharSequence s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void store(CharSequence[] list) throws Exception {
		for (CharSequence charSequence : list) {
			super.store(charSequence);
		}
		
	}

}
