import java.util.ArrayList;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>() {
            {
                add("yamda");
                add("yasuda");
                add("suzuki");
                add("ida");
                add("tanaka");
                add("okuda");
                add("onda");
            }
        };

        //処理前のリストを表示
        System.out.println("--------------------------------------------------");
        System.out.println("処理前のリスト");
        System.out.println(names);
        System.out.println("--------------------------------------------------");

        //Listを大文字に変換して表示
        System.out.println("大文字に変換");
        names.stream().map(String::toUpperCase).forEach(System.out::println);
        System.out.println("--------------------------------------------------");

        //"i"を含む名前のみ表示
        System.out.println("iを含む名前のみ表示");
        names.stream().filter(name -> name.contains("i")).forEach(System.out::println);
        System.out.println("--------------------------------------------------");

        //名前の並べ替え
        System.out.println("名前をソートして表示");
        names.stream().sorted().forEach(System.out::println);
        System.out.println("--------------------------------------------------");
    }
}
