public class ThreadParalelo extends Thread {
    String texto;
    public ThreadParalelo(String texto){
        this.texto = texto;
    }
    public void run() {
        System.out.println(i+":" + texto);
    }
}
