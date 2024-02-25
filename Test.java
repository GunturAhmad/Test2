public class Test {
    public class Main {
        public static void main(String[] args) throws InterruptedException {
            String text = "Hello, World!";
            
            for (int i = 0; i < text.length(); i++) {
                System.out.print(text.charAt(i)); // Cetak satu huruf
                Thread.sleep(100); // Jeda 1 detik
            }
        }
    }
    
}
