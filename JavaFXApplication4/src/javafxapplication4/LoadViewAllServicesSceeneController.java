
package javafxapplication4;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Text;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.stage.FileChooser;


public class LoadViewAllServicesSceeneController implements Initializable {

 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void ReadEblCreditCardPdfButton(ActionEvent event) throws IOException {
        
           FileChooser forMasterCard = new FileChooser();
            forMasterCard.getExtensionFilters().add(new FileChooser.ExtensionFilter("PDF files", "*.pdf"));
            File f = forMasterCard.showSaveDialog(null);
            if(f!=null){              
                PdfWriter writePdfFormasterCard = new PdfWriter(new FileOutputStream(f));
                PdfDocument pdf =  new PdfDocument(writePdfFormasterCard);
                pdf.addNewPage();
                Document doc = new Document(pdf);
                doc.setLeftMargin(70);
                   String pdfText = "\n";
                Paragraph lineSpace = new Paragraph(pdfText);
                lineSpace.setHeight(8);
                
                pdfText =
                    "Forms to be submitted : \n "+
          "• BASIS Co-Branded Credit Card Recommendation form \n"+
          "• EBL Master Credit Card Application form  \n \n"+
          
           "Common Papers and documents to be submitted : \n"+
           "• Completed the application form \n"+
           "•  5 copies passport size photos (Recent) \n"+
           "•  Valid Passport copy \n"+
           "•  National ID card copy \n"+
           "•  2 Business cards of the cardholder \n \n"+
           "Papers needed for Sole Proprietorship / Partnership : \n"+
           "• Copy of latest Trade License.\n"+
           "• Copy of latest eTIN document. \n"+
           "• Copy of latest 6 months (original) bank statement.\n \n"+

           "Payment Details : \n"+
          "• Processing Fee- Tk. 2,500 by online through BASIS's designated payment channels.\n"+
          "• EBL Fee- As per EBL rules and regulations please follow MID (Most Important Documents) \n"+
          "• Audit Fee for each $6,000 transaction- Tk. 1,000 by online through BASIS's designated payment channels. (The rate is subject to change as per BASIS policy/regulatory guidelines etc. anytime with or without prior notification to the Cardholders)\n \n"+

          "Terms & Conditions :\n"+
          "a) International Alliance/Software Registration Fee\n"+
          "b) Domain Registration/Hosting Fee \n"+
          "c) Server Maintenance Fee \n"+
          "d) Account Verification/Remittance Test Fee \n "+
          "• The card holder company will be liable for any unauthorized transaction.\n"+
          "• BASIS have the right to change the rate of fees and add new terms & conditions if needed.\n"+
          "• If any card holder breaks the terms & conditions, BASIS will recommend the EBL to cancel the card.\n"+
          "• In case of cancelling BASIS membership the card will automatically be canceled \n";
                       
                        
                Paragraph para1 = new Paragraph(pdfText);
                
                Text titleText = new Text("Documents to be submitted for BASIS-EBL Mastercard :");
                titleText.setFontSize(18f);
                Paragraph pageTitle = new Paragraph(titleText);
                pageTitle.setBold();     
                doc.add(pageTitle);
                doc.add(lineSpace);
                doc.add(para1);
                doc.add(lineSpace);
                doc.add(lineSpace);
                 doc.close();
                 
               
         Alert downloadAlert = new Alert(Alert.AlertType.INFORMATION);
                downloadAlert.setContentText(" Download successful ");
                downloadAlert.showAndWait();    
             } 
            else{
                Alert cancelAlert = new Alert(Alert.AlertType.INFORMATION);
                cancelAlert.setContentText("Download cancelled!");
                cancelAlert.showAndWait();               
            } 
        
    
            
    }

    @FXML
    private void ReadBracBankCreditCardPdfButton(ActionEvent event) throws FileNotFoundException {
        
          FileChooser forBracBankCard= new FileChooser();
            forBracBankCard.getExtensionFilters().add(new FileChooser.ExtensionFilter("PDF files", "*.pdf"));
            File f = forBracBankCard.showSaveDialog(null);
            if(f!=null){              
                PdfWriter writePdforBracBankCard = new PdfWriter(new FileOutputStream(f));
                PdfDocument pdf =  new PdfDocument(writePdforBracBankCard);
                pdf.addNewPage();
                Document doc = new Document(pdf);
                doc.setLeftMargin(70);
                
                   String pdfText = "\n";
                Paragraph lineSpace = new Paragraph(pdfText);
                lineSpace.setHeight(8);
                
                pdfText =
                    "Forms to be submitted : \n "+
          "• BASIS Co-Branded Credit Card Recommendation form \n"+
          "•Most Important Document form (MID)   \n"+           
          "• • BASIS Co-Branded Credit Card Recommendation form  \n \n"+
          
     
           "Papers needed for Sole Partnership : \n"+
           "• Recent 2 passport size photographs with signature of cardholder & 2 business cards\n"+
           "• Up to date Trade License \n"+
           "• Last 12 months’ Bank Statement both Company & Personal \n"+
          "• Photocopy of Passport of proprietor \n"+
          "• Photocopy of National ID Card of proprietor\n"+
          "• eTIN Certificate \n \n"+
            
           "Papers needed for Partnership : \n"+
          "• Recent 2 passport size photographs & 2 business cards with signature of cardholder\n"+
          "• Up to date Trade License \n"+
          "• Partnership Deed \n"+
          "• Last 12 months’ Bank Statement both Company & Personal \n"+
          "•  Photocopy of Passport of the cardholder\n"+
          "• Photocopy of National ID Card of the cardholder \n"+
          "• TIN Certificate (Personal eTIN) \n"+
          "• Partnership Resolution authorizing the designated person to hold the special card \n \n"+
           
          "Payment Details :\n"+
          "• Processing Fee- Tk. 2,500 by online through BASIS's designated payment channels.\n"+
          "• BRAC Bank Fee- As per BRAC Bank rules and regulations please follow MID (Most Important Documents) \n"+
          "• Audit Fee for each $6,000 transaction- Tk. 1,000 by online through BASIS's designated payment channels. (The rate is subject to change as per \n"+
          "BASIS policy/regulatory guidelines etc. anytime with or without prior notification to the Cardholders) \n \n "+
                        
                        
          "Terms & Conditions :\n"+
          "a)International Alliance/Software Registration Fee\n"+
          "b)Domain Registration/Hosting Fee \n"+
          "c)Server Maintenance Fee \n"+
          "d)Account Verification/Remittance Test Fee \n "+
          "• The card holder company will be liable for any unauthorized transaction.\n"+
          "• BASIS have the right to change the rate of fees and add new terms & conditions if needed.\n"+
          "• If any card holder breaks the terms & conditions, BASIS will recommend the EBL to cancel the card.\n"+
          "• In case of cancelling BASIS membership the card will automatically be canceled \n";
                       
                        
                Paragraph para2 = new Paragraph(pdfText);
                
                Text titleText = new Text("Documents to be submitted for BASIS-BRAC Bank Credit Card :");
                titleText.setFontSize(18f);
                Paragraph pageTitle = new Paragraph(titleText);
                pageTitle.setBold();   
                doc.add(pageTitle);
                doc.add(lineSpace);
                doc.add(para2);
                doc.add(lineSpace);
                doc.add(lineSpace);
                 doc.close();
                 
               
         Alert downloadAlert = new Alert(Alert.AlertType.INFORMATION);
                downloadAlert.setContentText(" Download successful ");
                downloadAlert.showAndWait();    
             } 
            else{
                Alert cancelAlert = new Alert(Alert.AlertType.INFORMATION);
                cancelAlert.setContentText("Download cancelled!");
                cancelAlert.showAndWait();               
            } 
    }

    @FXML
    private void ReadRentalInfoPdfButton(ActionEvent event) throws FileNotFoundException {
        
        FileChooser forBracBankCard= new FileChooser();
            forBracBankCard.getExtensionFilters().add(new FileChooser.ExtensionFilter("PDF files", "*.pdf"));
            File f = forBracBankCard.showSaveDialog(null);
            if(f!=null){              
                PdfWriter writePdforBracBankCard = new PdfWriter(new FileOutputStream(f));
                PdfDocument pdf =  new PdfDocument(writePdforBracBankCard);
                pdf.addNewPage();
                Document doc = new Document(pdf);
                doc.setLeftMargin(70);
                
                   String pdfText = "\n";
                Paragraph lineSpace = new Paragraph(pdfText);
                lineSpace.setHeight(8);
                
                pdfText =
                    "BASIS Conference Hall Facilities : \n "+
          "• Air-conditioned room \n"+
          "• Board table with Chairs   \n"+           
          "• Sound system  \n"+
          "• Wiﬁ connection \n"+
          "• 64inch 4k Tv screen \n"+
          "• Portable Banner Frame(Height: 08 Feet x Wide: 06 Feet ) \n"+
                        
          
     
           "BASIS Auditorium Room Facilities : \n"+
           "• Air-conditioned Hall\n"+
           "• Sound system \n"+
           "• Wiﬁ connection \n"+
           "• Projector & screen \n"+
           "• Sitting arrangement\n"+
           "• Banner Frame(Height: 12 Feet x Wide: 7.5 Feet ) \n \n"+
            
           "BASIS Lounge : \n"+
          "• Air-conditioned Hall\n"+
          "• Sound system \n"+
          "• Wiﬁ connection \n"+
          "• Sitting arrangement \n"+
         
           
          "Payment Details :\n"+
          "• Processing Fee- Tk. 2,500 by online through BASIS's designated payment channels.\n"+
          "• BRAC Bank Fee- As per BRAC Bank rules and regulations please follow MID (Most Important Documents) \n"+
          "• Audit Fee for each $6,000 transaction- Tk. 1,000 by online through BASIS's designated payment channels. (The rate is subject to change as per \n"+
          "BASIS policy/regulatory guidelines etc. anytime with or without prior notification to the Cardholders) \n \n "+
                        
                        
          "Terms & Conditions :\n"+
          "a)International Alliance/Software Registration Fee\n"+
          "b)Domain Registration/Hosting Fee \n"+
          "c)Server Maintenance Fee \n"+
          "d)Account Verification/Remittance Test Fee \n "+
          "• The card holder company will be liable for any unauthorized transaction.\n"+
          "• BASIS have the right to change the rate of fees and add new terms & conditions if needed.\n"+
          "• If any card holder breaks the terms & conditions, BASIS will recommend the EBL to cancel the card.\n"+
          "• In case of cancelling BASIS membership the card will automatically be canceled \n";
                       
                        
                Paragraph para3 = new Paragraph(pdfText);
                
                Text titleText = new Text("BASIS Provides the facilities to use (on rent) its Board room, Auditorium and Lounge. Any BASIS member or any other organization can avail this facility :");
                titleText.setFontSize(18f);
                Paragraph pageTitle = new Paragraph(titleText);
                pageTitle.setBold();   
                doc.add(pageTitle);
                doc.add(lineSpace);
                doc.add(para3);
                doc.add(lineSpace);
                doc.add(lineSpace);
                
                float colWidthArr[] = {80f, 100f, 100f, 100f};
                Table RoomTable = new Table(colWidthArr); 
                
                Cell cell_00 = new Cell(); 
                RoomTable.addCell(cell_00);
                cell_00.add("Room/Hall");
                RoomTable.addCell(new Cell().add("Time Slot"));
                RoomTable.addCell(new Cell().add("BASIS Member"));
                RoomTable.addCell(new Cell().add("Non BASIS member"));
            
                RoomTable.addCell(new Cell().add("Conference Hall"));
                RoomTable.addCell(new Cell().add("Full day"));
                RoomTable.addCell(new Cell().add("Tk. 15,000"));
                RoomTable.addCell(new Cell().add("Tk. 20,000"));
                
                RoomTable.addCell(new Cell().add("Auditorium Room"));
                RoomTable.addCell(new Cell().add("Full day"));
                RoomTable.addCell(new Cell().add("Tk. 22,500"));
                RoomTable.addCell(new Cell().add("Tk. 30,000"));
            
                RoomTable.addCell(new Cell().add("Lounge"));
                RoomTable.addCell(new Cell().add("Full / Half Day"));
                RoomTable.addCell(new Cell().add("Tk. 7,500"));
                RoomTable.addCell(new Cell().add("Tk. 10,000"));

                doc.add(RoomTable);
                doc.add(lineSpace);
                
                String ContracInfo = "\n";
                Paragraph line = new Paragraph(ContracInfo);
                line.setHeight(10);
                
                ContracInfo =      
                " For more details, please contact with : \n"+
                "Ms.Fatematuze Johora Asha\n"+
                "Asst. Manager, HR & Administration\n"+
                "Cell: 01798323118\n"+
                "email: operation@basis.org.bd\n";
                  Paragraph para1 = new Paragraph(ContracInfo);
                
                 doc.add(para1);
            
                 doc.close();
                 
               
         Alert downloadAlert = new Alert(Alert.AlertType.INFORMATION);
                downloadAlert.setContentText(" Download successful ");
                downloadAlert.showAndWait();    
             } 
            else{
                Alert cancelAlert = new Alert(Alert.AlertType.INFORMATION);
                cancelAlert.setContentText("Download cancelled!");
                cancelAlert.showAndWait();               
            } 
    }

    @FXML
    private void ReadBankAsiaPreCardPdfButton(ActionEvent event) throws FileNotFoundException {
        
           FileChooser forMasterCard = new FileChooser();
            forMasterCard.getExtensionFilters().add(new FileChooser.ExtensionFilter("PDF files", "*.pdf"));
            File f = forMasterCard.showSaveDialog(null);
            if(f!=null){              
                PdfWriter writePdfFormasterCard = new PdfWriter(new FileOutputStream(f));
                PdfDocument pdf =  new PdfDocument(writePdfFormasterCard);
                pdf.addNewPage();
                Document doc = new Document(pdf);
                doc.setLeftMargin(70);
                   String pdfText = "\n";
                Paragraph lineSpace = new Paragraph(pdfText);
                lineSpace.setHeight(8);
                
                pdfText =
                    "Who can apply? : \n "+
          "• Individuals and firms involved in service exports in a non-physical form such as outsourcing, "
                        + "BPO, business services, professional services, software and web development, research and advisory services etc.\n \n"+
       
          
           "Defining the scope of Shadhin Freelancer Prepaid Card: \n"+
           "• Customers can park the payment (received through inward remittance) in USD account and "
           + "BDT account simultaneously. The account holder will have the option of retaining USD 70% and 30% BDT of the inward remittance in the foreign currency account, "
           + "or as applicable by Bangladesh Bank regulations. \n"+
           "• Customer can transfer the USD fund abroad from Shadhin Freelancer Prepaid Card through "
           + "wire transfer / and Demand Draft for bonafide business purpose \n"+
           "• Customer can use the International debit card issued against Shadhin Freelancer Prepaid Card \n"+
           "• Customer can earn interest on BDT Savings Shadhin Freelancer Prepaid Card according to prevailing interest rate \n"+
           "• Customer can enjoy reduced fee structure"
          +"• The applicant will need to obtain a testimonial from BASIS which will certify his/her genuineness and then fill in the bank’s prescribed forms. \n \n"+
           "For SHADHIN Freelancer Prepaid Card individual must submit the below documents:\n" +

           "• Duly filled up form.\n"+
           "• Photocopy of all issued National Identification papers(Passport, NID and Driving License). \n"+
           "• Individual TIN Certificate. \n"+
           "• 2 copies of passport size signed photo. \n"+
           "• Proof of outsourcing work. \n"+
           "• Proof of Income. \n"+
           "• Service charge: Tk. 3,000. \n \n"+

           "Payment Details : \n"+
          "• You have to pay the required amount for your product/service using the online payment gateway of BASIS. \n"+
          "• You may also pay the amount along with your online generated invoice from BASIS website to any branch of the Prime Bank Limited by "
                        + "Cash Deposit or Pay Order or Cheque (Acc. Name: BASIS, Acc. No: 2113317014064) \n"+
          "• After depositing the service charge, please share the bank depost slip to service@basis.org.bd\n \n";
  
                Paragraph para1 = new Paragraph(pdfText);
                
                Text titleText = new Text("BANK ASIA SHADHIN FREELANCER PREPAID CARD's Requirements:");
                titleText.setFontSize(18f);
                Paragraph pageTitle = new Paragraph(titleText);
                pageTitle.setBold();     
                doc.add(pageTitle);
                doc.add(lineSpace);
                doc.add(para1);
                doc.add(lineSpace);
                doc.add(lineSpace);
                 doc.close();
                 
               
         Alert downloadAlert = new Alert(Alert.AlertType.INFORMATION);
                downloadAlert.setContentText(" Download successful ");
                downloadAlert.showAndWait();    
             } 
            else{
                Alert cancelAlert = new Alert(Alert.AlertType.INFORMATION);
                cancelAlert.setContentText("Download cancelled!");
                cancelAlert.showAndWait();               
            } 
        
        
        
    }

    @FXML
    private void ReadSoftwareAndITservicesPdfButton(ActionEvent event) throws FileNotFoundException {
       
        
        FileChooser forMasterCard = new FileChooser();
            forMasterCard.getExtensionFilters().add(new FileChooser.ExtensionFilter("PDF files", "*.pdf"));
            File f = forMasterCard.showSaveDialog(null);
            if(f!=null){              
                PdfWriter writePdfFormasterCard = new PdfWriter(new FileOutputStream(f));
                PdfDocument pdf =  new PdfDocument(writePdfFormasterCard);
                pdf.addNewPage();
                Document doc = new Document(pdf);
                doc.setLeftMargin(70);
                   String pdfText = "\n";
                Paragraph lineSpace = new Paragraph(pdfText);
                lineSpace.setHeight(8);
                
                pdfText =
                    "Software Product and Service Catalogue 2021 : \n "+
          "•BASIS published the first Software Product Catalogue in Bangladesh in 2006 and gradually in 2011, 2014, 2017 & 2019 with the vision to address the need for "
                        + "information exchange between prospective software buyers and service providers. The first step towards this syndicated marketing approach included 151 products and services of 88 local software service providers categorized in 17 different business functions \n \n"+
           "Product & Service Catalogue 2021: \n"+
           "• Accounting & Financial Software \n"
           +
           "• POS, Inventory \n "
          +"• Marketing & Sales, IT Infrastructure \n"+
           "• Integrated Business Application & ERP \n"+
           "• Utility & Billing \n"+
           "• Office Management, Animation, Multimedia and Graphics\n"
          +"• Mobile Application \n" +
           "• Enterprise Content Management\n"+
           "• Transaction Processing \n"+
           "• E-Learning \n"+
           "• Micro Finance (MFI) Solution \n"+
           "• e-commerce & Web Portal, Customized Software Development & Others \n"+
           "• Web Development Service \n"+
           "• Capital Market Solution (Investment & Merchant Bank, Share Management)\n"+
           "• Education Institute Management Application \n"+
           "• Media Content Management System \n"+
           "• Security, Biometric & Alert Systems \n"+
          "Payment Details For BASIS Members: \n"+
          "• For the first entry/enlistment of your service or product - 5000 TK \n"+
          "• For the next consecutive entries - 3000 TK "+
                 "Payment Details  For Non-BASIS Members: \n"    
        + "• For the first Entry - 10000 TK \n"+
          "• For the next consecutive entries - 7500 TK \n \n"+
               
               "Payment Method:   \n "+     
          "• You have to pay the required amount for your product/service using the online payment gateway of BASIS.  \n"+
          "• Or you may also pay the amount along with your online generated invoice from BASIS website to any branch of the Prime Bank Limited by "
          + "Cash Deposit or Pay Order or Cheque (Acc. Name: BASIS, Acc. No: 2113317014064). "+
             
         "• BASIS will reserve the right to accept/edit/modify the entry or the content. The final format will be shared with the respective company before publishing the catalogue. \n" ;
                Paragraph para1 = new Paragraph(pdfText);
                Text titleText = new Text("SOFTWARE AND IT SERVICE CATALOGUE:");
                titleText.setFontSize(18f);
                Paragraph pageTitle = new Paragraph(titleText);
                pageTitle.setBold();     
                doc.add(pageTitle);
                doc.add(lineSpace);
                doc.add(para1);
                doc.add(lineSpace);
                doc.add(lineSpace);
                 doc.close();
                 
               
         Alert downloadAlert = new Alert(Alert.AlertType.INFORMATION);
                downloadAlert.setContentText(" Download successful ");
                downloadAlert.showAndWait();    
             } 
            else{
                Alert cancelAlert = new Alert(Alert.AlertType.INFORMATION);
                cancelAlert.setContentText("Download cancelled!");
                cancelAlert.showAndWait();               
            } 

        
        
    }

    @FXML
    private void ReadEdeliveryPdfButton(ActionEvent event) throws FileNotFoundException {
        
          FileChooser forMasterCard = new FileChooser();
            forMasterCard.getExtensionFilters().add(new FileChooser.ExtensionFilter("PDF files", "*.pdf"));
            File f = forMasterCard.showSaveDialog(null);
            if(f!=null){              
                PdfWriter writePdfFormasterCard = new PdfWriter(new FileOutputStream(f));
                PdfDocument pdf =  new PdfDocument(writePdfFormasterCard);
                pdf.addNewPage();
                Document doc = new Document(pdf);
                doc.setLeftMargin(70);
                   String pdfText = "\n";
                Paragraph lineSpace = new Paragraph(pdfText);
                lineSpace.setHeight(8);
                
                pdfText =
                    "Who can apply? : \n "+
          "•BAny organization registered or incorporated in Bangladesh and purchasing software through e-Delivery, can apply for this service. \n"+
           "• Accounting & Financial Software \n"
           +"Defining the scope of software through e-Delivery:\n"+
           "The following items will be considered to be under e-Delivery as software:  \n "
          +"• Software licenses with license key.  \n"+
           "• Any update of those licenses with renewal in form of annual maintenance fee.  \n"+
           "• Fees to be paid on usage/periodical/user basis for using Software as a service (SAAS) which are hosted outside Bangladesh instead of purchase of software license. \n \n"+
           " Submitting application with required documents: \n"
          +"The following are the required documents that the applicant needs to submit with the application online: \n" +
           "• Request letter from the remitting bank \n"+
           "• Duly filled out application form  \n"+
           "• Software product catalogue or brochure/link to the product description.  \n"+
           "• Delivery documents (Challan / Invoice / Certification of license key issuance/delivery notifications) in support to justify the media of e-Delivery of software  \n"+
           "• Any legal document of the supplier (to prove that the delivery is done by the software owner or proof of authorization in case the supplier is not the owner)  \n"+
           "• Legal document of the applicant (updated trade license and certificate of incorporation or updated BASIS membership for BASIS members)  \n"+
           "• Capital Market Solution (Investment & Merchant Bank, Share Management)\n"+
           "• Any other supporting document to justify e-Delivery  \n \n"+
                        
               "Payment: \n"   +      
           "• Service charges for non-members: \n"+
           "• Up to 5,000 $         - Tk. 10,000 \n"+
           "• 5,000 to 10,000 $  - Tk. 15,000 \n"+
           "• 10,000-50,000 $    - Tk. 20,000 \n"+
           "• For the next consecutive entries - 3000 TK "+
           "• 50,000-100,000 $  - Tk. 25,000 \n"    
         + "• 100,000+ $             - Tk. 30,000\n \n"+
           
               
               "Payment Method:   \n "+     
          "• You may pay the service charge through pay-order or cash deposit or cheque in favor of BASIS (from any Banks) and Bank deposit.   \n"+
          "• Bank Account Details: \n "
          + "Account Name: Bangladesh Association of Software & Information Services (BASIS). \n "+   
         "• Account No. 2113317014064 \n"+            
         "Prime Bank Limited\n" +
          "Kawran Bazar Branch\n" +
          "*** please submit the original deposit slip to BASIS office or as an attachment via email."       
                        ;
                Paragraph para1 = new Paragraph(pdfText);
                Text titleText = new Text("REMITTANCE AGAINST PURCHASE OF SOFTWARE THROUGH E-DELIVERY:");
                titleText.setFontSize(18f);
                Paragraph pageTitle = new Paragraph(titleText);
                pageTitle.setBold();     
                doc.add(pageTitle);
                doc.add(lineSpace);
                doc.add(para1);
                doc.add(lineSpace);
                doc.add(lineSpace);
                 doc.close();
                 
               
         Alert downloadAlert = new Alert(Alert.AlertType.INFORMATION);
                downloadAlert.setContentText(" Download successful ");
                downloadAlert.showAndWait();    
             } 
            else{
                Alert cancelAlert = new Alert(Alert.AlertType.INFORMATION);
                cancelAlert.setContentText("Download cancelled!");
                cancelAlert.showAndWait();               
            } 
    }
    
}
