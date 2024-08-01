package coding_test._06Sort_Search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Point implements Comparable<Point> {
    public int x, y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x){
            // this -> o 로 오름차순 정렬되게 하려면 무조건 음수값을 리턴시킨다.
            // 반대로 o -> this 로 내림차순 정렬 하게 하려면 똑같이 음수값을 리턴시키지만 순서를 바꾼다
            return this.y - o.y;
            // return o.y - this.y;
        } else {
            return this.x - o.x;
            // return o.x - this.x;
        }
    }
}

class Main7{
}
public class Sort_07 {
    public static void main(String[] args) {
        Main7 T = new Main7();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Point> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            list.add(new Point(x, y));
        }
        // 여기서 Collections.sort(list)를 하면 위에서 override 한 compareTo 메소드로 정렬을 한다.
        Collections.sort(list);
        for (Point o : list) {
            System.out.println(o.x + " " + o.y);
        }
    }
}
