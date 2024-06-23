public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> lista = new ArrayList<>();

        lista.add(10);
        lista.add(20);
        lista.add(30);

        lista.remove(0);
        lista.set(2, 40);

        for(Integer numero: lista) {
            System.out.println(numero);
        }

        lista.contains(2);
    }
}
