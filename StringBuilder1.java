public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("india is my country");
        sb.replace(0, 5,"thiss");
        // sb.reverse();
        String str = sb.substring(13);
        System.out.println(sb);
        System.out.println(str);
        sb.setCharAt(11, 'f');
        System.out.println();
        sb.deleteCharAt(14);
        System.out.println(sb);

        sb.delete(8,12);
        System.out.println(sb);

    }
}
