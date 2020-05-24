import static org.junit.jupiter.api.Assertions.*;

class CipherTest {
 char [] letter= ['a'];
    public  String Encrypt(String message, int key){
        String alphabet ="abcdefgjhijklmnopqrsuvwxyz";
        String alphabet2 = alphabet.toUpperCase();
        StringBuilder encrypted = new StringBuilder(message);
        for (int k=0; k< encrypted.length();  k++){char currchar= encrypted.charAt(k);    int index = alphabet.indexOf(currchar);}
        if (index ! = -1){
    }
        public static void main(String[] args) {

            mainloop:

            while (true) {
                switch (Cipher.CipherApp.mainMenu()) {
                    case 1: System.out.println("Encrypt selected");
                        Cipher.CipherApp.encryptString();
                        break;
                    case 2: System.out.println("Decrypt selected");
                        Cipher.CipherApp.decryptString();
                        break;
                    case 3: System.out.println("Value has been  selected");
                        Cipher.CipherApp.setShiftValue();
                        break;
                    case 4: System.out.println(" Thank you"); break mainloop;
                };
            }

        }