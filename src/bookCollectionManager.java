import edu.uaslp.examen.Book;
import edu.uaslp.examen.BookCollection;

import java.util.ArrayList;

public class bookCollectionManager {

    private ArrayList listBookCollection;

    public BookCollection createCollection (String name){
        listBookCollection = new ArrayList();
        return listBookCollection;

    }
    public BookCollection getCollectionByName(String name){
        BookCollection newColletion = new BookCollection(name);
        if (newColletion);
    }
    public void deleteCollectionByName(String name){

    }

    public void addBookToCollection(String collectionName, Book book){

    }
}
