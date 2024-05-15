package document;

abstract class Document {
	private String title;
	private String encodingType;

	public Document(String title, String encodingType) {
		this.title = title;
		this.encodingType = encodingType;
	}

	abstract void open();

	abstract void encode();

	abstract void decode();

	public void edit() {
		System.out.println("Editing the File named " + getTitle());
	}

	public void save() {
		System.out.println("Saving the File named " + getTitle());
	}

	public String getTitle() {
		return title;
	}

	public String getEncodingType() {
		return encodingType;
	}
}
