package document;

class PDFDocument extends Document {
	public PDFDocument(String title, String encodingType) {
		super(title, encodingType);
	}

	@Override
	void open() {
		System.out.println("\n\n\nOpening PDF document: " + this.getTitle());
	}

	@Override
	void encode() {
		System.out.println(
				"Encoding PDF document: " + this.getTitle() + " using " + this.getEncodingType() + " encoding");
	}

	@Override
	void decode() {
		System.out.println(
				"Decoding PDF document: " + this.getTitle() + " using " + this.getEncodingType() + " encoding");
	}
}
