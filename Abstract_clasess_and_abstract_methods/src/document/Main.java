package document;

/*
Create 'Document' abstract class. Create subclasses like PDFDocument, TextDocument, ImageDocument, etc.
Create abstract methods and concrete methods and demonstrate how they work.
 */
public class Main {
	public static void main(String[] args) {
		Document pdfDocument = new PDFDocument("Sample.pdf", "AES");
        pdfDocument.open();
        pdfDocument.decode();
        pdfDocument.edit();
        pdfDocument.encode();
        pdfDocument.save();
        
        Document textDocument = new TextDocument("Sample.txt", "UTF-8");
        textDocument.open();
        textDocument.decode();
        textDocument.edit();
        textDocument.encode();
        textDocument.save();

        Document imageDocument = new ImageDocument("Sample.jpg", "Base64");
        imageDocument.open();
        imageDocument.decode();
        imageDocument.edit();
        imageDocument.encode();
        imageDocument.save();
	}
}
