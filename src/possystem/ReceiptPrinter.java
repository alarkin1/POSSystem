package possystem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alex
 */
public class ReceiptPrinter {

    OutputStrategy outputMethod;

    public ReceiptPrinter(OutputStrategy outputMethod) {
        this.outputMethod = outputMethod;
    }

    public void printReceipt(String receiptText) {
        outputMethod.outputText(receiptText);
    }
}
