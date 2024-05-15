package document;

class ImageDocument extends Document {
	public ImageDocument(String title, String encodingType) {
		super(title, encodingType);
	}

	@Override
	void open() {
		System.out.println("\n\n\nOpening Image document: " + this.getTitle());
	}

	@Override
	void encode() {
		System.out.println(
				"Encoding Image document: " + this.getTitle() + " using " + this.getEncodingType() + " encoding");
	}

	@Override
	void decode() {
		System.out.println(
				"Decoding Image document: " + this.getTitle() + " using " + this.getEncodingType() + " encoding");
	}
}