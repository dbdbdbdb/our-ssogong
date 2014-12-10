import java.util.*;
import java.io.*;
class MovieView implements Serializable{
 public String title;
 public String director;
 public String genre;
 public int year;

}
public class m2 {
 public static void main(String[] args) throws Exception{
  // TODO Auto-generated method stub
  MovieView[] movie = new MovieView[10];
  //String[] moviename = new String[10];
  int i = 0, a = 0, menu;
  Scanner scan = new Scanner(System.in);
  Scanner scanner = new Scanner(System.in);
  do{
   do{
    System.out.println("[영화 정보 프로그램]");
    System.out.println("1.영화 정보 입력");
    System.out.println("2.영화 정보 검색");
    System.out.println("3.파일 저장");
    System.out.println("4.파일 열기");
    System.out.println("5.종료");
    System.out.println();
    System.out.println("메뉴를 선택하세요:");
    menu = scan.nextInt();
   }while(menu < 1 || menu > 5);
   
   switch(menu){
   case 1:
    if(i == 10)
     System.out. println("더이상 입력할 수 없습니다");
    else
    {
     //System.out.println("영화 정보 입력");
        movie[i] = new MovieView();
        scan.nextLine();//nextInt의 문제점 해결을 위해
        System.out.print("제목: ");
        movie[i].title = scan.nextLine();
        System.out.print("감독: ");
        movie[i].director = scan.nextLine();
        System.out.print("장르: ");
        movie[i].genre = scan.nextLine();
        System.out.print("년도: ");
        movie[i].year = scan.nextInt();
        i++;
    }
    break;
   case 2:
    //scan.nextLine();
    //System.out.println("제목을 입력해주세요: ");
    
    String mname = scanner.nextLine();
    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("movieinfo.txt"));
 a = ois.readInt();
 for(int j = 0; j < a; j++)
      movie[j] = (MovieView)ois.readObject();
 //ois.close();
    for(i = 0; i < a; i++){
     if((movie[i].title).equals(mname))
      System.out.println(movie[i].title + " " + movie[i].director + " " + movie[i].genre + " " + movie[i].year); 
    }
    ois.close();
    break;
   case 3:
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("movieinfo.txt"));
    oos.writeInt(i);
    for(int j = 0; j < i; j++)
     oos.writeObject(movie[j]);
    oos.close();
    System.out.println("영화정보가 movieinfo.txt파일에 저장되었습니다.");
    break;
   case 4:
    System.out.println("movieinfo.txt파일에 있는 정보는");
    ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("movieinfo.txt"));
    i = ois2.readInt();
    for(int j = 0; j < i; j++){
     movie[j] = (MovieView)ois2.readObject();
     System.out.println(movie[j].title + " " + movie[j].director + " " + movie[j].genre + " " + movie[j].year);
    }
    ois2.close();
    break;
   case 5:
    System.out.println("프로그램이 종료되었습니다.");
   }
  }while(menu != 5);
 }
}

