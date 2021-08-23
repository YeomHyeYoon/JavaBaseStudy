package ch21;

public class ObjectCopyTest {
	
	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		for(int i=0 ; i< library.length ; i++) {
		
			library[i] = new Book("태백산맥"+(i+1),"조정래");
		}
		
		// 얕은복사. 같은 인스턴스 가르킴
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		System.out.println("=== library ===");
		
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println();
		System.out.println("=== Copylibrary ===");
		
		for(Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
		
	}

}
