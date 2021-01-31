package javatotural;

import java.util.ArrayList;
import java.util.List;

public class ManagerDocument {
    List<Document> documents;

    public ManagerDocument (){
        this.documents = new ArrayList<>();
    }

    public void addDocument(Document document){
        this.documents.add(document);
    }
}
