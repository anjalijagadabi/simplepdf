package document;

import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

public class Simplepdf {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		 PDDocument document = new PDDocument();
		 for (int i=0; i<10; i++)
		 {
			 PDPage blankPage = new PDPage();
			 document.addPage( blankPage );

		 }
		 document.save("E:\\java\\simplepdf/my_doc.pdf");
	      System.out.println("PDF created");
	      document.close();
	}

}
