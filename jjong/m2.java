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
    System.out.println("[��ȭ ���� ���α׷�]");
    System.out.println("1.��ȭ ���� �Է�");
    System.out.println("2.��ȭ ���� �˻�");
    System.out.println("3.���� ����");
    System.out.println("4.���� ����");
    System.out.println("5.����");
    System.out.println();
    System.out.println("�޴��� �����ϼ���:");
    menu = scan.nextInt();
   }while(menu < 1 || menu > 5);
   
   switch(menu){
   case 1:
    if(i == 10)
     System.out. println("���̻� �Է��� �� �����ϴ�");
    else
    {
     //System.out.println("��ȭ ���� �Է�");
        movie[i] = new MovieView();
        scan.nextLine();//nextInt�� ������ �ذ��� ����
        System.out.print("����: ");
        movie[i].title = scan.nextLine();
        System.out.print("����: ");
        movie[i].director = scan.nextLine();
        System.out.print("�帣: ");
        movie[i].genre = scan.nextLine();
        System.out.print("�⵵: ");
        movie[i].year = scan.nextInt();
        i++;
    }
    break;
   case 2:
    //scan.nextLine();
    //System.out.println("������ �Է����ּ���: ");
    
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
    System.out.println("��ȭ������ movieinfo.txt���Ͽ� ����Ǿ����ϴ�.");
    break;
   case 4:
    System.out.println("movieinfo.txt���Ͽ� �ִ� ������");
    ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("movieinfo.txt"));
    i = ois2.readInt();
    for(int j = 0; j < i; j++){
     movie[j] = (MovieView)ois2.readObject();
     System.out.println(movie[j].title + " " + movie[j].director + " " + movie[j].genre + " " + movie[j].year);
    }
    ois2.close();
    break;
   case 5:
    System.out.println("���α׷��� ����Ǿ����ϴ�.");
   }
  }while(menu != 5);
 }
}

