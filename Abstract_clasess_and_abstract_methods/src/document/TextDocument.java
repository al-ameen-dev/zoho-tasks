package document;

class TextDocument extends Document {
	public TextDocument(String title, String encodingType) {
		super(title, encodingType);
	}

	@Override
	void open() {
		System.out.println("\n\n\nOpening Text document: " + this.getTitle());
	}

	@Override
	void encode() {
		System.out.println(
				"Encoding Text document: " + this.getTitle() + " using " + this.getEncodingType() + " encoding");
	}

	@Override
	void decode() {
		System.out.println(
				"Decoding Text document: " + this.getTitle() + " using " + this.getEncodingType() + " encoding");
	}
}
