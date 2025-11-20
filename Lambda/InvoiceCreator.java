import java.util.*;
import java.util.stream.*;

class Invoice {
    String txnId;
    Invoice(String id) { txnId = id; }
    public String toString() { return "Invoice for " + txnId; }
}

public class InvoiceCreator {
    public static void main(String[] args) {
        List<String> transactionIds = Arrays.asList("TXN01", "TXN02", "TXN03");
        List<Invoice> invoices = transactionIds.stream().map(Invoice::new).toList();
        invoices.forEach(System.out::println);
    }
}
