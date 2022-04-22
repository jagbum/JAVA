import java.util.Scanner;  // Scanner를 사용하기 위한 import문

class Main {  // Main 클래스 선언
  public static void main(String[] args) {  // main() 메소드 선언 
    Scanner scanner = new Scanner(System.in);  // Scanner객체 생성
    System.out.println("명품콘서트 예약 시스템입니다.");  // 명품콘서트 예약 시스템입니다. 출력 
    BookSystem book = new BookSystem();  // BookSystem객체 book 배열 생성
    
    for(int i=0; i <10 ; i++) {  // i가 0부터 9가 될 때까지 10번 반복 실행
      book.S[i] = "---";  // BookSystem클래스의 S[]배열의 i번째 S[i]를 ---로 설정
      book.A[i] = "---";  // BookSystem클래스의 A[]배열의 i번째 A[i]를 ---로 설정
      book.B[i] = "---";  // BookSystem클래스의 B[]배열의 i번째 B[i]를 ---로 설정
    }  // for문 종료

    while(true){  // while(true)를 사용하여 무한루프 시작
      System.out.print("예약:1,조회:2,  취소:3, 끝내기:4 >>");  //예약:1,조회:2,  취소:3, 끝내기:4 >> 출력 
      int choose = scanner.nextInt();  //choose 정수 읽기
      
      if(choose == 1) {  //choose가 1 일때 실핼
        System.out.print("좌석구분 S(1), A(2), B(3)>>");  //좌석구분 S(1), A(2), B(3)>> 출력
        int seat = scanner.nextInt();  // seat 정수 읽기
        
        if(seat == 1){  // seat가 1일때 실행
          System.out.print("S>> ");  // S>> 츨력
          book.reserv(book.S);  // BookSystem클래스의 reserv메소드를 사용하여 B배열의 선택한 자리에 예약
        }  // if(seat == 1)종료

        if(seat == 2){  // seat가 2일때 실행
          System.out.print("A>> ");  // A>> 츨력
          book.reserv(book.A);  // BookSystem클래스의 reserv메소드를 사용하여 B배열의 선택한 자리에 예약
        }  // if(seat == 2)종료

        if(seat == 3){  // seat가 3일때 실행
          System.out.print("B>> ");  // B>> 츨력
          book.reserv(book.B);  // BookSystem클래스의 reserv메소드를 사용하여 B배열의 선택한 자리에 예약
        }  // if(seat == 3)종료
      }  // if(choose == 1) 종료

      else if(choose == 2) {  // choose가 2 일때 실핼
        book.search();  // BookSystem클래스의 search메소드를 사용하여 현재 모든 좌석의 상태확인
        System.out.println("<<<조회를 완료하였습니다.>>>");  // <<<조회를 완료하였습니다.>>> 출력하고 행변경
      }  // if(choose == 2) 종료

      else if(choose ==3) {  // choose가 3 일때 실핼
        System.out.print("좌석 S:1, A:2, B:3>>");  // 좌석 S:1, A:2, B:3>> 출력
        int cancelseat = scanner.nextInt();  // cancelseat 정수 읽기
        
        if(cancelseat ==1){  // cancelseat이 1일때 실행
          System.out.print("S>> ");  // S>>  출력
          book.cancelReserv(book.S);  // BookSystem클래스의 cancelseat메소드를 사용하여 S배열에 입력된 이름의 사람을 찾아 예약을 취소
        }  // if(cancelseat ==1) 종료

        if(cancelseat ==2){  // cancelseat이 2일때 실행
          System.out.print("A>> ");  // A>>  출력
          book.cancelReserv(book.A);  // BookSystem클래스의 cancelseat메소드를 사용하여 A배열에 입력된 이름의 사람을 찾아 예약을 취소
        }  // if(cancelseat ==1) 종료

        if(cancelseat ==3){  // cancelseat이 3일때 실행
          System.out.print("B>> ");  // B>>  출력
          book.cancelReserv(book.B);  // BookSystem클래스의 cancelseat메소드를 사용하여 B배열에 입력된 이름의 사람을 찾아 예약을 취소
        }  // if(cancelseat ==3) 종료
      } // if(choose ==3) 종료
      
      else if(choose ==4) break; // cancelseat이 4일때 실행하여 프로그램 종료
      else System.out.println("잘못 입력하셨습니다."); // choose가 1,2,3,4가 아닐때 잘못 입력하셨습니다. 출력하고 행변경
    } // while문 종료
  } // main() 메소드 끝
}  // Main클래스 끝