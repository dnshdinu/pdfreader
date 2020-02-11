package pdf;

import java.io.File;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

public class Pdf {
	

	
	public static void main(String[] args) throws Exception {
	
		 PDDocument pd = PDDocument.load(new File("C:\\Users\\Dineshkumar\\eclipse-workspace\\pdf\\EPSF_FORM12BB_003948.pdf"));
		System.out.println("Total pages:"+pd.getNumberOfPages());
		PDFTextStripper pdf = new PDFTextStripper();
	
		System.out.println(pdf.getText(pd));
	
	}
}
