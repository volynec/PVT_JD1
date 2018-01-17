package task_12;

/**
 * Created by user on 02.01.2018.
 * Заменить все грустные смайлы :( в строке на весёлые :)
 */
public class PracticeTwo {
    public static void main(String[] args) {
        String str = "This( (   (method( returns( a( string( derived( from( this( string( by( replacing( every( occurrence( of( oldChar( with( newChar((.";
        String replaceStr = str.replace('(', ')');
        System.out.println(str);
        System.out.println(replaceStr);
    }
}
