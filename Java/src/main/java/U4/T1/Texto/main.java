package U4.T1.Texto;

public class main {
    public static void main(String arg[]) {
        Texto txt = new Texto(20);

        /*Adding char test*/

        txt.add_char_start('o');
        txt.add_char_end('l');
        txt.add_char_end('a');
        txt.add_char_start('H');
        System.out.println(txt.cadena);

        /*Adding string test*/

        txt.add_str_start("Anda, ");
        System.out.println(txt.cadena);
        txt.add_str_end("Como estas?");
        System.out.println(txt.cadena);

        /*Vowel count test*/

        System.out.println(txt.vocal_count(txt.cadena));
    }
}
