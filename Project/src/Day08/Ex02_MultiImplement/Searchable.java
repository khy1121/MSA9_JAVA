package Day08.Ex02_MultiImplement;


//검색인터페이스

public interface Searchable {
	//채널 검색 
	//: 검색어에 해당하는 채널번호를 반환
	int channelSearch(String keyword); 
	
	//컨텐츠 검색
	// : 검색어에 해당하는 컨텐츠를 반환
	String[] contentSearch(String keyword);
}
