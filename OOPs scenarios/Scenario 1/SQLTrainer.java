public class SQLTrainer extends Trainer {

    public static void main(String[] args) {
        SQLTrainer reversi =new SQLTrainer();
        System.out.println(reversi.dept);
        System.out.println(reversi.institute);
        reversi.training();
        System.out.println(reversi.getSalary());
    }
}
