package controller;

import model.BookModel;
import model.dto.Book;
import view.FailView;
import view.SuccessView;

public class BookController {
	public static void bookOne(String isbn) {
		try {
			Book book = BookModel.bookOne(isbn);
			SuccessView.printBook(book);
		} catch (Exception e) {
			e.printStackTrace();
			FailView.messageView(e.getMessage());
		}
	}
	
	
//	isbn이 들어와서 성공하면 printbook
//	실패하면 FailView에 메시지발생
}
