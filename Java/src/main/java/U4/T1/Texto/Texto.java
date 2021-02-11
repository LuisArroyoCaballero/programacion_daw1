package U4.T1.Texto;

public class Texto {
    String cadena;
    int long_cad;

    public Texto(int long_cad) {
        setCadena("");
        setLong_cad(long_cad);
    }

    /*CADENA*/

    void setCadena(String cadena){
        this.cadena = cadena;
    }

    String getCadena(){
        return cadena;
    }

    /*LONG_CADENA*/

    void setLong_cad(int long_cad){
        this.long_cad = long_cad;
    }

    int getLong_cad(){
        return long_cad;
    }

    /*METHODS*/

    /*add_character(Start)*/

    void add_char_start(char character){
        if (cadena.length()+1<=this.long_cad){
            cadena = character + cadena;
        }
    }

    /*add_character(End)*/

    void add_char_end(char character){
        if (cadena.length()+1<=this.long_cad){
            cadena = cadena + character;
        }
    }

    /*add_string(Start)*/

    void add_str_start(String str){
        if (cadena.length() + str.length() <= this.long_cad){
            cadena = str + cadena;
        }
    }

    /*add_character(End)*/

    void add_str_end(String str){
        if (cadena.length() + str.length() <= this.long_cad){
            cadena = cadena + str;
        }
    }

    /*vocal_count*/

     boolean isVocal(char word){
        return "aeiou".contains(String.valueOf(word).toLowerCase());
    }

    int vocal_count(String cadena){
        int vocal_num = 0;
        for (int x = 0; x < cadena.length(); x++){
            char letraActual = cadena.charAt(x);
            if (isVocal(letraActual)){
                vocal_num++;
            }
        }
        return vocal_num;
    }
}
