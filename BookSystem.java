import java.util.Scanner; // Scanner를 사용하기 위한 import문

class BookSystem{ // BookSystem 클래스 선언
  Scanner scanner = new Scanner(System.in); // Scanner객체 생성

  String S[] = new String[10]; // String타입 배열 S생성
  String A[] = new String[10]; // String타입 배열 A생성
  String B[] = new String[10]; // String타입 배열 B생성
  public BookSystem() {} // 생성자

  public void book(String character, int n, String e[]) { // String character, int n, String e[]의 자리에 각각의 값을 입력받아 그에 맞는 배열의 자리에 입력된 이름을 예약하는 메소드 선언
    e[n-1] = character;  // 배열 e의 n-1 번째 자리에 character로 설정
  }  // book 메소드 선언 종료

  public void show(String e[]){  // String e[]의 자리에 배열을 입력받아 입력받은 배열을 출력하는 메소드 선언
    for(int i =0; i<10; i++){  // i가 0부터 9가 될 때까지 10번 반복 실행
      System.out.print(e[i]+" ");  // e[i]의 값을 출력하고 한칸 뛰우기 
    } //for문 끝
    System.out.println("");  // 행변경
  }  // show 메소드 선언 종료

  public void search(){  // S,A,B 의 모든 배열을 출력하는 메소드 선언
    System.out.print("S>> ");  // S>> 출력
    show(S);  // 배열 S를 출력하는 show 메소드 실행
    System.out.print("A>> ");  // A>> 출력
    show(A);  // 배열 A를 출력하는 show 메소드 실행
    System.out.print("B>> ");  // B>> 출력
    show(B);  // 배열 B를 출력하는 show 메소드 실행
  }  // search 메소드 선언 종료
  
  public void cancel(String name, String e[]) {  // String name, String e[]의 자리에 값을 입력받아 입력된 배열에서 입력된 이름을 찾아 예약을 취소하는 메소드 선언
    for(int i=0; i < 10 ; i++){  // i가 0부터 9가 될 때까지 10번 반복 실행
      if(e[i].equals(name)) e[i] = "---";  // e[i]의 값을 name과 비교하여 같으면 e[i]의 값을 ---로 설정
    }  // for문 끝
  }  // cancel 메소드 선언 종료

  public void reserv(String e[]){ // 입력된 배열에 이름과 번호를 입력받아서 예약하는 메소드 선언
    show(e); // 입력된 배열을 출력하는 show메소드 실행
    System.out.print("이름>>"); // 이름>> 출력
    String bookpeople = scanner.next(); // bookpeople String값 읽기
    System.out.print("번호>>"); // 번호>> 출력
    int booknumber = scanner.nextInt(); // booknumber 정수값 읽기
    book(bookpeople,booknumber, e);  // bookpeople,booknumber, e를 입력받아 입력된 자리에 입력된 이름을 예약하는 book메소드 실행
  } // reserv 메소드 선언 종료

  public void cancelReserv(String e[]){  // 입력된 배열에 이름과 번호를 입력받아서 예약을 취소하는 메소드 선언
    show(e);  // 입력된 배열을 출력하는 show메소드 실행
    System.out.print("이름>>");  // 이름>> 출력
    String cancelpeople = scanner.next();  // cancelpeople String값 읽기
    cancel(cancelpeople, e);  // cancelpeople, e를 입력된 배열에서 입력되 이름을 찾아 예약을 취소하는 cancel메소드 실행
  }  // cancelReserv 메소드 선언 종료
}  // BookSystem 클래스 선언 종료