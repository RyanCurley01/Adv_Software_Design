package ie.atu.sw;

public class ComStoredSequenceListAdapter implements SequenceListStore{
	private StoredSequenceContext ssc = null;

	public ComStoredSequenceListAdapter(CharSequence s) {
		ssc = new StoredSequenceContext(s);
	}
	
	@Override
	public void open(CharSequence fileName) throws Exception {
		ssc.open(fileName);
	}

	@Override
	public void store(CharSequence[] list) throws Exception {
		for (CharSequence cs : list) {
			ssc.store(cs);
		}
	}

	@Override
	public void close() throws Exception {
		ssc.close();		
	}	
}
